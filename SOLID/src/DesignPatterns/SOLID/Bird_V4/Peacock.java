package DesignPatterns.SOLID.Bird_V4;

public class Peacock extends Bird implements Flyable {
    public void fly(){
        System.out.println("Peacock flying Low....");
    };
    public void makeSound(){};
}
