package HomeTask1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortEmployeeNameDescendingOrderNormal_11 {
    public static void main(String[] args){
        ArrayList<ComparatorInterfaceForNames_6> employees = new ArrayList<ComparatorInterfaceForNames_6>();
        employees.add(new ComparatorInterfaceForNames_6("Mayank", 23, 111));
        employees.add(new ComparatorInterfaceForNames_6("Anshul", 19, 131));
        employees.add(new ComparatorInterfaceForNames_6("Solanki", 12, 121));
        employees.add(new ComparatorInterfaceForNames_6("Aggarwal", 25, 101));
        employees.add(new ComparatorInterfaceForNames_6("Raghib", 25, 101));
        Collections.sort(employees,new sortByName_6().reversed());
        System.out.println(employees);

    }
}
