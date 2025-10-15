import java.util.Random;

public class Waves {
    
    static final Random rand = new Random();
    public static void main(String[] args) throws Exception{
        
        double numstars = 1;
        double change = 1;

        while(true){

           
            for(int i = 0; i < numstars; i++){
                System.out.print('*');
            }
            System.out.println();

            if (numstars >= 10 || numstars < 1){
                if (numstars < 1){
                    numstars = 1;
                }
                change = -1*change;
            }

            numstars = numstars * Math.pow(2, change);

            Thread.sleep(30);


        }


    } 

 





}
