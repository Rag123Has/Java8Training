package HomeTask1;

import java.util.*;

public class ComparatorReverseOrder_5 {
    public static void main(String[] args) {
        List<Integer> value = new ArrayList<>();
        value.add(12);
        value.add(20);
        value.add(30);
        value.add(11);
        value.add(9);

        value.sort(Comparator.reverseOrder());
        System.out.println(value);
    }
}
