package HomeTask4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class testConsumer {

    public static void main(String[] args) {

        ArrayList<Product> pr = new ArrayList<>();
        pr.add(new Product("Raghib", 100, "Essentials", "LOW"));
        pr.add(new Product("Hasan", 1000, "Cosmetic", "LOW"));
        pr.add(new Product("Amit", 2000, "Electronics", "HIGH"));
        pr.add(new Product("Deepak", 5000, "Electronics", "MEDIUM"));
        pr.add(new Product("Shubham", 1000, "Cosmetic", "LOW"));
        pr.add(new Product("Suraj", 6080, "Electronics", "PREMIUM"));
        pr.add(new Product("Anish", 3000, "Electronics", "MEDIUM"));
        pr.add(new Product("Asish", 2000, "Cosmetic", "LOW"));
        pr.add(new Product("Aman", 8980, "Electronics", "MEDIUM"));



        //Print the file or in console
        BiConsumer<Product,String> con= (prod,medium)->{
            if(medium.equals("File")){
                try{
                    FileOutputStream writeData = new FileOutputStream("FILE PATH",true);
                    ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

                        writeStream.writeObject(prod);
                        writeStream.flush();
                        writeStream.close();
                }catch (IOException e) {
                    e.printStackTrace();
                }
            }else
                System.out.println(prod);
        };

        System.out.println("Print the Product List");
        for (Product e : pr) {

            con.accept(e,"Console");
        }



        //2. upgrade the garde to premium if price >1000
        Consumer<Product> con1 = prod -> {
             if (prod.getPrice() > 1000) {
                    prod.setGrade("PREMIUM");
                }
            System.out.println(prod);
        };


        System.out.println("Print the Product List with grade as PREMIUM with price >1000");
        for (Product e : pr) {

            con1.accept(e);
        }

        //3. if price >3000 add suffix (*) to the name
        Consumer<Product> con2 = prod1 -> {

                if (prod1.getPrice()> 3000) {
                    String str = prod1.getName().concat("*");
                    prod1.setName(str);
                }
            System.out.println(prod1);
        };

        System.out.println("Print the Product List with name suffix as * if price >3000");
        for (Product e : pr) {

            con2.accept(e);
        }

        //4. Print all the Premium grade products with name suffixed with '*'.

        System.out.println("Print all the Premium grade products with name suffixed with '*'");
        for (Product e : pr) {

            con2.andThen(con1).accept(e);
        }



        //supplier to produce a random Product
        Supplier<Product> list=()->{

            Product prod= new Product("Raghib", 100, "Essentials", "LOW");
            return prod;
        };

        //random OTP
        Supplier<Integer> otp = ()->{
            String x= new DecimalFormat("000000").format(new Random().nextInt(999999));
            return Integer.valueOf(x);
        };

          System.out.println(otp.get());

          System.out.println(list.get());

        }


}
