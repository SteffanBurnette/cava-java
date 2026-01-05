//Library needed to store user input
import java.util.Scanner;

public class Main{
    static boolean checker(int num){

        if (num == 0){

            return true;
        }
        else if(num <0){

            return false;
        }
        else{
            return true;
        }

    }
    public static void main(String [] args){

        // This is a comment
        System.out.println("Hello World");
        System.out.print("This is a new line\n");
        System.out.print("This is a new line X2");
        System.out.println("sout tab");

        int var = 243;
        double d = 3.456;
        char c = 'a';
        float f = 23;
        boolean b = true;
        String name = "Steff";
        System.out.println("The integer is " + var);
        System.out.println("The double is " + d);
        System.out.println("The char is " + c);
        System.out.println("The float is "+ f);
        System.out.println("The boolean is "+ b);
        System.out.println("Welcome to java " + name);
        System.out.println("This is the checker function: " + checker(var));

    }
        }