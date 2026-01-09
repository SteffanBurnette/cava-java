public class myO {

    public static void main(String [] args){


        //Using a class that was manually created
        Car car = new Car();

        //Getting the class variables
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);

        car.isRunning = true;


        //Calling the class method
        car.info();



    }
}
