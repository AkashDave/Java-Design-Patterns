package singleton;

/**
 *
 * @author Akash
 */
public class SingleTonC implements Cloneable{
    private static SingleTonC instance=new SingleTonC();
    private SingleTonC(){
        System.out.print("Creating...");
        if(instance!=null){
            throw new RuntimeException("Cant create instance. Please use getInstance()");
        }
    }
    public static SingleTonC getInstance(){
        return instance;
    }
    @Override 
    //This will need to implement Cloneable Interface
    protected Object clone() throws CloneNotSupportedException{
        //below condition won't allow to clone new object of this class
        if(instance!=null)
            throw new RuntimeException("Cant clone instance! Please use getInstance");
        return super.clone();
    }
    public static void main(String[] args) throws Exception{
        SingleTonC obj1=SingleTonC.getInstance();
        SingleTonC obj2=SingleTonC.getInstance();
        
        print("obj1", obj1);
        print("obj2", obj2);     

        SingleTonC obj3=(SingleTonC)obj1.clone();
        print("obj3",obj3);
    }
    static void print(String temp, SingleTonC temp1){
        System.out.println(String.format("Object: %s, HashCode: %d", temp, temp1.hashCode()));
    }

}
