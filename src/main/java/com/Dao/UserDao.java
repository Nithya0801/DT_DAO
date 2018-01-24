package com.Dao;

import java.util.List;

import com.Model.User;

public interface UserDao {
	
	void addUser(User u);
 void show(String email);
 List<User> getAllUser();
}
