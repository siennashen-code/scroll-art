import java.util.Random;

public class AsciiArtWithClasses {
    static final Random rand = new Random();

    static final String squashed_ghost1 = "   .---.     '     '   | o   o |  |   ~   | <|       |> |       \\_  \\       /    -----' ";

    static AsciiArt[] gallery = { 
        new AsciiArt(squashed_ghost1, 8, 11), 
        new AsciiArt(ArtMethods.getBear()), 
        new AsciiArt(ArtMethods.getElephant()),
        new AsciiArt(ArtMethods.getGem())};
    static AsciiArt widestArt = AsciiArt.getWidestArt(gallery);

    static char[][] painting = new char[15][120];
    static int col = 0;

    public static void main(String[] args) throws Exception {
        
        initPainting();
        AsciiArt art = gallery[rand.nextInt(0, gallery.length)];
        

        while (true) {

            if (isEmpty(painting[0])) {
                int nextEmptySpace = 0;

                for (int col = 0; col < 120; col++) {
                    if (rand.nextDouble(0, 1) > 0.7 && col > nextEmptySpace){
                        art = gallery[rand.nextInt(0, gallery.length)];
                        if (col + art.width <= 120){
                            loadIn(art,col);
                            nextEmptySpace = col + art.width;
                        }
                    }
                }
            }

            printRow(painting);
            shiftUp(painting);
            Thread.sleep(50);

        }

    }

    static void initPainting(){
        for (int i = 0; i < painting.length; i++){
            for (int j = 0; j< painting[0].length; j++){
                painting[i][j] = ' ';
            }
        }
    }

    static boolean isEmpty(char[] row) {
        for (int i = 0; i < row.length; i++) {
            if (row[i] != ' ') {
                return false;
            }
        }

        return true;
    }

    static void loadIn(AsciiArt art, int col) {
        for (int i = 0; i < art.height; i++) {
            for (int j = 0; j < art.width; j++) {
                painting[i][j + col] = art.img[i][j];
            }
        }
    }

    static void printRow(char[][] array) {
        for (int j = 0; j < array[0].length; j++) {
            System.out.print(array[0][j]);
        }
        System.out.println();
    }

    static void shiftUp(char[][] array) {
        char[] emptyRow = new char[array[0].length];
        for (int i = 0; i < emptyRow.length; i++) {
            emptyRow[i] = ' ';
        }

        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        array[array.length - 1] = emptyRow;
    }

}
