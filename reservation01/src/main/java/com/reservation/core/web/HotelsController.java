package com.reservation.core.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reservation.core.bo.Hotels;
import com.reservation.core.bo.Reservation;
import com.reservation.core.service.IHotelsService;
import com.reservation.core.service.IReservationService;

@RestController 
@RequestMapping("/api")
public class HotelsController {
	
	@Autowired
	private IHotelsService hotelsService;
	
	@Autowired
	private IReservationService reservationService;
	
	
	@PostMapping("/ajoutHotel")
	public Hotels ajouterHotels(@RequestBody Hotels hotels) {
	     return	hotelsService.ajouterHotels(hotels);
	}
	
	@PostMapping("/ModifierHotels")
	public Hotels ModifierHotels(@RequestBody Hotels hotels) {
		return hotelsService.ModifierHotels(hotels);
	}
	
	@GetMapping("/get/{id}") 
	public Hotels getHotel(@PathVariable Integer id) {
		return hotelsService.getHotels(id);
	}
	
	@GetMapping("delete/{id}")
	public void SupprimerHotels(@PathVariable Integer id) {
		hotelsService.SupprimerHotels(id);
	}
	
	@PostMapping("/AddReservation")
	public Reservation ajouterReservation(@RequestBody Reservation reservation) {
		return reservationService.addReservation(reservation);
	}
}