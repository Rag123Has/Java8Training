package main.java.Test;

import java.util.function.Function;

public class DefaultFunction {

    public static void main(String[] args){
        Function<String,String>  f1= Function.identity();
        String str= f1.apply("Test");
        System.out.println(str);
    }
}
