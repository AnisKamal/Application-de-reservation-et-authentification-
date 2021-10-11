package com.reservation.core.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class RegisteredUsers {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ; 
	
	private String email ; 
	
	private String password ; 
	
	private String userName ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUser_name() {
		return userName;
	}

	public void setUser_name(String user_name) {
		this.userName = user_name;
	} 
	
}
