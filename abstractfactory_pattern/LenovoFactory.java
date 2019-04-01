package abstractfactory_pattern;

/**
 *
 * @author Akash
 */
public class LenovoFactory implements IMobileFactory{

    @Override
    public IMobile createMobile(String type) {
        IMobile mob=null;
        if(type.equalsIgnoreCase("len"))
            mob=new Lenovo();
        return mob;
    }
    
}

