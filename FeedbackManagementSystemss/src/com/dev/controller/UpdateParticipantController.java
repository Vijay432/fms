package com.dev.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.dto.ParticipantDTO;
import com.dev.service.UpdateParticipantService;


@WebServlet("/update")
public class UpdateParticipantController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("employee_id"));
		String employeename = req.getParameter("employee_name");
		String password = req.getParameter("password");
		String role = req.getParameter("role");

		ParticipantDTO dto = new ParticipantDTO();
		dto.setEmployeeid(id);
		dto.setEmployee_name(employeename);
		dto.setPassword(password);
		dto.setRole(role);

		boolean b = UpdateParticipantService.updateParticipant(dto);

		if(b)
		{
			System.out.println("updated");
			resp.sendRedirect("./ParticipantEnrollment.jsp");
		}else
		{
			System.out.println("failed");
		}

	}


}
