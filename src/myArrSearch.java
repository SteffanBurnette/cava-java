public class myArrSearch {

    public static void main(String [] args){

        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        String[] f = {"Orange", "Pizza", "Demogorgan"};
        String target = "Pizza";

        for(int i = 0; i < f.length; i++){
            if(f[i].equals(target)){
                System.out.println("Found target at index " + i);
                break;
            }
        }
    }
}
