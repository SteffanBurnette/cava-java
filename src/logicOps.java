import java.util.Scanner;

public class logicOps {

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        //Username must be between 4-12 characters
        //Username must not contain any spaces or underscore
        String user;

        System.out.print("Please enter your username: ");
        user = scan.nextLine();

        if(user.contains(" ") || user.contains("_")){
            System.out.println("Your username cannot contain spaces and underescores");
        }
        else if(user.length() < 4 || user.length() > 12){
            System.out.println("Your username must be 4-12 characters long. No more, no less");
        }
        else{
            System.out.println("Welcome " + user);
        }
    }
}
