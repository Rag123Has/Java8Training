package HomeTask4;

import java.io.Serializable;

public class Product implements Serializable {
    String name;
    int price;
    String category;
    String grade;

    Product(String name, int price, String category, String grade){
        this.name= name;
        this.category=category;
        this.price=price;
        this.grade=grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price) {
       this.price= price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    public String toString() {
        return ("Product ["+" Name:"+this.name+
                " Category:"+this.category+
                " Price:"+this.price+
                " Grade:"+this.grade+"]");
    }
}
