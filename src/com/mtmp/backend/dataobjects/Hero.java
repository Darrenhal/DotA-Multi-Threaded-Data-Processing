package com.mtmp.backend.dataobjects;

public class Hero {
	
	private int heroID;
	private String heroName;
	private String heroSystemName;
	
	public Hero(int heroID, String heroName, String heroSystemName) {
		
		this.heroID = heroID;
		this.heroName = heroName;
		this.heroSystemName = heroSystemName;
		
	}
	
	public int getHeroID() {
		return heroID;
	}
	
	public String getHeroName() {
		return heroName;
	}
	
	public String getHeroSystemName() {
		return heroSystemName;
	}
	
}
