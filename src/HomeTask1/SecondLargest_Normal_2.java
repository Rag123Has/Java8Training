package HomeTask1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest_Normal_2 {

    public void secondLargestNumber(List<Integer> num){
       int max1= Collections.max(num);
       num.remove(num.indexOf(max1));
       int max2= Collections.max(num);
        System.out.println("Second largest number in the array is " + max2);
    }

    public static void main(String[] args){
        ArrayList<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(30);
        num.add(12);
        num.add(20);
        num.add(13);

        SecondLargest_Normal_2 sec = new SecondLargest_Normal_2();
        sec.secondLargestNumber(num);

    }
}
