// @author Akash
package composite_pattern;

/**
 *
 * 
 */
public class Developer implements Employees{
    private String name;
    private double salary;

    public Developer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(Employees emp) {
        //has to be empty as it is a leaf node
    }

    @Override
    public void remove(Employees emp) {
    }

    @Override
    public Employees getChild(int i) {
        return null;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void print() {
        System.out.println("--------------------------");
        System.out.println("Name = " +getName());
        System.out.println("Salary = " +getSalary());
        System.out.println("--------------------------");
        
    }

    @Override
    public String toString() {
        return "Developer{" + "name=" + name + ", salary=" + salary + '}';
    }
    
    
}
