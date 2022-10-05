package HomeTask1;

import java.sql.SQLOutput;
import java.util.TreeMap;

public class TestMapDecValueJavaEight_9 {
    public static void main(String[] args){
        TreeMap<Integer,String> map = new TreeMap<>((T1,T2)->{
             if(T1<T2){
                 return +1;
             }else if(T1>T2){
                 return -1;
             } else{
                 return 0;
             }

        });

        map.put(10,"a");
        map.put(20,"b");
        map.put(30,"c");
        map.put(40,"d");
        map.put(50,"e");

        System.out.println(map);
    }
}
