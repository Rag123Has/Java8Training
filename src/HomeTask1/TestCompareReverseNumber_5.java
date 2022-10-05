package HomeTask1;

import javax.annotation.processing.SupportedOptions;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCompareReverseNumber_5 {

    public static void main(String[] args){
        List<Integer> num = new ArrayList<>();
        num.add(5);
        num.add(100);
        num.add(0);
        num.add(20);
        num.add(13);

        Collections.sort(num,(L1,L2)->{
            if(L1<L2){
                return +1;
            }else if(L1>L2){
                return -1;
            }else {
                return 0;
            }
        });

        System.out.println(num);
    }


}
