package prototype_pattern;

/**
 *
 * @author Akash
 */
public class Bike implements Cloneable{
    private int gears;
    private String biketype;
    private String model;
    
    public Bike(){
        biketype="standard";
        model="splendor 125";
        gears=4;
    }
    @Override
    public Bike clone() throws CloneNotSupportedException{
        return new Bike();
    }
    public void makeAdvanced(){
        biketype="Sports";
        model="Yamaha R1";
        gears=5;
    }
    public String getModel(){
        return model;
    }

    @Override
    public String toString() {
        return "Bike{" + "gears=" + gears + ", biketype=" + biketype + ", model=" + model + '}';
    }
    
}
