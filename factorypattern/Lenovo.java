package factorypattern;

/**
 *
 * @author Akash
 */
public class Lenovo implements IMobile {

    @Override
    public void cost(){
        System.out.println("Lenovo cost is 7000.");
    }
    @Override
    public void pictureCapacity(){
        System.out.println("picture Capacity of Lenovo is too much.");
    }
    @Override
    public void batteryPower(){
        System.out.println("Battery Power of Lenovo is too low.");
    }

    @Override
    public String toString() {
        return "Lenovo{" +super.toString()+"}";
    }
    
}
