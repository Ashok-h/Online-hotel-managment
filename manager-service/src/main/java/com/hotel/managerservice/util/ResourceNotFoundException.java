package com.hotel.managerservice.util;

public class ResourceNotFoundException extends RuntimeException {
	
	public ResourceNotFoundException(String msg) {
		super(msg);
	}
}
