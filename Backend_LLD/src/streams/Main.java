package streams;

import functionalInterface.Client;
import inheritance_2.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static class Car{
        String name;
        int speed;
        int price;
        public Car(String name, int speed, int price){
            this.name=name;
            this.speed=speed;
            this.price=price;
        }

        @Override
        public String toString(){
            return "[ Name = " + this.name + ", Speed = " + this.speed + ", Price = " + this.price + " ]";
        }
    }
    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(1,3,2,7,6,5,4);
//        List<Integer> evens = new ArrayList<>();
        List<Integer> evens = nums.stream().filter((i)-> i%2==0).toList();
//        nums.stream().filter((i)-> i%2==0).toList();
            //1. list converted in to steam
            //2. Steam will loop over the elemnts of the list.
            //3. every element will be passed to predicate as input. Predicates output is boolean and takes only single input.
            //4. If that element condition returns true it will be considered or else it will be deleted.
//        for(Integer i:nums){
//            if(i%2==0){
//                evens.add(i);
//            }
//        }
//        System.out.println(evens);


        Car car = new Car("Range Rover",100,1001);
        Car car3 = new Car("BMW",150,2001);
        Car car2 = new Car("HONDA",200,3003);
        Car car4 = new Car("Jaguar",100,3004);

        List<Car> carList= Arrays.asList(car,car3,car2,car4);

        System.out.println(carList.stream().map(c -> c.speed ).toList());

    }
}
