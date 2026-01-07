import java.util.Scanner;

public class myBank {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String [] args){

        double balance = 0;
        boolean isRunning = true;
        int choice;

        while(isRunning){
            System.out.println("**********");
            System.out.println("Banking Program");
            System.out.println("**********");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Withdraw");
            System.out.println("4. EXIT");
            choice  = scanner.nextInt();

            switch(choice){
              case 1 -> showBalance(balance);
              case 2 -> balance = balance + deposit();
              case 3 -> balance = balance + withdraw(balance);
              case 4 -> isRunning = false;
              default -> System.out.println("Invalid Entry");
            };
        }

        scanner.close();
    }

    static void showBalance(double balance){
        System.out.printf("Your current balance is %.2f\n", balance);
    }

    static double deposit(){

        System.out.print("Enter the amount you want to deposit: ");
        double amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("Amount cannot be negative");
            return 0;
        }

        return amount;
    }

    static double withdraw(double balance){

        System.out.print("Enter the amount you want to withdraw: ");
        double amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("You cannot withdraw that much money");
            return 0;
        }
        else if(amount < 0){
            System.out.println("You cannot withdraw a negative amount");
            return 0;
        }

        return -amount;
    }
}
