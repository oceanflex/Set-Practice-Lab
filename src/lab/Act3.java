package lab;

import common.Dog;
import common.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zsummers
 */
public class Act3 {
    public static void main(String[] args) {
        List stuff = new ArrayList();
        stuff.add(new Employee("Black","Sirius","101-22-3040"));
        stuff.add(new Dog("Fido",65730));
        
        for(Object o:stuff){
            System.out.println(o);
        }
    }
    
}
