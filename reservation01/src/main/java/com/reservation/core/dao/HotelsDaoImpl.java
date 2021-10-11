package com.reservation.core.dao;



import org.springframework.stereotype.Repository;

import com.reservation.core.bo.Hotels;
import com.reservation.genericdao.GenericDaoImpl;

@Repository 
public class HotelsDaoImpl extends GenericDaoImpl<Hotels, Integer> implements IHotelsDao {
	
	
}
