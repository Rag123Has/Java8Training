package HomeTask3;


import java.util.ArrayList;
import java.util.function.Function;

public class TestProductHome3 {
    public static void main(String[] args) {
        ArrayList<Product> pr = new ArrayList<>();
        pr.add(new Product("Raghib", 100, "Essentials", 'A'));
        pr.add(new Product("Hasan", 1000, "Cosmetic", 'B'));
        pr.add(new Product("Amit", 2000, "Electronics", 'A'));
        pr.add(new Product("Deepak", 500, "Electronics", 'A'));
        pr.add(new Product("Shubham", 1000, "Cosmetic", 'C'));
        pr.add(new Product("Suraj", 2080, "Electronics", 'A'));

        //1.  cost of all products in a given list of products.
        Function<ArrayList<Product>,Integer> f1= x->{
            int sum=0;
            for(int i=0;i<x.size();i++){
                sum= sum+ x.get(i).price;
            }
            return sum;
        };

        System.out.println(f1.apply(pr));

        //2. calculate the cost of all products whose prices is > 1000/- in the given list of products.

        Function<ArrayList<Product>,Integer> f2= x->{
            int sum=0;
            for(int i=0;i<x.size();i++){
                if(x.get(i).price>1000){
                 sum=sum+x.get(i).price;
                }
            }
            return  sum;
        };

        System.out.println(f2.apply(pr));

        //3. cost of all electronic products in the given list of products.

        Function<ArrayList<Product>,Integer> f3= x->{
            int sum=0;
            for(int i=0;i<x.size();i++){
                if(x.get(i).category.equals("Electronics")){
                    sum=sum+x.get(i).price;
                }
            }
            return  sum;
        };
        System.out.println(f3.apply(pr));

        //4. get all the products whose price is > 1000/- and belongs to electronic category.

        Function<ArrayList<Product>,ArrayList<Product>> f4 = x->{

         ArrayList<Product> list = new ArrayList<Product>();
         for(int i=0;i<x.size();i++)
         {
             if(x.get(i).price>1000 && x.get(i).category.equals("Electronics")){
                 list.add(x.get(i));
             }
         }
         return list;
        };

        System.out.println(f4.apply(pr));
    }
}
