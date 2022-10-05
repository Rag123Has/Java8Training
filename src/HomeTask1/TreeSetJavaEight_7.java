package HomeTask1;

import java.util.TreeSet;

public class TreeSetJavaEight_7 {
    public static  void main(String[] args){
        TreeSet<Integer> treeSet= new TreeSet<Integer>((L1,L2)->{
            if(L1<L2){
                return +1;
            }else if(L1>L2){
                return -1;
            }else {
                return 0;
            }

        });

        treeSet.add(45);
        treeSet.add(15);
        treeSet.add(99);
        treeSet.add(70);
        treeSet.add(65);
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(60);
        treeSet.add(80);
        System.out.println(treeSet);
    }
}
