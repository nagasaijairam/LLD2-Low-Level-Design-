package Design_Patterns.builder;

public class Client {
    public static void main(String[] args) {

//        Student.Builder builder = new Builder();
//        builder.setAge(10);
//        builder.setName("V.N.S Jairam");
//        builder.setAddress("Bellampalli");
//        builder.setYOE(2);
//        builder.setPhone("1234567890");
////        Student jairam = new Student(builder);
//
//
//        Student jairam = builder.build();



//        Student Jairam1 = Student.getBuilder().setAge(10).setName("Jairam1").build();
        Student Jairam = Student.getBuilder().setName("Jairam").setAge(10).setEmail("nagasaijairam@flyin.com").setAddress("Subhash nagar bellampalli").build();
    }
}
