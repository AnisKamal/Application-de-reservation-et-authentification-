package com.reservation.core.service;

import com.reservation.core.bo.Hotels;

public interface IHotelsService {
	public Hotels ajouterHotels(Hotels hotels);
	
	public Hotels ModifierHotels(Hotels hotels);
	
	public void SupprimerHotels(Integer id);
	
	public Hotels getHotels(Integer id);
	
}
