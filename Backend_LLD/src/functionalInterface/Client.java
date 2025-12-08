package functionalInterface;

import java.util.*;

public class Client {
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

    public static void main(String[] args) {
        Car car = new Car("Range Rover",100,1001);
        Car car3 = new Car("BMW",150,2001);
        Car car2 = new Car("HONDA",200,3003);
        Car car4 = new Car("Jaguar",100,3004);

        List<Car> carList= Arrays.asList(car,car3,car2,car4);

//        Comparator<Car> carComparator = new Comparator<Car>() {
//            @Override
//            public int compare(Car c1, Car c2) {
//                return c1.price - c2.price;
//            }
//        };


//        Comparator<Car> carComparator = ( c1,c2)-> c2.speed - c1.speed;
//        Collections.sort(carList,carComparator);

        Collections.sort(carList,(a,b)->a.speed-b.speed);
        System.out.println(carList);

    }

}
