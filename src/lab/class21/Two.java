package lab.class21;

import common.Employee;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author zsummers
 */
public class Two {
    
    public static void main(String[] args) {
        Employee e1 = new Employee("Smith","Ivan","123-11-7345");
        Employee e2 = new Employee("Abbot","Ronald","234-22-1827");
        Employee e3 = new Employee("Hayes","Dinah","345-33-5083");
        Employee e4 = new Employee("Meyer","Oliver","345-33-5083");
        
        Map<String,Employee> emps = new HashMap<>();
        emps.put("Smith",e1);
        emps.put("Abbot",e4);
        emps.put("Hayes",e3);
        emps.put("Meyer",e2);
        Collection<Employee> e_vals = emps.values();
        for(Employee e:e_vals){
            System.out.println(e);
        }
        Set<String> e_keys = emps.keySet();
        for(String k:e_keys){
            System.out.println(k);
        }
    }
    
}
