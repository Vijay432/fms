package com.dev.service;

import com.dev.dao.DAO;
import com.dev.dao.DAOImpl;
import com.dev.dto.ParticipantDTO;

public class UpdateParticipantService {

	public static boolean updateParticipant(ParticipantDTO participantDTO)
	{
	DAO dao = new DAOImpl();
	boolean b =dao.updateParticipant(participantDTO);
	return b;
}
}
