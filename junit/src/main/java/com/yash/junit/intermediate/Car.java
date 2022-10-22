/**
 * 
 */
package com.yash.junit.intermediate;

/**
 * @author tanay.ojha
 *
 */
public class Car {
	
	private int speed;
	private String carOwner;
	private String carType;
	private boolean flagSold;
	
	/**
	 * 
	 */
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public Car(int speed, String carOwner, String carType, boolean flagSold) {
		super();
		this.speed = speed;
		this.carOwner = carOwner;
		this.carType = carType;
		this.flagSold = flagSold;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getCarOwner() {
		return carOwner;
	}

	public void setCarOwner(String carOwner) {
		this.carOwner = carOwner;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public boolean isFlagSold() {
		return flagSold;
	}

	public void setFlagSold(boolean flagSold) {
		this.flagSold = flagSold;
	}

}
