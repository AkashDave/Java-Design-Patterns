package adapter_pattern;
//This pattern is of Structural Design Pattern
/**
 *
 * @author Akash
 */
public class AdapterPattTest {
    public static void main(String[] args){
        Apple a=new Apple();
        a.getAppleColor("red");
        
        Orange o=new Orange();
        AppleAdapter adp=new AppleAdapter(o);
        adp.getColor("Blue");
        adp.getAppleColor("Green");
    }
}
