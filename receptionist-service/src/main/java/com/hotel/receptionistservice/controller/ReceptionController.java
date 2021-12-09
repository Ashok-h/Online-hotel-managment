package com.hotel.receptionistservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.receptionistservice.models.Guest;
import com.hotel.receptionistservice.models.GuestList;
import com.hotel.receptionistservice.services.GuestService;

@RestController
@RequestMapping("/Reception")
public class ReceptionController {
	@Autowired
	private GuestService service;
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello Receptionist";
	}
	
	@PostMapping("/addGuest")
	public Guest addGuest(@RequestBody Guest guest)
	{
		return this.service.addGuest(guest);
	}
	
	@PutMapping("/updateGuest")
	public Guest updateGuest(@RequestBody Guest guest)
	{
		return this.service.updateGuest(guest); 
	}
	
	@DeleteMapping("/deleteGuest/{id}")
	public String deleteGuestById(@PathVariable("id") String id)
	{
		return this.service.deleteGuest(Integer.parseInt(id));
	}
	
	@GetMapping("getGuest/{id}")
	public Optional<Guest> getGuest(@PathVariable String id)
	{
		return this.service.getGuest(Integer.parseInt(id));
	}
	
	@GetMapping("getAllGuest")
	public GuestList getAllGuest()
	{
		GuestList list=new GuestList();
		list.setAllGuest(this.service.getAllGuest());
		return list;
	}
	
}
