import java.util.Arrays;
import java.util.Scanner;

public class myArr {

    public static void main(String [] args){

        String[] fruits = {"zebra", "apple", "banana", "mango"};

        System.out.println(fruits[2]);

        for(int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }

        //Enhanced for loop (for each loop)
        for(String fruit: fruits){
            System.out.println(fruit);
        }

        //sorts the array alphabetically inline
        Arrays.sort(fruits);
        System.out.println(fruits[3]);

        Arrays.fill(fruits, "avocado");
        System.out.println(fruits[0]);

        String[] arr = new String[3];
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i<arr.length; i++){
            arr[i] = scan.nextLine();
            System.out.println("You entered: " + arr[i]);
        }
    }
}
