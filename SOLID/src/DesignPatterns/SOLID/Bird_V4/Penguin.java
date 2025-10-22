package DesignPatterns.SOLID.Bird_V4;

public class Penguin extends Bird {
    //WE ARE NOT IMPLEMENTING THE FLYABLE INTERFACE BECAUSE PENGUIN WILL NOT FLY.
    public void makeSound(){
        System.out.println("Penguin,penguin,penguin.......");
    }
}
