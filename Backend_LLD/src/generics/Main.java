package generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Pair pair = new Pair();
//        pair.first = "JAIRAM";
//        pair.second = 26;

//        Pair<String, Integer> pair1 = new Pair<>();
//        pair1.first = "Jairam";
//        pair1.second = 27;
//        System.out.println(pair1.first +" "+  pair1.second);

        Pair<Integer, Boolean> EvenPair = new Pair<>();
        EvenPair.first =2;
        EvenPair.second =true;
        System.out.println(EvenPair.first + " is an Even number --> " + EvenPair.second);

        //RAW TYPE
        HashMap hashMap = new HashMap();
        hashMap.put("Deepak", 80.0);
        hashMap.put(80.0, "Deepak");

        //Java 5 -> Generics were introduced.
        // Java is a Backward Compatible language.

        HashMap<String, Integer> hashMap1 = new HashMap<>();
        //hashMap1.p

        List<Animal> animals = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();

        doSomething(animals);
        doSomething(dogs);

        //List<Animal> animals1 = new ArrayList<Dog>(); -> Not possible
//        List<? extends Animal> animals1 = new ArrayList<Dog>(); --> possibele

//        List<? extends Animal> list = new ArrayList<>();
//        Animal an = new Dog();
//        list.add(an);
    }

    private static void doSomething(List<? extends Animal> animals) {
        System.out.println("Inside dosomething function");
    }
}
