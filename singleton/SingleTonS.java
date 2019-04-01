package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Akash
 */
public class SingleTonS implements Serializable{
    private static SingleTonS instance=new SingleTonS();
    private SingleTonS(){
        System.out.print("Creating...");
        if(instance!=null){
            throw new RuntimeException("Cant create instance. Please use getInstance()");
        }
    }
    public static SingleTonS getInstance(){
        return instance;
    }
    
    public static void main(String[] args) throws Exception{
        SingleTonS obj1=SingleTonS.getInstance();
        SingleTonS obj2=SingleTonS.getInstance();
        
        print("obj1", obj1);
        print("obj2", obj2);
        
        ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("obj1.ser"));
        os.writeObject(obj1);
        
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("obj1.ser"));
        SingleTonS obj3=(SingleTonS)ois.readObject();
        
        print("obj3", obj3);
}
    static void print(String temp, SingleTonS temp1){
        System.out.println(String.format("Object: %s, HashCode: %d", temp, temp1.hashCode()));
    }
    
    // If this method is present in a class then newly formed Object 
    // will call this method IMPLICITLY 
    // and restrict creating new hashcode
    private Object readResolve(){
        //Remove this method to obtain new instance with new hashcode-----//
        System.out.println("applying readResolve...");
        return instance;
    }
}