package main.java.Test;


import java.util.function.Consumer;

public class ConsumerTest {

    public  static  void  main(String[] args){

        Consumer<String> c = x->{
            System.out.println(x.length());
        };

        c.accept("Test");
    }
}
