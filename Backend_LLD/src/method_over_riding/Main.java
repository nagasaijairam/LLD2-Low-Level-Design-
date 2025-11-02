package method_over_riding;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.login("Jairam", "Test123");
        Mentor mentor = new Mentor();
        mentor.login("Nagasai Jairam", "Test123");

        User user2 = new Mentor();
        user2.login("Nagasai Jairam", "Test123");
//        Mentor mentor2 = new User(); Throws error

        System.out.println(Mentor.name);
    }
}
