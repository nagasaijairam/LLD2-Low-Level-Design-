package DesignPatterns.SOLID.Bird_V0;

public class Client {
    public static void main(String[] args){
        Bird bird = new Bird();
        bird.setName("Peacock1");
        bird.setAge(12);
        bird.setType("Peacock");
        bird.setNumberOfLegs(2);
        String birdName = bird.getName();
        int birdAge = bird.getAge();
        int birdNoOfLegs = bird.getNumberOfLegs();
        String birdType = bird.getType();
        bird.makesSound();

        Bird  bird2 = new Bird();
        bird.setName("Crow1");
        bird.setAge(12);
        bird.setType("Crow");
        bird.setNumberOfLegs(2);
        bird2.makesSound();
    }
}
