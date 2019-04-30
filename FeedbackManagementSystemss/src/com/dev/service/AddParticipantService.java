package com.dev.service;

import com.dev.dao.DAO;
import com.dev.dao.DAOImpl;
import com.dev.dto.ParticipantDTO;

public class AddParticipantService {

	public static boolean  addParticipant(ParticipantDTO participantDTO) {
		boolean add = false;
		DAO dao = new DAOImpl();
		add=dao.addParticipant(participantDTO);
		return add;
	}
}
