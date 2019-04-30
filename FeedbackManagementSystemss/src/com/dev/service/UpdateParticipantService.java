package com.dev.service;

import com.dev.dao.DAO;
import com.dev.dao.DAOImpl;

public class UpdateParticipantService {

	public static boolean updateParticipant(int participantDTO)
	{
	DAO dao = new DAOImpl();
	boolean b =dao.updateParticipant(participantDTO);
	return b;
}
}
