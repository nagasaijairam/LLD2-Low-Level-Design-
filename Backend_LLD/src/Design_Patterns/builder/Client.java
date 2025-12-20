package Design_Patterns.builder;

public class Client {
    public static void main(String[] args) {

        Builder builder = new Builder();
        builder.setAge(20);
        builder.setName("V.N.S Jairam");
        builder.setAddress("Bellampalli");
        builder.setYOE(2);
        builder.setPhone("1234567890");
        Student jairam = new Student(builder);
    }
}
