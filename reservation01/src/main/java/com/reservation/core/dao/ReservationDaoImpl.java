package com.reservation.core.dao;

import org.springframework.stereotype.Repository;

import com.reservation.core.bo.Reservation;
import com.reservation.genericdao.GenericDaoImpl;

@Repository  
public class ReservationDaoImpl extends GenericDaoImpl<Reservation, Integer> 
implements IReservationDao{

}
