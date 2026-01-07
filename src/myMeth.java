public class myMeth {
    public static void main(String [] args){


        happy("Steff", 20);
        System.out.println(square(25));
    }

    //This method need to be static because we are colling it within another
    //static method.
    //Static is not needed if you are not using this method in another
    //static method
    static void happy(String name, int age){
        System.out.printf("Happy birthday %s %d ", name, age);
        System.out.println("Happy birthday");
        System.out.printf("Happy birthday %s %d ", name, age);
        System.out.println("Happy birthday");
        System.out.printf("Happy birthday %s %d ", name, age);
        System.out.println("Happy birthday");

    }

    static double square(double num){

        return num * num;
    }

}
