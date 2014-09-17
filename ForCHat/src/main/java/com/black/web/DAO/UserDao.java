package com.black.web.DAO;

import java.util.List;

import com.black.web.POJO.User;

public interface UserDao {
	
	public void add(User user);
	
	public boolean delete(String id);
	
	public boolean update(User user);
	
	public List<User> findAll();
	
	public User findOne(String id);
	
}
