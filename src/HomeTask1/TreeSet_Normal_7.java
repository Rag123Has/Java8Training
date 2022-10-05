package HomeTask1;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Normal_7 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(45);
        treeSet.add(15);
        treeSet.add(99);
        treeSet.add(70);
        treeSet.add(65);
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(60);
        treeSet.add(80);


        System.out.println("TreeSet after sorting in descending order\n" + treeSet.descendingSet());


    }
}
