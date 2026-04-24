public class Student {

    String name;
    int age;
    int rollNo;

    Student (){}

    Student(String name, int age, int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    public void display(){
        System.out.println("Student Name: "+ this.name);
        System.out.println("Student Age: "+this.age);
        System.out.println("Student Roll No: "+ this.rollNo);
    }
}
