package facade_pattern;

/**
 *
 * @author Akash
 */
public class Class3 {
    int doMore(Class1 c1, Class2 c2, int x){
        return c1.doCube(x)*c2.twiceOfCube(c1,x);
    }
}
