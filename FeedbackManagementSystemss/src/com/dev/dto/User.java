package com.dev.dto;

public class User {
    
	private int employeeid;
	
	private String employee_name;
	
	private String password;
	
	private String role;

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	

	

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [employeeid=" + employeeid + ", employee_name=" + employee_name + ", password=" + password
				+ ", role=" + role + "]";
	}

	

	
	

}
