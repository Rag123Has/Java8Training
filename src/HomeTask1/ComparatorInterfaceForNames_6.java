package HomeTask1;

import java.util.Comparator;

public class ComparatorInterfaceForNames_6 {
    String name;
    int age;
    int id;


    ComparatorInterfaceForNames_6(String name, int age, int id){
       this.name = name;
        this.age = age;
        this.id = id;
    }
    public String toString() {
        return ("Student[ "+"Name:"+this.name+
                " Age: "+ this.age +
                " Id: "+ this.id+"]");
    }



}
