package HomeTask1;

import java.util.ArrayList;
import java.util.Collections;

public class SortEmployeeNameDescendingOrderJavaEight_11 {
    public static void main(String[] args) {
        ArrayList<ComparatorInterfaceForNames_6> employees = new ArrayList<ComparatorInterfaceForNames_6>();
        employees.add(new ComparatorInterfaceForNames_6("Mayank", 23, 111));
        employees.add(new ComparatorInterfaceForNames_6("Anshul", 19, 131));
        employees.add(new ComparatorInterfaceForNames_6("Solanki", 12, 121));
        employees.add(new ComparatorInterfaceForNames_6("Aggarwal", 25, 101));
        employees.add(new ComparatorInterfaceForNames_6("xRaghib", 25, 101));
        Collections.sort(employees,(E1,E2)->{
           return E2.name.compareTo(E1.name);
        });
        System.out.println(employees);
    }
}
