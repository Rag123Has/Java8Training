package HomeTask7;

public class Employee {

    String name;
   double  accountNumber;
   double salary;

   Employee(String name, double accountNumber,double salary){
       this.name=name;
       this.accountNumber=accountNumber;
       this.salary=salary;
   }

    public String toString() {
        return ("Employee ["+" Name:"+this.name+
                " account number :"+this.accountNumber+
                " salary:"+this.salary+
                "]");
    }

}
