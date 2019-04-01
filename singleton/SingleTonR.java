package singleton;
/**
 *
 * @author Akash
 */
import java.lang.reflect.Constructor;


public class SingleTonR {
    private static SingleTonR instance=new SingleTonR();
    private SingleTonR(){
        System.out.print("Creating...");
        //below condition will not allow creating more than one instance of this class
        if(instance!=null){
            throw new RuntimeException("Cant create instance. Please use getInstance()");
        }
    }
    public static SingleTonR getInstance(){
        return instance;
    }
    
    public static void main(String[] args) throws Exception{
        SingleTonR obj1=SingleTonR.getInstance();
        SingleTonR obj2=SingleTonR.getInstance();
        
        print("obj1", obj1);
        print("obj2", obj2);
        
        Class clazz=Class.forName("first.SingleTonR");
        Constructor<SingleTonR> ctor=clazz.getDeclaredConstructor();
        ctor.setAccessible(true);
        SingleTonR s3=ctor.newInstance();

    }
    static void print(String temp, SingleTonR temp1){
        System.out.println(String.format("Object: %s, HashCode: %d", temp, temp1.hashCode()));
    }
}
