package com.dev.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.service.UpdateParticipantService;


@WebServlet("/update")
public class UpdateParticipantController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("employee_id"));
		

		boolean b = UpdateParticipantService.updateParticipant(id);

		if(b)
		{
			System.out.println("deleted");
		}else
		{
			System.out.println("failed");
		}

	}


}
