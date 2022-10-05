package HomeTask1;

import java.util.Comparator;

public class sortByName_6 implements Comparator<ComparatorInterfaceForNames_6> {
    @Override
    public int compare(ComparatorInterfaceForNames_6 o1, ComparatorInterfaceForNames_6 o2) {
        return o1.name.compareTo(o2.name);
    }
}
