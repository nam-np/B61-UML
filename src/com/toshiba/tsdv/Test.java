package com.toshiba.tsdv;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrepaidCard card = new PrepaidCard(100);
		OneWayTicket oneway = new OneWayTicket(1);
		Line line = new Line();
		line.A.enter(card);
		line.D.exit(card);

		line.B.enter(oneway);
		line.D.exit(oneway);
		
	}

}
