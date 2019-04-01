package facade_pattern;

/**
 *
 * @author Akash
 */
public class FacadeTest {
    public static void main(String[] args) {
        Facade f1=new Facade();
        System.err.println("Cube of 5: " +f1.cubeX(5));
        System.err.println("Twice of above result: " +f1.twiceOfCubeX(5));
        System.err.println("Multiplying Both: " +f1.multiplyboth(5));
    }
}
