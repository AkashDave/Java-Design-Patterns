package builder_pattern;

/**
 *
 * @author Akash
 */
public class TestBuilder {
    public static void main(String[] args){
        Cake whitecake=new Cake.CakeBuilder().sugar(5).butter(2).cherry(3).milk(1).build();
        System.out.println(whitecake);
        
    }
}
