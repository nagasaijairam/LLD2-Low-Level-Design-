package DesignPatterns.SOLID.Bird_V3;

public abstract class Bird {
    private String name;
    private int age;
    private String type;
    private int numberOfLegs;

//    public void fly(){
//        System.out.println("The bird is flying");
//    }


    public void eat(){
        System.out.println("The bird is eating");
    }
    abstract void makeSound();
//    abstract void fly();

//    public void makesSound(){
//        //MakesSound function has lot of responsibilities
//        if(type.equals("Crow")){
//            System.out.println("CAW CAW CAW .....");
//        }else if(type.equals("Peacock")){
//            System.out.println("Peacock Peacock .....");
//        }
//        System.out.println("The bird is making sound");
//    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setNumberOfLegs(int numberOfLegs){
        this.numberOfLegs = numberOfLegs;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return  age;
    }

    public int getNumberOfLegs(){
        return this.numberOfLegs;
    }

    public String getType(){
        return this.type;
    }

}
