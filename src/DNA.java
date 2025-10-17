import java.util.Random;

public class DNA {
    
    static final Random rand = new Random();
    static char[][] gene = new char[11][15];
    static final int geneWidth = gene[0].length;
    static char[][] painting = new char[11][120];
    public static void main(String[] args) throws Exception{

        blankCanvas();

        while(true){
            makeGene();
            loadGene();
            for(int i = 0; i < painting.length; i++){
                printRow(i);
                Thread.sleep(60);
            }
        }

    } 

    static void blankCanvas(){
      for(int i = 0; i < 11; ++i) {
         for(int j = 0; j < 120; ++j) {
            painting[i][j] = '\'';
         }
      }
    }

    static void loadGene(){ //updates painting based off generated gene array
        int generow = 0;
        int genecol = 0;
        for(int i = 0; i < painting.length; i++){
            for(int j = 52; j< 52+15; j++){
                painting[i][j] = gene[generow][genecol];
                genecol++;
            }
            genecol = 0;
            generow++;
        }
    }

    static void makeGene(){ //creates array of one segment of the DNA helix
        for(int i = 0; i < gene.length; i++){ //first fill array with (') character
            for (int j = 0; j < geneWidth; j++){
                gene[i][j] = '\'';
            }
        }

        gene[0][7] = '0'; //first layer

        for(int row = 1; row < gene.length; row++){ //for the rest of the layers
            
            int start = 0; //how far to the left the sides of each layer are
            
            if (row == 1|| row == 10){
                start = 4;
            } else if (row == 2|| row == 9){
                start = 2;
            } else if (row == 3 || row == 8){
                start = 1;
            }

            //DNA "sugar-phosphate backbone"
            gene[row][start] = '0';
            gene[row][start+1] = '0';

            gene[row][geneWidth - start-1] = '0';
            gene[row][geneWidth - start -2] = '0';

            //DNA nitrogenous bases with randomly generated lengths
            if(row == 2 || row == 4 || row == 5 || row == 7 || row == 9){
                for (int col = start + 2; col < geneWidth-start-1; col++){
                    gene[row][col] = '=';
                }

                gene[row][rand.nextInt(start+2, geneWidth-start-1)] = '.';
            }
        }
    }

    static void printRow(int index) {
      for(int col = 0; col < 120; ++col) {
         System.out.print(painting[index][col]);
      }

      System.out.println();
   }

}
