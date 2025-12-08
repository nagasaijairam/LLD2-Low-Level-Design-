package functionalInterface;

import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        //Way 1:Create a class which implements the BiPredicate
        BiPredicate<Integer,String> biPredicate = new BiPredicateImp();
        System.out.println(biPredicate.test(1,"Jairam"));
        System.out.println(biPredicate.test(1,"a"));

        // Way2: Anonymous function
        BiPredicate<Integer,String> biPredicate2 = new BiPredicate<Integer,String>(){
            public boolean test(Integer i, String s){
                return s.length() >=i;
            }
        };

        System.out.println(biPredicate2.test(1,"Jairam"));


        // Way3: Lambda
        BiPredicate<Integer,String> biPredicate3 = (i,s)->s.length() >=i;
        System.out.println(biPredicate3.test(1,"Jairam"));
    }


}
