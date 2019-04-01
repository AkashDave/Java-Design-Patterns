// @author Akash
package composite_pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**  2) Now we will create manager (composite class)
 *   Key point is that all common method delegates its operation to child objects.
 *   It has method to access and modify its children
 */
public class Manager implements Employees {
    
    private String name;
    private double salary;

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    List<Employees> employees=new ArrayList<>();
    
    @Override
    public void add(Employees emp) {
        employees.add(emp);
    }

    @Override
    public void remove(Employees emp) {
        employees.remove(emp);
    }

    @Override
    public Employees getChild(int i) {
        return employees.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    int i;
    @Override
    public void print() {
        System.out.println("--------------------------");
        System.out.println("Name = " +getName());
        System.out.println("Salary = " +getSalary());
        System.out.println("--------------------------");
        
//        for(Employees e:employees){
//            print();
//        }
        Iterator<Employees> empIterator=employees.iterator();
        while(empIterator.hasNext()){
            Employees emp=empIterator.next();
            emp.print();
        }
    }

    @Override
    public String toString() {
        return "Manager{" + "name=" + name + ", salary=" + salary + '}';
    }
    
}
