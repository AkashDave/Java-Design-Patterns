package factorypattern;

/**
 *
 * @author Akash
 */
public class MobileFactory {
    IMobile createMobile(String type){
        IMobile instance=null;
        if(type.equalsIgnoreCase("len")){
            instance=new Lenovo();
            System.out.println("Lenovo created.");
        }
        else if (type.equalsIgnoreCase("sam")){
            instance=new Samsung();
            System.out.println("Samsung Created.");
        }
        return instance;
    }
}