package HomeTask8;



import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPITest {

    public static void main(String[] args){

        ArrayList<Product> pr = new ArrayList<>();
        pr.add(new Product("Raghib", 100, "Essentials", "LOW"));
        pr.add(new Product("Hasan", 1000, "Cosmetic", "LOW"));
        pr.add(new Product("Amit", 2000, "Electronics", "HIGH"));
        pr.add(new Product("Deepak", 5000, "Electronics", "MEDIUM"));
        pr.add(new Product("Shubham", 1000, "Cosmetic", "LOW"));
        pr.add(new Product("Suraj", 680, "Electronics", "PREMIUM"));
        pr.add(new Product("Anish", 3000, "Electronics", "MEDIUM"));
        pr.add(new Product("Asish", 2000, "Cosmetic", "LOW"));
        pr.add(new Product("Aman", 980, "Electronics", "PREMIUM"));

        //1. products with price > 1000/-
       pr.stream().filter(x->x.price>1000).collect(Collectors.toList()).forEach(System.out::println);

        //2.products from electronics category.

       pr.stream().filter(x->x.category.equals("Electronics")).collect(Collectors.toList()).forEach(System.out::println);


       //3.  price> 1000/- and from electronics category and name of the result list into CAP letters before printing.

        List<Product> list= pr.stream().filter((x)->x.price>1000 && x.category.equals("Electronics")).collect(Collectors.toList());


        list.forEach(x->x.setName(x.getName().toUpperCase()));

        System.out.println(list);


        //4.count of all electronic product

        System.out.println(pr.stream().filter(x->x.category.equals("Electronics")).count());




    }
}
