package com.hotel.ownerservice.util;

public class ResourceNotFoundException extends RuntimeException {
	
	public ResourceNotFoundException(String msg) {
		super(msg);
	}
}
