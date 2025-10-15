import java.util.Random;

public class Halloween {
    static final String squashed_ghost1 = "   .---.     '     '   | o   o |  |   ~   | <|       |> |       \\_  \\       /    -----' ";
    static final String squashed_ghost2 = "   .---.     '     '   | @   @ |  |   U   | <|       |> |       \\_  \\       /    -----' ";
    static final Random rand = new Random();
    public static void main(String[] args) throws Exception {
        char[][] ghost1 = makeObject(squashed_ghost1, 8, 11);
        char[][] ghost2 = makeObject(squashed_ghost2, 8, 11);

        while (true){

            double roll = rand.nextDouble(0,1);
            if (roll < 0.5){
                printObject(ghost1, rand.nextInt(0,109));
            }else{
                printObject(ghost2, rand.nextInt(0,109));
            }
            
            Thread.sleep(200);
        }
    }

    static char[][] makeObject(String characters, int n_rows, int n_cols){ //make 2D array of static art given its squashed version and dimensions
        char[] squashed_object = characters.toCharArray(); //convert string to array
        char[][] object = new char[n_rows][n_cols]; //declare & initialize array that will be returned

        int k = 0; //index of squashed_object
        for (int i = 0; i < n_rows; i++){ //fill the "object" array with the characters from squashed_object
            for(int j = 0; j < n_cols; j++){
                object[i][j] = squashed_object[k];
                k++;
            }
        }

        return object;
    }

    static void printObject(char[][] object, int shift){ //print out static art starting at a specific column
        for(int i = 0; i < object.length; i++){

            for(int k = 0; k < shift; k++){//shift row (shift) spaces to the right
                System.out.print(' ');
            }
    
            for(int j = 0; j< object[0].length; j++){ //print entire row
                System.out.print(object[i][j]);
            }
            
            System.out.println();

        }
    }
}
