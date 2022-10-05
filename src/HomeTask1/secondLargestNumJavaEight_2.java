package HomeTask1;

import java.util.ArrayList;
import java.util.Collections;

public class secondLargestNumJavaEight_2 {
    public static void main(String[] args) {
        SecondLargestInterface_2 sc = (list) -> {
            int max1 = Collections.max(list);
            list.remove(list.indexOf(max1));
            int max2 = Collections.max(list);
            System.out.println("Second largest number in the array is " + max2);
        };

        ArrayList<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(14);
        num.add(12);
        num.add(20);
        num.add(13);
        sc.LargestStringNum(num);
    }
}
