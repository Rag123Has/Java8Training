package HomeTask1;

import java.util.Collections;
import java.util.TreeMap;

public class TreeMapDescendingOrder_Normal_10 {

    public static void main(String[] args){
        TreeMap<ComparatorInterfaceForNames_6,Integer> map = new TreeMap<ComparatorInterfaceForNames_6,Integer>(new sortByName_6());
        map.put(new ComparatorInterfaceForNames_6("Mayank", 23, 111),100);
        map.put(new ComparatorInterfaceForNames_6("Anshul", 19, 131),200);
        map.put(new ComparatorInterfaceForNames_6("Solanki", 12, 121),300);
        map.put(new ComparatorInterfaceForNames_6("Aggarwal", 25, 101),400);
        map.put(new ComparatorInterfaceForNames_6("Raghib", 25, 112),500);
        System.out.println(map.descendingMap());
    }
}
