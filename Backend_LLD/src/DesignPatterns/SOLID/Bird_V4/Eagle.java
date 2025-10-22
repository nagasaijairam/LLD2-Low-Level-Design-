package DesignPatterns.SOLID.Bird_V4;

public class Eagle extends Bird implements Flyable{
    public void fly(){
        System.out.println("Eagle flying High...!");
    }
    public void makeSound(){}
}
