package HomeTask5;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class TestBiFunction {

    public static void main(String[] args){

        ArrayList<Product> pr = new ArrayList<>();
        pr.add(new Product("Raghib", 100, "Essentials", "LOW"));
        pr.add(new Product("Hasan", 1000, "Cosmetic", "LOW"));
        pr.add(new Product("Amit", 2000, "Electronics", "HIGH"));
        pr.add(new Product("Deepak", 5000, "Electronics", "MEDIUM"));
        pr.add(new Product("Shubham", 1000, "Cosmetic", "LOW"));
        pr.add(new Product("Suraj", 6080, "Electronics", "PREMIUM"));
        pr.add(new Product("Anish", 3000, "Electronics", "MEDIUM"));
        pr.add(new Product("Asish", 2000, "Cosmetic", "LOW"));
        pr.add(new Product("Aman", 8980, "Electronics", "PREMIUM"));


        //1. Given the name and price of the product, write a Bifunction to create a product.
        BiFunction<String ,Integer ,Product> fun= (name,price)->{
            return(new Product(name,price,"Electronics","Premium"));

        };

        System.out.println(fun.apply("Khatoon",8000));


        //2. Given the Product and quantity of the products, write a Bi-Function to calculate the cost of products. A cart is a map of product and quantity. Given the cart, calculate the cost of the cart.

        Map<Product,Integer> map= new HashMap<>();
        map.put(new Product("Raghib", 100, "Essentials", "LOW"),3);
        map.put(new Product("Hasan", 1000, "Cosmetic", "LOW"),2);
        map.put(new Product("Amit", 2000, "Electronics", "HIGH"),4);
        map.put(new Product("Deepak", 5000, "Electronics", "MEDIUM"),2);
        map.put(new Product("Shubham", 1000, "Cosmetic", "LOW"),6);


        System.out.println(map);

        BiFunction<Map<Product,Integer>,Integer,Integer> calCost= (map1,sum)->
        {
            for(Map.Entry<Product,Integer> x:map1.entrySet()){
               sum= sum+  x.getKey().getPrice() * x.getValue();
            }
            return sum;
        };


        System.out.println(calCost.apply(map,0));


    }
}
