package singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Akash
 */
public class SingleTonT {
    private static SingleTonT instance=null;
    
    private SingleTonT(){
        System.out.println("creating...");
    }
    public static SingleTonT getInstance(){
        if(instance==null)
            return instance=new SingleTonT();
        return instance;
    }
    static void useSingleTon(){
        SingleTonT singleton=SingleTonT.getInstance();
        print("singleton", singleton);
    }
    public static void main(String[] args)throws Exception{
        ExecutorService service;
        service = Executors.newFixedThreadPool(2);
        service.submit(SingleTonT::useSingleTon);
        service.submit(SingleTonT::useSingleTon);
        service.shutdown();
        
    }
    static void print(String temp, SingleTonT temp1){
        System.out.println(String.format("Object: %s, HashCode: %d", temp, temp1.hashCode()));
    }
}
