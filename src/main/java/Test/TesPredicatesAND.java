package main.java.Test;

import java.sql.SQLOutput;
import java.util.function.Predicate;

public class TesPredicatesAND {

    public static void testCondition(Predicate<Integer> predicate, int[] list) {
        for (int n : list) {
            if (predicate.test(n)) {
                System.out.println(n);
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {0, 5, 10, 15, 20};
        Predicate<Integer> p = x -> {
            return x > 10;
        };
        Predicate<Integer> p1 = i -> {
            return i % 2 == 0;
        };
        testCondition(p.or(p1), numbers);

        Predicate<String> sp = Predicate.isEqual("TRUE");
        System.out.println(sp.test("TRUE"));
    }
}

