package com.toshiba.tsdv;

public class Gate {
	
	private final String name;  
	private final int distance; 
	
	public Gate(String name, int distance) {  
		this.name = name;  
		this.distance = distance; 
	}
	
	public void enter(Ticket ticket) {  
		if (ticket.isValid() && ticket.getOrigin() == null){ 
			//A
			ticket.setOrigin(this);
			open();  
			} else {  
				close();  
			}  
		
	}
	
	public void exit(Ticket ticket) {  
		Gate origin = ticket.getOrigin();  
		if (origin != null) {  
			int d = Math.abs(origin.distance - distance); 
			int fare = Line.getFare(d);  
			//B
			if (ticket.isValid()) { 
				ticket.adjustValue(fare); 
				ticket.setOrigin(null);  
				open();  
				return;  
			}  
		}  close();  
	}  
	
	private void open() {  
		System.out.println(name + ": open");  }  
	
	private void close() {  
		System.out.println(name + ": closed");  
	}
}

