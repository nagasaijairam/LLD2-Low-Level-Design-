package Design_Patterns.builder;

public class Student {
    int age;
    String name;
    String batch;
    int YOE;
    String email;
    String phone;
    String address;

    Student(Builder builder){
        if(builder.age<20) {
            this.age = builder.age;
            throw new RuntimeException( "age should be > 20");
        }
        if(builder.name==null){
            throw new RuntimeException( "Please give a valid name");
        }

        this.age = builder.age;
        this.name=builder.name;
        this.batch=builder.batch;
        this.YOE=builder.YOE;
        this.email=builder.email;
        this.phone=builder.phone;
        this.address=builder.address;

        System.out.println("All is well");
    }
}

