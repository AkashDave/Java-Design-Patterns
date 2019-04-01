package facade_pattern;

/**
 *
 * @author Akash
 */
public class Facade {
    int cubeX(int x){
        Class1 c1=new Class1();
        return c1.doCube(x);
    }
    int twiceOfCubeX(int x){
        Class1 c1=new Class1(); Class2 c2=new Class2();
        return c2.twiceOfCube(c1, x);
    }
    int multiplyboth(int x){
        Class1 c1=new Class1(); Class2 c2=new Class2();
        Class3 c3=new Class3();
        return c3.doMore(c1, c2, x);
    }
}
