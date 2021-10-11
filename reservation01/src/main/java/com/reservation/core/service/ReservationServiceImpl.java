package com.reservation.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.reservation.core.bo.Reservation;
import com.reservation.core.dao.IReservationDao;

@Service 
@Transactional
public class ReservationServiceImpl implements IReservationService{

	@Autowired  
	private IReservationDao reservationDao ; 
	
	public Reservation addReservation(Reservation reservation) {	
		return reservationDao.create(reservation);
	}

}
