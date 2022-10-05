package main.java.Test;

import java.util.function.Function;

public class FunctionInterface {

    public static void main(String[] args){
        Function<String,String> f= (str)->{ return str.toLowerCase();};

        Function<String,String> f1= str->{
            return str.substring(0,4);
        };

        System.out.println(f.apply("RAGHIB"));
        System.out.println(f1.apply("RAGHIB HASAN"));
        System.out.println(f.andThen(f1).apply("RAGHIB HASAN"));
        System.out.println(f.compose(f1).apply("RAGHIB HASAN"));
    }
}
