package lab.class21;

import common.Employee;
import java.util.Comparator;
import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 *
 * @author zsummers
 */
public class EmployeeBySsn implements Comparator<Employee>{
    
    @Override
    public int compare(Employee self, Employee in) {
        
        return new CompareToBuilder()
                .append(self.getSsn(), in.getSsn())
                .toComparison();
    }
    
}
