
package abstractfactory_pattern;

/**
 *
 * @author Akash
 */
public class AbstractFatoryTest {
    public static void main(String[] args){
        IMobileFactory imbf=new LenovoFactory();
        Lenovo lenmob=(Lenovo)imbf.createMobile("len");
        lenmob.batteryPower();
    }
}
