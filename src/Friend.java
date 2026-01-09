public class Friend {

    String name;
    //Static makes this variable become a instance of the data type itself
    //and not just and instance of the object created. It allows a unified persistent
    //record of the "state"/value of the variable across all instances of the class
    //Essentially, all "Friend" objects have access to the same memory location
    //of the static variable, and changes in it reflects in all instances of the class
    static int numOfFriends;

    Friend(String name){
        this.name = name;
        numOfFriends++;

    }

    //When working with a static attribute, you do not need to use "this."
    static void showFriends(){
        System.out.println("You have " + numOfFriends + " friends.");
    }
}
