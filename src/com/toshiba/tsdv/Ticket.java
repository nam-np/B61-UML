package com.toshiba.tsdv;

public abstract class Ticket {
	
	private Gate origin; 
	private int value; 
	
	public Ticket(int value) { 
		this.value = value; 
	}  
	
	public int getValue() { 
		return value; 
	} 
	
	public void deduct(int amount) { 
		value -= amount; 
	} 
	
	public void setOrigin(Gate gate) { 
		origin = gate; 
	} 
	
	public Gate getOrigin() { 
		return origin; 
	} 
	
	public abstract void adjustValue(int amount); 
	public abstract boolean isValid(); 
	
}
