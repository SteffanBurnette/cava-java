import java.util.Random;
import java.util.Scanner;

public class randomGuess {

    public static void main(String [] args){
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        int num = random.nextInt(1, 7);
        int guess;

        System.out.print("Guess a number between 1-6: ");
        guess = scan.nextInt();

        while(guess != num){
            System.out.print("Incorrct guess, try again: ");
            guess = scan.nextInt();
        }

        System.out.println("congratulations, you have guessed correctly");
        System.out.println("The random number: " + num + " Your guess: " + guess);

    }
}
