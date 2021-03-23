package com.mtmp.backend.dataaccess;

public class APIThread {
	
	private APIKey key;
	
	private boolean pullingData;
	
	
	public APIThread(APIKey key) {
		
		this.key = key;
		this.pullingData = false;
		
	}
	
	public void stop() {
		pullingData = false;
	}
	
	public void pullMatchData(int matchSeqNum) {
		
		pullMatchData(matchSeqNum, -1);
		
	}
	
	public void pullMatchData(int matchSeqNum, int iterations) {
		
	}
	
}
