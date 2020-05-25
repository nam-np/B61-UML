package com.toshiba.tsdv;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrepaidCard card = new PrepaidCard(1000);
		OneWayTicket oneway = new OneWayTicket(100);
		Line line = new Line();
		line.A.enter(card);
		line.D.exit(card);

		line.A.enter(oneway);
		line.B.exit(oneway);
		
	}

}
