//Structural design pattern
package proxy_pattern;

/**
 *
 * @author Akash
 */
public class Folder implements IFolder{

    @Override
    public void performOperation() {
        System.out.println("Performing operation of folder...");
    }
    
}
