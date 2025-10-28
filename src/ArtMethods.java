public class ArtMethods {

    public static char[][] getBear() { //Anushas bear
        char[][] img = new char[8][12];
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 12; x++) {
                img[y][x] = ' ';
            }
        }
        // bear
        img[0][2] = '\u26E7';
        img[1][2] = '\u028C';
        img[2][1] = '/';
        img[2][3] = '\\';
        img[3][0] = '@';
        img[3][1] = '_';
        img[3][2] = '_';
        img[3][3] = '_';
        img[3][4] = '@';
        img[4][0] = '(';
        img[4][1] = '-';
        img[4][2] = '_';
        img[4][3] = '-';
        img[4][4] = ')';
        img[5][1] = '-';
        img[5][2] = '-';
        img[5][3] = '-';
        img[5][0] = '<';
        img[5][4] = '>';
        img[6][0] = '/';
        img[6][1] = '|';
        img[6][3] = '|';
        img[6][4] = '\\';
        img[6][5] = '/';
        img[7][0] = '~';
        img[7][1] = '~';
        img[7][2] = '~';
        img[7][3] = '~';
        img[7][4] = '~';
        img[7][5] = '~';
        img[7][7] = 'A';
        img[7][8] = 'G';

        // speech bubble
        img[4][7] = '<';
        img[4][9] = 'h';
        img[4][10] = 'i';
        img[4][11] = ')';
        img[5][9] = '\uFE36';
        
        return img;
    }

    public static char[][] getElephant() { //Yiannis' elephant
        char[][] img = new char[9][20];
        // fill with empty space
        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 20; x++) {
                img[y][x] = ' ';
            }
        }
        // then fill individual characters
        img[0][14] = '_';
        img[1][5] = '(';
        img[1][6] = ')';
        img[1][13] = '|';
        img[1][14] = '~';
        img[1][15] = '|';
        img[2][4] = '/';
        img[2][5] = '|';
        img[2][6] = '|';
        img[2][7] = '\\';
        img[2][13] = '|';
        img[2][14] = '~';
        img[2][15] = '|';
        img[2][10] = '_';
        img[2][11] = '_';
        img[3][5] = '/';
        img[3][6] = '\\';
        img[3][9] = '/';
        img[3][12] = '\\';
        img[3][13] = '~';
        img[3][14] = '~';
        img[3][15] = '~';
        img[3][16] = '\\';
        img[2][17] = '_';
        img[2][18] = '_';
        img[3][19] = '\\';
        img[4][3] = ',';
        img[4][4] = '-';
        img[4][5] = '-';
        img[4][6] = '-';
        img[4][7] = '-';
        img[4][8] = '(';
        img[4][13] = '-';
        img[4][15] = '-';
        img[4][19] = ')';
        img[5][2] = '/';
        img[5][18] = '/';
        img[6][1] = '/';
        img[6][3] = '|';
        img[6][12] = '(';
        img[6][13] = '\\';
        img[6][16] = '|';
        img[6][17] = '(';
        img[7][0] = '^';
        img[7][3] = '\\';
        img[7][0] = '^';
        img[7][7] = '/';
        img[7][8] = '_';
        img[7][9] = '_';
        img[7][10] = '\\';
        img[7][13] = '/';
        img[7][14] = '\\';
        img[7][16] = '|';
        img[8][4] = '|';
        img[8][5] = '_';
        img[8][6] = '_';
        img[8][7] = '|';
        img[8][10] = '|';
        img[8][11] = '_';
        img[8][12] = '_';
        img[8][13] = '|';
        img[8][14] = '-';
        img[8][15] = '"';

        return img;
    }

    public static char[][] getGem () { //Rohan's diamond
        char[][] img = new char[8][10];
        for (int y = 0; y < 8; y = y + 1) {
            for (int x = 0; x < 10; x = x + 1) {
                img[y][x] = ' ';
            }
        }
        img[0][2] = '_';
        img[0][3] = '_';
        img[0][4] = '_';
        img[0][5] = '_';
        img[0][6] = '_';
        img[0][7] = '_';

        img[1][1] = '/';
        img[1][2] = '_';
        img[1][3] = '_';
        img[1][4] = '_';
        img[1][5] = '_';
        img[1][6] = '_';
        img[1][7] = '_';
        img[1][8] = '\\';

        img[2][0] = '/';
        img[2][1] = '/';
        img[2][3] = 'R';
        img[2][4] = 'R';
        img[2][8] = '\\';
        img[2][9] = '\\';

        img[3][0] = '\\';
        img[3][1] = '\\';
        img[3][8] = '/';
        img[3][9] = '/';

        img[4][1] = '\\';
        img[4][2] = '\\';
        img[4][5] = 'R';
        img[4][6] = 'R';
        img[4][7] = '/';
        img[4][8] = '/';

        img[5][2] = '\\';
        img[5][3] = '\\';
        img[5][6] = '/';
        img[5][7] = '/';

        img[6][3] = '\\';
        img[6][4] = '\\';
        img[6][5] = '/';
        img[6][6] = '/';

        img[7][4] = '\\';
        img[7][5] = '/';

        return img;
    }

}
