package com.dev.service;

import com.dev.dao.DAO;
import com.dev.dao.DAOImpl;
import com.dev.dto.User;

public class UserService {
	public User userLogin(String employee_name, String password, String role) {
		DAO dao = new DAOImpl();
		System.out.println("gdhgfn");
	
		User u = dao.login(employee_name, password,role);
		return u;
		
	}
}
