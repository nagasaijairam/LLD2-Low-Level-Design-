package generics;

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
    }
}
