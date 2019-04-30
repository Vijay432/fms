package com.dev.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.dto.ParticipantDTO;
import com.dev.service.AddParticipantService;
@WebServlet("/add")
public class AddParticipantController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");

		int employeeid = Integer.parseInt(req.getParameter("employee_id"));
		String username = req.getParameter("employee_name");
		String password = req.getParameter("password");
		String role=req.getParameter("role");
		
		System.out.println("ok1");
		ParticipantDTO participant = new ParticipantDTO();
		
		participant.setEmployeeid(employeeid);
		participant.setEmployee_name(username);
		participant.setPassword(password);
		participant.setRole(role);
		
		boolean add = AddParticipantService.addParticipant(participant);
		
		if(add == true) {
			System.out.println("succesfull");
			resp.sendRedirect("./TrainerHomePage.jsp");
		}
		else {
			resp.sendRedirect("./ParticipantEnrollment.jsp");
			
		}	
	}

}
