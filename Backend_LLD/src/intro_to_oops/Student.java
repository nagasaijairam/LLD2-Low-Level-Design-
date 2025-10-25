package intro_to_oops;

public class Student {
    public String name;
    protected int age;
    private String email;

    String batch;// default
    private double PSP;

    public Student(String name, int age, String email) {
     //   System.out.println(name); // just for debuging.
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public Student(Student studentCopy) {
        this.name = studentCopy.name;
        this.age = studentCopy.age;
        this.email = studentCopy.email;
    }

    public Student(String email) {
        this.email =email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Email: "+email);
    }

    void attendClass(){
        System.out.println("Attending class");
    }

    void bookMockInterview(){
        System.out.println("Booking Mock Interview");
    }

}
