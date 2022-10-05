package main.java.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortDescendingOrder {

 public static void main(String[] args)
 {
     ArrayList<Integer> arrayList= new ArrayList<>();
     arrayList.add(10);
     arrayList.add(20);
     arrayList.add(0);
     arrayList.add(5);
     arrayList.add(15);
     System.out.println(arrayList);
     Collections.sort(arrayList,(A1,A2)-> {
         if (A1 < A2) {
             return +1;
         } else if (A1 > A2) {
             return -1;
         } else {
             return 0;
         }
     } );
     System.out.println(arrayList);

 }

}
