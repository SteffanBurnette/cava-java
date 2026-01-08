import java.util.Scanner;
import java.util.Random;

public class slots {


    public static void main(String [] args){

        //Java slot machine
        //DECLARE VARIABLES
        //PLAY IF BALANCE > 0
        //ENTER BET AMOUNT
        //  VERIFY IF BET > BALANCE
        // VERIFY IF BET > 0
        // SUBTRACT BET FROM BALANCE
        //SPIN ROW
        //PRINT ROW
        //GET PAYOUT
        //ASK TO PLAY AGAIN
        //DISPLAY EXIT MESSAGE

        Scanner scan = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        System.out.println("*************************");
        System.out.println("Welcome to java slots");
        System.out.println("Symbols: @ $ * ~ ?");
        System.out.println("*************************");

        while(balance > 0){
            System.out.println("Current balance $" + balance);
            System.out.print("Place your bet amount: ");
            bet = scan.nextInt();
            scan.nextLine(); //Clearing the buffer after getting user input

            if(bet > balance){
                System.out.println("Your bet amount is too high");
                continue;
            }
            else if(bet <= 0){
                System.out.println("Bet must be greater than zero");
            }
            else{
                balance -= bet;
                System.out.println("Updated Balance: $" + balance);
            }

            //Spinning the row
            System.out.println("Spinning....");
           row = spinRow();
           printRow(row);
           payout = getPayout(row, bet);

           if(payout > 0){
               System.out.println("You have won: $" + payout);
               balance += payout;
           }
           else{
               System.out.println("You lose :P");
           }

            System.out.print("Do you want to play again? (Y/N):");
            playAgain = scan.nextLine().toUpperCase();

           //If the user does not want to continue playing, we end the game
           if(!playAgain.equals("Y") && balance > 0){
               break;
           }
        }


        System.out.println("-------------------------------------");
        System.out.println("GAME OVER! Your final balance is $" + balance);
        System.out.println("-------------------------------------");


        scan.close();
    }

    //This function will return an array of strings
    static String[] spinRow(){

        String[] symbols = {"@", "$", "*", "~", "?"};
        String[] row = new String[3];
        Random random = new Random();

       // System.out.println(symbols[random.nextInt(symbols.length)]);
        //Generating a row of random symbols
        for(int i = 0; i < 3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        //Testing
       // System.out.println(row[0] + " " + row[1] + " " + row[2]);

        return row;
    }

    static void printRow(String[] row) {

        System.out.println("____________");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("____________");

    }

    static int getPayout(String[] row, int bet){
        //Cant use the comparison operator (==) for strings because they
        //are referenced data types
        if(row[0].equals(row[1]) && row[1].equals(row[2])){

            //Returns the bet amount time whatever the slots hit
            return switch(row[0]){
                case "~" -> bet * 13;
                case "*" -> bet * 24;
                case "@" -> bet * 15;
                case "$" -> bet * 20;
                case "?" -> bet * 10;
                default -> 0;
            };
        }else if(row[0].equals(row[1])){

            //Returns the bet amount time whatever the slots hit
            return switch(row[0]){
                case "~" -> bet * 2;
                case "*" -> bet * 3;
                case "@" -> bet * 4;
                case "$" -> bet * 5;
                case "?" -> bet * 9;
                default -> 0;
            };
        }else if(row[2].equals(row[1])) {

            //Returns the bet amount time whatever the slots hit
            return switch (row[1]) {
                case "~" -> bet * 2;
                case "*" -> bet * 3;
                case "@" -> bet * 4;
                case "$" -> bet * 5;
                case "?" -> bet * 9;
                default -> 0;
            };
        }



        return 0;
    }
    }
