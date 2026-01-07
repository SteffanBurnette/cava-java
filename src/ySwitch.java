import java.util.Scanner;

public class ySwitch {

    public static void main(String [] args){

        //Using switch to dynamically assign a variable value
        int num = 3;

        String name  = switch(num){

            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            default -> "NAN";

        };

        String day;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the day of the week: ");
        day = scan.nextLine().toLowerCase();

        switch(day){
            case "monday" -> System.out.println("Nobody likes a monday");
            case "tuesday" -> System.out.println("Sign its only tuesday");
            case "wednesday" -> System.out.println("Half way there....I guess -_-");
            case "thursday" -> System.out.println("Hell yeah, one day till friday!");
            case "friday" -> System.out.println("wooooooooooooooo");
            case "saturday" -> System.out.println("Finally, I live for days like this");
            case "sunday" -> System.out.println("Sign, one more day till monday :/");
            default -> System.out.println("Sir, that's not a day of the week. :() " + day + ".... moron *cough* *cough*");
        };


        //Giving a case multiple params
        char c = 'a';
        switch(c){
            case 'a', 'b', 'c' -> System.out.println("Gogogaga");
            default -> System.out.println("Who are you?");
        };
    }
}
