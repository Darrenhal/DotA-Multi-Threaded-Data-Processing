package com.mtmp.backend.dataaccess;

import java.util.HashMap;

public class APIDefinitions {
	
	private final String devEnvironmentDefinition = "";
	private final String liveEnvironmentDefinition = "";
	
	public APIDefinitions() {
		
	}
	
	public String getDevEnvironmentDefinition() {
		return devEnvironmentDefinition;
	}
	
	public String getLiveEnvironmentDefinition() {
		return liveEnvironmentDefinition;
	}
	
	public HashMap<String, String> getAllDefinitions() {
		HashMap<String, String> definitions = new HashMap<String, String>();
		
		definitions.put("DevEnv", devEnvironmentDefinition);
		definitions.put("LiveEnv", liveEnvironmentDefinition);
		
		return definitions;
	}
	
}
