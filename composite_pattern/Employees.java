//@author Akash
package composite_pattern;

/** 1) We will create component Interface
 *  It represent object in composition. 
 *  It has all common operations that will be applicable to both manager and developer.
 */
public interface Employees {
    
    public void add(Employees emp);
    public void remove(Employees emp);
    public Employees getChild(int i);
    public String getName();
    public double getSalary();
    public void print();
}
