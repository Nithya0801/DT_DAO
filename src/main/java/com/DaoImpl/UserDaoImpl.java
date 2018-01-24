package com.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Dao.UserDao;
import com.Model.User;

@Repository
public class UserDaoImpl implements UserDao{

	List<User> l;
	 @Autowired
	    SessionFactory sessionFactory;
	public void addUser(User u) {
	
/*	l=new ArrayList<User>();
	l.add(u);
	
	//for(User c:l)
		System.out.println(c.getName());*/
	
	Session s=sessionFactory.openSession();
    s.beginTransaction();
    s.persist(u);
    s.getTransaction().commit();
    s.close();
	
	}
	
	public void show(String email)
	{
		User u=new User();
		u.setEmail(email);
		
		System.out.println(u.getEmail());
	}

	
	public List<User> getAllUser()
	{
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		List<User> l=s.createQuery("from User").list();
		
		
		s.getTransaction().commit();
		s.close();
		
		return l;
	}
}

