package lab;

import common.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zsummers
 */
public class Act2 {
    public static void main(String[] args) {
        List<Employee> emps = new ArrayList<>();
        
        emps.add(new Employee("Sanderson","Happy","123-56-7890"));
        emps.add(new Employee("Applegate","Angel","621-83-2104"));
        emps.add(new Employee("Stewart","Hewey","452-27-4824"));
        
        for(Employee e:emps){
            System.out.println(e);
            //I implicity used toString, by calling println on the object.
        }
    }
}
