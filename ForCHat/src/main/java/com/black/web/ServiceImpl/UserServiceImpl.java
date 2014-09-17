package com.black.web.ServiceImpl;

import java.util.List;

import com.black.web.DAO.UserDao;
import com.black.web.POJO.User;
import com.black.web.Service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void add(User user) {
		userDao.add(user);
	}

	public boolean delete(String id) {
		
		return userDao.delete(id);
	}

	public List<User> findAll() {
		
		return userDao.findAll();
	}

	public User findOne(String id) {
		
		return userDao.findOne(id);
	}

	public boolean update(User user) {
		
		return userDao.update(user);
	}

}
