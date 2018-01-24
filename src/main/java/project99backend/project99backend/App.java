package project99backend.project99backend;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.DaoImpl.UserDaoImpl;
import com.Model.User;
import com.config.HibernateConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 User u=new User();
    	 u.setName("sai");
    	 u.setEmail("aaa@gmail.com");
    	 u.setPhone("123456787");
    	 u.setAddress("aaa");
    	 u.setCountry("india");
    	
    	  HibernateConfig config=new HibernateConfig();
    	 
    	//SessionFactory sessionFactory= config.sessionFactory(config.dataSource());
    	
    //	System.out.println(sessionFactory.getCurrentSession());
    	System.out.println("Session Factory Craeated!!!");
    	System.out.println(config.sessionFactory(config.dataSource()));
    	/*Session session=(Session) config.txManager(sessionFactory);
    	
    	
    	 session.beginTransaction();
    	 session.save(u);
    	 session.getTransaction().commit();*/
   //	u.setName("welcome");
     //   System.out.println( "Hello World!" );
       // UserDaoImpl ui=new UserDaoImpl();
        //ui.addUser(u);
        //ui.show("abc@gmail.com");
    	
    	     	
    	
    	
    }
}
 