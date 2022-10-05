package main.java.Test;

import java.util.TreeMap;

public class TreeSort {

    public static void main(String[] args){

        TreeMap<Integer,String> map = new TreeMap<>((I1,I2)->
        {
            if(I1<I2) {
                return +1;
            }else

                if(I1>I2)
                {
                    return -1;
                }else
                {
                    return 0;
                }


        });

        map.put(100,"ABC");
        map.put(200,"XYZ");
        map.put(900,"ASA");
        System.out.println(map);
    }
}
