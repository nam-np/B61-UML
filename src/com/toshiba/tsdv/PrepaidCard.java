package com.toshiba.tsdv;

public class PrepaidCard extends Ticket{

	public PrepaidCard(int value) {
		//C
		super(value);
	}
	
	public void adjustValue(int amount) { 
		deduct(amount); 
	}
	
	public boolean isValid() { 
		return getValue() > 0; 
	} 
}
