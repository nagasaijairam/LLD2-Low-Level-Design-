package functionalInterface;

import java.util.function.BiPredicate;

public class BiPredicateImp implements BiPredicate<Integer ,String> {
    @Override
    public boolean test(Integer value, String str) {
        return str.length()>value ;
    }
}
