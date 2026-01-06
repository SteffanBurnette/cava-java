import java.util.Scanner;

public class tempConverter {

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scan.nextDouble();

        System.out.print("Convert to celsius or fahrenheit? (C/F): ");
        unit = scan.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5/9 : (temp * 9/5) + 32;

        System.out.printf("Your new temperature is: %.1f", newTemp);
        scan.close();


    }
}
