public class stuffMath {

    public static void main(String [] args){

        //Messing around with the built in Math module
        System.out.println("Would you care for some PI 0_o " + Math.PI);
        System.out.println("Huler my Euler -_- " + Math.E);

        //Exponents, raising to a power
        double result = Math.pow(2, 3);
        System.out.println("POWERRR :() " + result);

        //Absolute Value
        int num = Math.abs(1 - 1000);
        System.out.println("One could say ... im absolute ;() " + num);

        //Square Root
        double result2 = Math.sqrt(12);
        System.out.println("This guys kinda ... square har har har " + result2);


        //Rounding a number to the nearest whole integer
        double result3 = Math.round(result2);
        System.out.println("Round and Round the wheels go " + result3);

        //Always rounding up
        double res  = Math.ceil(result2);
        System.out.println("Up we go " + res);

        //Always rounds down
        double res2 = Math.floor(9.99999);
        System.out.println("Gotta get low low low "+ res2);

        //Returns the max value given
        double res3 = Math.max(res, res2);
        System.out.println("Max powa " + res3);

        //Returns the  value given
        double res4 = Math.min(res, res3);
        System.out.println("Min effort " + res4);


    }


}
