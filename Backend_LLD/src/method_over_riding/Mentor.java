package method_over_riding;

public class Mentor extends User {
    //method signature String login(String,String)
//    public String login( String userName, String Password){// method signature is different (return type String)
//        System.out.println("The mentor is logging_in");
//    }

    public void login(String username, String password) {
        System.out.println("The Mentor is logging in.");
    }

    public static String name = "Jairam";
}
