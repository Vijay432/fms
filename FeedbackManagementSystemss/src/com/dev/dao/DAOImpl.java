package com.dev.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dev.dto.ParticipantDTO;
import com.dev.dto.User;
import com.dev.utils.DBUtils;;
public class DAOImpl implements DAO {

	@Override
	public User login(String employee_name, String password, String role) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		User u = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataglobalsolution_db?user=root&password=root");
			String sql = "select * from employee_table where employee_name= ? and password=? and role=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, employee_name);
			pstmt.setString(2, password);
			pstmt.setString(3, role);
			rs = pstmt.executeQuery();
			if(rs.next()) 
			{
				System.out.println(rs);
				u=new User();
				u.setEmployee_name(rs.getString("employee_name"));
				u.setPassword(rs.getString("password"));
				u.setRole(rs.getString ("role"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return u;
	}

	@Override
	public boolean addParticipant(ParticipantDTO participantDTO) {
		boolean result=false;
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataglobalsolution_db?user=root&password=root");

			String sql = "insert into employee_table values(?,?,?,?)";
			pstmt =con.prepareStatement(sql);
			pstmt.setInt(1, participantDTO.getEmployeeid());
			pstmt.setString(2, participantDTO.getEmployee_name());
			pstmt.setString(3, participantDTO.getPassword());
			pstmt.setString(4, participantDTO.getRole());
			
			int count = pstmt.executeUpdate();
			if(count>0) {
				System.out.println("participant added succesfully");
				result=true;
			}else {
				System.out.println("something went wrong");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}	
		}
		
		return false;
	}

	@Override
	public boolean deleteParticipant(int participantDTO) {
		boolean result=false;
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataglobalsolution_db?user=root&password=root");

			String query = "Delete from employee_table where employee_id=?";
			
			pstmt = con.prepareStatement(query);
			
			pstmt.setInt(1, participantDTO);
			int count = pstmt.executeUpdate();
			if(count>0)
			{
				System.out.println("Deleted succesfully");
				return true;
			}
			else
			{
				System.out.println("Something went wrong");
				
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt!=null)
			{
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return false;
	}

	@Override
	public boolean updateParticipant(int participantDTO) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataglobalsolution_db?user=root&password=root");
			
			String query = "update employee_table set employee_name=?, password=?, role=? where employee_id=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, participantDTO);
			pstmt.setInt(2, participantDTO);
			pstmt.setInt(3, participantDTO);

			
			int count = pstmt.executeUpdate();
			if(count>0) {
				System.out.println("update succesfully");
				return true;
			}else {
				System.out.println("update failed");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt!=null)
			{
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		return false;
	}

	
	
}
