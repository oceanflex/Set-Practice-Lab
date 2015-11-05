package lab.class21;

import common.Employee;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
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
        
        Set<Employee> empsBySsn = new TreeSet<>(new EmployeeBySsn());
        empsBySsn.add(e1);
        empsBySsn.add(e4);
        empsBySsn.add(e2);
        empsBySsn.add(e3);
        
        //List<Employee> list = new ArrayList(empsBySsn);
        //Collections.sort(list, new EmployeeBySsn());
        for(Employee e:empsBySsn){
            System.out.println(e.getSsn());
        }//sorted alphabetically
    }
    
}
