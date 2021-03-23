package com.mtmp.backend.dataobjects;

public class Item {
	
	private int itemID;
	private String itemName;
	private String itemDescription;
	
	public Item(int itemID, String itemName, String itemDescription) {
		
		this.itemID = itemID;
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		
	}
	
	public int getItemID() {
		return itemID;
	}
	
	public String getItemName() {
		return itemName;
	}
	
	public String getItemDescription() {
		return itemDescription;
	}
	
}
