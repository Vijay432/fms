package com.dev.service;

import com.dev.dao.DAO;
import com.dev.dao.DAOImpl;

public class DeleteParticipantService {

	public static boolean deleteParticipant(int participantDTO) {
		
		boolean delete = false;
		DAO dao = new DAOImpl();
		delete=dao.deleteParticipant(participantDTO);
		return delete;
	}

	
}
