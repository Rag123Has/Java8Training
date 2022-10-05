package HomeTask1;

import java.util.ArrayList;
import java.util.Collections;

public class TestClass_6 {
    public static void main(String[] args){
        ArrayList<ComparatorInterfaceForNames_6> ar = new ArrayList<ComparatorInterfaceForNames_6>();
        ar.add(new ComparatorInterfaceForNames_6("Mayank", 23, 111));
        ar.add(new ComparatorInterfaceForNames_6("Anshul", 19, 131));
        ar.add(new ComparatorInterfaceForNames_6("Solanki", 12, 121));
        ar.add(new ComparatorInterfaceForNames_6("Aggarwal", 25, 101));
        ar.add(new ComparatorInterfaceForNames_6("Raghib", 25, 101));
        Collections.sort(ar, new sortByName_6());
        System.out.println(ar);
    }
}
