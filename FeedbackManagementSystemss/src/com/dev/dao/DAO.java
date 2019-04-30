package com.dev.dao;

import com.dev.dto.ParticipantDTO;
import com.dev.dto.User;

public interface DAO {

	User login(String employee_name, String passwordd,String role);
	
	boolean addParticipant(ParticipantDTO participantDTO);
	
	boolean deleteParticipant(int participantDTO);
	
	boolean updateParticipant(int participantDTO);
	
}
