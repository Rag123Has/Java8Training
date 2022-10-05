package main.java.Test;

import java.util.function.Predicate;

public class TestPredicates {
    public static void main(String[] args){
        Predicate<Integer> p = x->(x>10);
        System.out.println(p.test(10));

    }
}
