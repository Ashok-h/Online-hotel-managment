package com.hotel.Reservationservice.util;

public class ResourceNotFoundException extends RuntimeException {
	
	public ResourceNotFoundException(String msg) {
		super(msg);
	}
}
