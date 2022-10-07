package org.yash.java8.stream.program1;

import java.time.LocalDateTime;

public class Item {
	int itemId;
	String itemName;
	float price;
	LocalDateTime date_of_manufacturing;
	LocalDateTime date_of_expiry;
	
	public Item(int itemId, String itemName, float price, LocalDateTime date_of_manufacturing,
			LocalDateTime date_of_expiry) {
		
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
		this.date_of_manufacturing = date_of_manufacturing;
		this.date_of_expiry = date_of_expiry;
	}

	public Item(String itemName2, float price2) {
		this.itemName = itemName2;
		this.price = price2;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public LocalDateTime getDate_of_manufacturing() {
		return date_of_manufacturing;
	}

	public void setDate_of_manufacturing(LocalDateTime date_of_manufacturing) {
		this.date_of_manufacturing = date_of_manufacturing;
	}

	public LocalDateTime getDate_of_expiry() {
		return date_of_expiry;
	}

	public void setDate_of_expiry(LocalDateTime date_of_expiry) {
		this.date_of_expiry = date_of_expiry;
	}

	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", price=" + price + "]";
	}
	
	
	
}
