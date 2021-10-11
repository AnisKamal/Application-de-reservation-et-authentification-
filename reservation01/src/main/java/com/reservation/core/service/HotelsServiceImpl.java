package com.reservation.core.service;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.reservation.core.bo.Hotels;
import com.reservation.core.dao.IHotelsDao;

@Service
@Transactional 
public class HotelsServiceImpl implements IHotelsService{
	
	@Autowired 
	private IHotelsDao hotelsRepository; 
	
	public Hotels ajouterHotels(Hotels hotel) {
		return hotelsRepository.create(hotel);
	}

	@Override
	public Hotels ModifierHotels(Hotels hotels) {
		
		return hotelsRepository.update(hotels);
	}

	@Override
	public void SupprimerHotels(Integer id) {
		hotelsRepository.delete(id);
	}

	@Override
	public Hotels getHotels(Integer id) {
		
		return hotelsRepository.find(id);
	}

}
