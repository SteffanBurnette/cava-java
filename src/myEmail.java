public class myEmail {

    public static void main(String [] args){

        String email = "goldengoober@gmail.com";
        String username = email.substring(0,email.indexOf("@"));
        System.out.println("Hello "+ username);
        String domain = email.substring(email.indexOf("@") + 1);
        System.out.println("This is the domian: " + domain);
    }
}
