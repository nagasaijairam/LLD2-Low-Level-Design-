package DesignPatterns.SOLID.Bird_V4;

public class Sparrow extends Bird implements Flyable {
    public void fly(){
        System.out.println("Sparrow flying Low...");
    }
    public void makeSound(){};
}
