public class Halloween {
    static final String squashed_ghost = "   .---.     '     '   | o   o |  |   ~   | <|       |> |       \\_  \\       /    -----' ";
    public static void main(String[] args) throws Exception {
        char[][] ghost = makeObject(squashed_ghost, 8, 11);
        printObject(ghost, 0);
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
