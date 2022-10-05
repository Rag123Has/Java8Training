package HomeTask6;

import java.util.Random;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;

public class PrimitivTypeTest {

    public static void main(String[] args){

        //1. IntPredicate to verify if the given number is a primenumber


        IntPredicate pre = x->{
            int count=0;
            for(int i=1;i<=x;i++){
                if((x%i)==0){
                    count ++;
                }
            }
            if(count==2){
                return true;
            }else
                return false;
        };

        System.out.println(pre.test(6));


        //2. IntConsumer to print square of the given number

        IntConsumer con= x->{
            System.out.println("Square is :" + (x*x));
        };

        con.accept(10);

        //3. IntSupplier to give random int below 5000

        IntSupplier sup = ()->{
            int max = 5000;
            int min = 0;
            Random randomNum = new Random();
            int showMe = min + randomNum.nextInt(max);
            return showMe;
        };

        System.out.println(sup.getAsInt());

    }
}
