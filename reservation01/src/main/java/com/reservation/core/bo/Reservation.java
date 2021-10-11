package com.reservation.core.bo;

import java.util.Date; 

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity 
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ; 
	
	private Date CheckInDate ; 
	
	private Date CheckOutDate;
	
	@ManyToOne
	@JoinColumn(name="id_hotel")
	public Hotels hotels ; 
	
	@ManyToOne
	@JoinColumn(name="id_user")
	public RegisteredUsers registeredUsers ; 

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCheckInDate() {
		return CheckInDate;
	}

	public void setCheckInDate(Date checkInDate) {
		CheckInDate = checkInDate;
	}

	public Date getCheckOutDate() {
		return CheckOutDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		CheckOutDate = checkOutDate;
	}

	public Hotels getHotels() {
		return hotels;
	}

	public void setHotels(Hotels hotels) {
		this.hotels = hotels;
	}

	public RegisteredUsers getRegisteredUsers() {
		return registeredUsers;
	}

	public void setRegisteredUsers(RegisteredUsers registeredUsers) {
		this.registeredUsers = registeredUsers;
	}
	
	
}
