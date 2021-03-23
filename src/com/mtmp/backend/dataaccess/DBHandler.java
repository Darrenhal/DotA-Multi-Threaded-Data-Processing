package com.mtmp.backend.dataaccess;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBHandler {
	
	public DBHandler() {
		
		
		
	}
	
	public void dispatchArbitraryQuery(PreparedStatement stmt, ArrayList<String> params) {
		
		int i = 0;
		
		for(String param : params) {
			try {
				stmt.setString(i, param);
			} catch (SQLException e) {
				return;
			}
			
			i++;
		}
		
	}
	
	public ArrayList<APIKey> retrieveAPIKeys() {
		return null;
	}
	
	public void addAPIKeysToDB(ArrayList<APIKey> keys) {
		
	}
	
	public void updateHeroData() {
		
	}
	
}
