import java.util.Scanner;

public class Test {

    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);

    System.out.println("Enter your name: ");
    String name = scan.nextLine();
    System.out.println("Nice to meet you: " + name);

    System.out.println("Enter your Age: ");
    int age = scan.nextInt();
    System.out.println("Wow your " + age + "!! \nYour OLD af lmfaoooo");

    System.out.println("How tall are you (cm)");
    double height = scan.nextDouble();
    System.out.println("Only " + height + "!?!?.\nYou are shooort");

    System.out.println("Are you a hobbit? (true/false)");
    boolean ans = scan.nextBoolean();
    System.out.println("Your answer was " + ans + "? ... liar.");

    if(ans){
        System.out.println("Yes you are one, thank you for not lying as honesty is the best medicine");
    }
    else{
        System.out.println("LIARRRRRRRRRRRRRR HAHAHAHAHAHH");
    }


    //Will need to deallocate the scanner object from memory
    // once it has completed its task
    scan.close();
}

}
