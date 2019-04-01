package prototype_pattern;

/**
 *
 * @author Akash
 */
public class PrototypeTest {
    
    public Bike makeAdv(Bike basicbike){
        basicbike.makeAdvanced();
        return basicbike;
    }
    public static void main(String[] args) throws Exception{
        Bike bike=new Bike();
        Bike basicBike=bike.clone();
        PrototypeTest pt=new PrototypeTest();
        Bike newbike =pt.makeAdv(basicBike);
        System.out.print(newbike);
        System.out.println(newbike.hashCode());
        System.out.println(bike +"Hashcode= " +bike.hashCode());
        
    }
}
