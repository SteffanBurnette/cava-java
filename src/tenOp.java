import java.util.Scanner;

public class tenOp {

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter you test grade: ");
        int score = scan.nextInt();

        String passOrFail = (score >= 60) ? "Pass" : "Fail";

        System.out.println("You have " + passOrFail + "ed with a score of " + score);

    }
}
