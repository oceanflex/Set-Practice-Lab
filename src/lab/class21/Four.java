package lab.class21;

import common.Employee;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author zsummers
 */
public class Four {
    
    public static void main(String[] args) {
        Employee e1 = new Employee("Smith","Ivan","123-11-7345");
        Employee e2 = new Employee("Abbot","Ronald","234-22-1827");
        Employee e3 = new Employee("Hayes","Dinah","345-33-5083");
        Employee e4 = new Employee("Meyer","Oliver","345-33-5083");
        
        Set<Employee> emps = new TreeSet<>();
        emps.add(e1);
        emps.add(e4);
        emps.add(e2);
        emps.add(e3);
        
        
        for(Employee e:emps){
            System.out.println(e);
        }//sorted alphabetically
    }
    
}
