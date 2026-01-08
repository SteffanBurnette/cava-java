public class myMatrix {

    public static void main(String [] args){

        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[] meats = {"chicken", "pork", "beef", "fish"};

        //Method 1 of creating a 2d array
        String[][] groceries = {fruits, vegetables, meats};

        //Method 2 of creating a 2d array
        String[][] groceries2 = {
                {"apple", "orange", "banana"},
                {"potato", "onion", "carrot"},
                {"chicken", "pork", "beef", "fish"}
        };

        for(String[] foods: groceries){
            for(String food: foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}
