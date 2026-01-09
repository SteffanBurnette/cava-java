public class myFriend {

    public static void main(String [] args){

        Friend friend1 = new Friend("tom");
        Friend friend2 = new Friend("ray");

        //Its better for clarity to access a static memeber by the name of the class
        //itself over an object of the class as it highlights that the attribute/method
        //is static
        System.out.println(Friend.numOfFriends);

        Friend.showFriends();

    }
}
