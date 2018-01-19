package com.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import com.Dao.UserDao;
import com.Model.User;

public class UserDaoImpl implements UserDao{

	List<User> l;
	public void addUser(User u) {
	
	l=new ArrayList<User>();
	l.add(u);
	
	for(User c:l)
		System.out.println(c.getName());
	}
	
	public void show(String email)
	{
		User u=new User();
		u.setEmail(email);
		
		System.out.println(u.getEmail());
	}

}
