package HomeTask1;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetJavaEightByNames_8 {
    public static void main(String[] args) {
        TreeSet<ComparatorInterfaceForNames_6> ar = new TreeSet<ComparatorInterfaceForNames_6>((T1, T2) ->
        {
            return T1.name.compareTo(T2.name);
        });
        ar.add(new ComparatorInterfaceForNames_6("Mayank", 23, 111));
        ar.add(new ComparatorInterfaceForNames_6("Anshul", 19, 131));
        ar.add(new ComparatorInterfaceForNames_6("Solanki", 12, 121));
        ar.add(new ComparatorInterfaceForNames_6("Aggarwal", 25, 101));
        ar.add(new ComparatorInterfaceForNames_6("Raghib", 25, 101));
        for(ComparatorInterfaceForNames_6 x:ar){
            System.out.println(x);
        }

    }

}
