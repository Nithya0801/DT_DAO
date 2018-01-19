package project99backend.project99backend;

import com.DaoImpl.UserDaoImpl;
import com.Model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	User u=new User();
    	
    	u.setName("welcome");
        System.out.println( "Hello World!" );
        UserDaoImpl ui=new UserDaoImpl();
        ui.addUser(u);
        ui.show("abc@gmail.com");
    }
}
