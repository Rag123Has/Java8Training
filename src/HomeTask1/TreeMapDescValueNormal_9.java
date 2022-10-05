package HomeTask1;

import java.util.*;

public class TreeMapDescValueNormal_9 {

    public static void main(String[] args){
        TreeMap<Integer,String> map = new TreeMap<Integer,String>(Collections.reverseOrder());
        map.put(10,"a");
        map.put(1,"b");
        map.put(30,"c");
        map.put(60,"d");
        map.put(50,"e");

        Set set = map.entrySet();
        Iterator i = set.iterator();

        while (i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }




    }
}
