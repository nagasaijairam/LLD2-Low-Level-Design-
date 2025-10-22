package DesignPatterns.SOLID.Bird_V3;

public class Penguin extends Bird {
    //WE ARE NOT IMPLEMENTING THE FLYABLE INTERFACE BECAUSE PENGUIN WILL NOT FLY.
    public void makeSound(){
        System.out.println("Penguin,penguin,penguin.......");
    }
}
