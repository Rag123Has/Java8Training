package HomeTask1;

import java.util.TreeMap;

public class TreeMapDescendingOrderJavaEight_10 {

    public static void main(String[] args) {
        TreeMap<ComparatorInterfaceForNames_6, Integer> map = new TreeMap<ComparatorInterfaceForNames_6, Integer>((o1, o2) -> {
            return o2.name.compareTo(o1.name);
        });
        map.put(new ComparatorInterfaceForNames_6("Mayank", 23, 111), 100);
        map.put(new ComparatorInterfaceForNames_6("vAnshul", 19, 131), 200);
        map.put(new ComparatorInterfaceForNames_6("Solanki", 12, 121), 300);
        map.put(new ComparatorInterfaceForNames_6("Aggarwal", 25, 101), 400);
        map.put(new ComparatorInterfaceForNames_6("Raghib", 25, 112), 500);
        System.out.println(map);
    }
}
