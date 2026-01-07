import java.util.Scanner;

public class loopings {

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        String name = "";

        while(name.isEmpty()){
            System.out.print("Please enter your name: ");
            name = scan.nextLine();
        }

        System.out.println("Hello " + name);

        int age;
        do{
            System.out.print("Please enter your age (your age cannot be negative): ");
            age = scan.nextInt();
        }while(age < 0);

        System.out.println("You are " + age + " years old");
        scan.close();
    }
}
