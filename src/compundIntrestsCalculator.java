import java.util.Scanner;

public class compundIntrestsCalculator {

    //compound interest formula = P * (1 + r/n)^(n*t)
    //p - principal (amount of $$)
    //r - Annual interest rate
    //n - compound per year
    //t - time/# of years

    public static void compound(){

        double p;
        double r;
        int n;
        int t;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the principal amount:");
        p =(double)scan.nextDouble();

        System.out.println("Enter the interest rate (in %): ");
        r = (double)scan.nextDouble()/100; // We want the percent rate out of 100

        System.out.println("Enter the # of times compounded per year: ");
        n = (int)scan.nextInt();

        System.out.println("Enter the # of years: ");
        t = (int)scan.nextInt();

        double ans = p * Math.pow((1 + (r/n)), (n * t));

        System.out.printf("The amount after " + t + " year(s) is %.2f", ans);
        scan.close();

    }

    public static void main(String [] args){

        //Calling the compound function in main
        compound();

    }

}
