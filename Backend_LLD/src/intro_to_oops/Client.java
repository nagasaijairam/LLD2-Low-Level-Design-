package intro_to_oops;

public class Client {
    public static void main(String[] args) {

        Student student = new Student("Jairam",26,"nagasaijairam@gmai.com");
        Student studentCopy = new Student(student);
        student.setEmail("jairam.nagasaivc@flyin.com");

        System.out.println("Student details:");
        student.displayDetails();

        System.out.println("StudentCopy details:");
        studentCopy.displayDetails();
//
        System.out.println(student);


        //default constructor
//        Student(object type) Jairam = new Student()//constructor;
//        Student Jairam = new Student();
//        Jairam.name = "Jairam";
//        Jairam.age = 26;
//        Jairam.batch = "Dec_25_batch";// default (same package)
//        Jairam.age = 10;
////        Jairam.email = "nagasaijairam@gmail.com";// private (We cant access in the same packege also)

    }
}
