public class AsciiArt {
    char[][] img;
    int height;
    int width;

    // constructor
    public AsciiArt(char[][] img) {
        this.img = img;
        this.height = img.length;
        this.width = img[0].length;
    }

    public AsciiArt(String art, int n_rows, int n_cols) {
        this.img = paintObject(art, n_rows, n_cols);
        this.height = n_rows;
        this.width = n_cols;
    }

    // generate new copy from original already processed
    public AsciiArt(AsciiArt original) {
        this.img = original.img;
        this.height = original.height;
        this.width = original.width;
    }

    private static char[][] paintObject(String characters, int n_rows, int n_cols) {
      char[] squashed_object = characters.toCharArray();
      char[][] img = new char[n_rows][n_cols];
      int k = 0;

      for(int i = 0; i < n_rows; i++) {
         for(int j = 0; j < n_cols; j++) {
            img[i][j] = squashed_object[k];
            k++;
         }
      }

      return img;

   }

    public void resize(int width2) {
        // only resizing upwards for now
        // add some columns, only worth repeating the pattern n times if possible.
        if (width2 / width > 1) {
            char[][] newImg = new char[height][width2];
            for (int i = 0; i < height; i++) {
                // copy existing pattern only if it fits
                for (int j = 0; j < width2 && j / width < (width2 / width); j++) {
                    newImg[i][j] = img[i][j % width]; // next to itself
                }
                // #3. fill the rest with empty space if the image is narrower than IMAGE_WIDTH
                for (int j = (width2 / width) * width; j < width2; j++) {
                    newImg[i][j] = ' ';
                }
            }
            this.img = newImg;
            this.width = width2;
        }

    }

    char[][] getImg() {
        return this.img;
    }

    static AsciiArt getWidestArt(AsciiArt[] asciis) {
        if (asciis.length == 0) {
            return null;
        }
        AsciiArt widest = asciis[0];
        for (AsciiArt art : asciis) {
            if (art.width > widest.width) {
                widest = art;
            }
        }
        return widest;
    }

    // really only for debugging
     void printArt() {
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                System.out.print(this.img[i][j]);
            }
            System.out.println();
        }
    }

}
