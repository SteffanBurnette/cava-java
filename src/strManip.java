import java.util.Scanner;

public class strManip {

    public static void main(String [] args){

        String name = "steffan";
        int length = name.length();
        System.out.println(length);

        char letter = name.charAt(3);
        System.out.println(letter);

        int index = name.indexOf("o");
        System.out.println(index);

        int lastIndex = name.lastIndexOf("f");

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println(name.trim());

        System.out.println(name.replace("f", "b"));

        if(name.isEmpty()){
            System.out.println("Please enter your name");
        }

        if(name.contains("s")){
            System.out.println("You have a s in your name :)");
        }

        String password;
        Scanner sn = new Scanner(System.in);
        System.out.print("Please enter your password: ");
        password = sn.nextLine();

        if(password.equals("correct")){
            System.out.println("You have successfully logged in");
        }
        else{
            System.out.println("You entered the incorrect password");
        }

        password.equalsIgnoreCase("tst");



            }
}
