//Random class
import java.util.Random;

public class myRan {

    public static void main(String [] args){

        Random random = new Random();

        //Assigns a random number to the variable
        // By default the range is between -1 billion <-> +1 billion
        //range is inclusive -> exclusive
        int num = random.nextInt(1, 6); //1-5 range
        System.out.println(num);

        //Generating a random double
        double dub = random.nextDouble(0, 1); //number between 0-1
        System.out.println(dub);


        //Generating a random boolean to simulate the process of flipping a coin
        boolean bool = random.nextBoolean();
        if(bool){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
}
