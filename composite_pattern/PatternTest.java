package composite_pattern;

/**
 *
 * @author Akash
 */
public class PatternTest {
    public static void main(String[] args){
        Employees emp1=new Manager("Akash", 222000);
        Employees emp2=new Developer("Parth", 200100);
        emp1.add(emp2);
        //System.out.println(emp1.getChild(0).toString());
        emp1.print();
        //emp2.print();
    }
}
