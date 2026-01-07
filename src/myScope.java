public class myScope {

    //All methods in this class has access to this variable
    static int x = 3; //Class scope

    public static void main(String [] args){

        int x = 1; //Local

        something();
    }

    static void something(){

        int x = 2; //Local
        System.out.println(x);
    }
}
