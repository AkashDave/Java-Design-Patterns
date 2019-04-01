package factorypattern;

/**
 *
 * @author Akash
 */
public class Samsung implements IMobile {

    @Override
    public void cost() {
        System.out.println("Samsung cost is 7000.");
    }

    @Override
    public void pictureCapacity() {
        System.out.println("picture Capacity of Samsung is too much.");
    }

    @Override
    public void batteryPower() {
        System.out.println("Battery Power of Samsung is too low.");
    }
    
}
