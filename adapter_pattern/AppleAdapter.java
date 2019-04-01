package adapter_pattern;
//This pattern is of Structural Design Pattern

/**
 *
 * @author Akash
 */
public class AppleAdapter extends Apple {
    private Orange orange;
    
    public AppleAdapter(Orange orange){
        this.orange=orange;
    }
    public void getColor(String clr){
        orange.getOrangeColor("Orange color will be: " +clr);
    }
}
