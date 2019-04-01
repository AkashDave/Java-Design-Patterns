package abstractfactory_pattern;

/**
 *
 * @author Akash
 */
public class Lenovo implements IMobile{

    @Override
    public void cost() {
        System.out.println("cost of lenovo is 7000.");
    }

    @Override
    public void pictureCapacity() {
        System.out.println("PictureCapacity of lenovo is too much.");
    }

    @Override
    public void batteryPower() {
        System.out.println("BatteryPower of lenovo is too low.");
    }

    @Override
    public String toString() {
        return "Lenovo{" + '}';
    }
    
}
