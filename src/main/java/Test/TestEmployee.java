package main.java.Test;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmployee {
    public static void main(String args[]){
        ArrayList<Employee> l = new ArrayList<>();
        l.add(new Employee(100,"abc"));
        l.add(new Employee(600,"xyz"));
        l.add(new Employee(200,"efg"));
        l.add(new Employee(100,"abc"));

        System.out.println("Before Sorting");
        System.out.println(l);
        Collections.sort(l,(Employee a1, Employee a2)->{
                if(a1.eno<a2.eno){
                    return +1;
                } else if(a1.eno>a2.eno){
                    return -1;
                }else{
                    return 0;
                }
                }
                );

        System.out.println("After Sorting");
        System.out.println(l);


     }
}
