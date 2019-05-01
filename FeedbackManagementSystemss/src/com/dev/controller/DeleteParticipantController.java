package com.dev.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.service.DeleteParticipantService;
@WebServlet("/delete")
public class DeleteParticipantController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("employee_id"));
		
		boolean b = DeleteParticipantService.deleteParticipant(id);
		
		if(b)
		{
			System.out.println("deleted");
			resp.sendRedirect("./ParticipantEnrollment.jsp");
		}else
		{
			System.out.println("failed");
		}
	}

}
