package lab;

import common.Employee;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author zsummers
 */
public class Act4 {
    public static void main(String[] args) {
        Set<Employee> emps = new HashSet<>();
        emps.add(new Employee("Sanderson","Happy","123-56-7890"));
        emps.add(new Employee("Applegate","Angel","621-83-2104"));
        emps.add(new Employee("Stewart","Hewey","452-27-4824"));
        emps.add(new Employee("Applegate","Angel","621-83-2104"));
        
        List<Employee> empList = new ArrayList<>(emps);
        
        for(Employee e:empList){
            System.out.println(e);
            //I implicity used toString, by calling println on the object.
        }
    }
}
