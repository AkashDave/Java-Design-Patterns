
package factorypattern;

/**
 *
 * @author Akash
 */
public class FactoryTest {
    public static void main(String[] args){
        MobileFactory factory=new MobileFactory();
        Lenovo lenmob=(Lenovo)factory.createMobile("len");
        lenmob.cost();
        Samsung samsungmob=(Samsung)factory.createMobile("sam");
        samsungmob.batteryPower();
    }
}
