package proxy_pattern;

/**
 *
 * @author Akash
 */
public class ProxyTest {
    public static void main(String[] args){
        User user1=new User("akash", "pass");
        FolderProxy fp=new FolderProxy(user1);
        fp.performOperation();
    }
}
