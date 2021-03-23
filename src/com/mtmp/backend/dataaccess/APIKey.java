package com.mtmp.backend.dataaccess;

public class APIKey {
	
	private String developerKey;
	
	public APIKey(String developerKey) {
		this.developerKey = developerKey;
	}
	
	public String getKey() {
		return developerKey;
	}
	
}
