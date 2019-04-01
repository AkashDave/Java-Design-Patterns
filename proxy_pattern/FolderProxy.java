//Structural design pattern
package proxy_pattern;

/**
 *
 * @author Akash
 */
public class FolderProxy implements IFolder {
    User user;
    Folder folder;

    public FolderProxy(User user) {
        this.user = user;
    }
    
    
    @Override
    public void performOperation(){
        if(user.getName().equals("akash") && user.getPassword().equals("pass")){
            System.out.println("Details Matched.");
            folder=new Folder();
            folder.performOperation();
        }
        else
            System.err.println("Details are not matched. Cannot access Folder Object!!");
    }
}
