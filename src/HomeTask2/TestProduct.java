package HomeTask2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TestProduct {

    public static List<Product> execute(List<Product> list,Predicate<Product> prod){
        List<Product> result = new ArrayList<>();
        for(Product x : list)
         if(prod.test(x))
             result.add(x);
             return result;
    }

    public static void main(String[] args){
        ArrayList<Product> pr = new ArrayList<>();
        pr.add(new Product("Raghib",100,"Essentials",'A'));
        pr.add(new Product("Hasan",1000,"Cosmetic",'B'));
        pr.add(new Product("Amit",2000,"Electronics",'A'));
        pr.add(new Product("Deepak",500,"Electronics",'A'));
        pr.add(new Product("Shubham",1000,"Cosmetic",'C'));
        pr.add(new Product("Suraj",80,"Electronics",'A'));

        //1.Price greater than 1000
        Predicate<Product> p1 = x->{return x.price>1000;};
        List<Product> z =execute(pr,p1);
        System.out.println(z);

        //2.Category is Electronics
        Predicate<Product> p2= x->{return x.category.equals("Electronics");};
        List<Product> z1 =execute(pr,p2);
        System.out.println(z1);

        // 3.Electronic category and >100
        Predicate<Product> p3 = x->{return x.price>100;};

        List<Product> z3 =execute(pr,p3.and(p2));
        System.out.println(z3);

        //4.Electronic category or >100
        System.out.println(execute(pr,p3.or(p2)));

        //5.Electronic catgory or less than 100
        System.out.println(execute(pr,p3.negate().or(p2)));


    }
}
