package com.dev.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dev.dto.User;
import com.dev.service.UserService;


public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String username = req.getParameter("employee_name");
		String password = req.getParameter("password");
		String role=req.getParameter("role");
		
		System.out.println("Inside LoginServ");
		UserService userServices = new UserService();
		User u = userServices.userLogin(username, password, role);
		System.out.println(username);
		System.out.println(password);
		System.out.println(role);

		if(u!=null)
		{
			if(role.equalsIgnoreCase("admin"))
			{
				HttpSession session = req.getSession();
				session.setAttribute("user", u);
				resp.sendRedirect("./AdminHomePage.jsp");

			}
			if(role.equalsIgnoreCase("trainer"))
			{
				HttpSession session = req.getSession();
				session.setAttribute("user", u);
				resp.sendRedirect("./TrainerHomePage.jsp");
			}
			if(role.equalsIgnoreCase("participant"))
			{
				HttpSession session = req.getSession();
				session.setAttribute("user", u);
				resp.sendRedirect("./ParticipantHomePage.jsp");
			}
			
		}else {
			//Login Failed
			System.out.println("Login Failed");
			resp.sendRedirect("./Login.html");
		}

	}
}
