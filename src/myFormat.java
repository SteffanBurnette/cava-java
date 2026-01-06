public class myFormat {

    public static void main(String [] args){
        String name = "Alice";
        int age = 25;
        System.out.printf("Name: %s, Age: %d%n", name, age);

        //%[flags][width][.precision][specifier-character]
        //Setting the precision to limit the number of points
        //displayed after a decimal point
        //Setting the precision automatically rounds the digit
        System.out.printf("Format test: %.1f", 3.45);

        //flag specifier
        System.out.printf("This is comma flag: %,d\n", 1000000);
        System.out.printf("This is the plus flag: %+d\n", 50);
        System.out.printf("This is the enclose negatives flag: %(.2f\n", -4567.78922745);
        System.out.printf("This is the space flag: % .4f\n", -1234.789273538262);
        System.out.printf("This is the space flag: % d\n", 2341);

        //width specifier
        System.out.printf("This is the base number: %04d\n", 1);
        System.out.printf("This is the base number: %04d\n", 23);
        System.out.printf("This is the base number: %04d\n", 456);
        System.out.printf("This is the base number: %04d\n", 7890);

        System.out.printf("This is the base number: %4d\n", 1);
        System.out.printf("This is the base number: %4d\n", 23);
        System.out.printf("This is the base number: %4d\n", 456);
        System.out.printf("This is the base number: %4d\n", 7890);

        System.out.printf("This is the base number: %-4d\n", 1);
        System.out.printf("This is the base number: %-4d\n", 23);
        System.out.printf("This is the base number: %-4d\n", 456);
        System.out.printf("This is the base number: %-4d\n", 7890);

    }
}
