package HomeTask2;

public class Product {
  String name;
  int price;
  String category;
  char grade;

  public Product(String name, int price, String category, char grade){
      this.name= name;
      this.category=category;
      this.price=price;
      this.grade=grade;
  }

    public String toString() {
      return ("Product ["+" Name:"+this.name+
              " Category:"+this.category+
               " Price:"+this.price+
              " Grade:"+this.grade+"]");
    }

}
