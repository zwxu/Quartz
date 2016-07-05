package com.ustc.service;

import com.ustc.model.User;
import com.ustc.model.UserDAO;

public class UserServiceImpl implements UserService{
	
	private UserDAO userDao;
	
	



	public UserDAO getUserDao() {
		return userDao;
	}





	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}





	public User find(int id){  
       User user = userDao.selectByPrimaryKey(id);
       return user;
    }  

}
