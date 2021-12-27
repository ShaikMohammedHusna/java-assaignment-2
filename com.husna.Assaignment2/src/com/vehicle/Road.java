package com.vehicle;

public class Road {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle t=new Truck("red", "Truck 101", 6);
	    t.start();
	    t.breaks();
	    ((Truck)t).loadingCapacity();
	    
	    Vehicle b=new Bus("yellow","Bus 101",6);
	    b.start();
		b.breaks();
		((Bus)b).carries();
		
		Vehicle c=new Car("White","Car 101",4);
		c.start();
		c.breaks();
		((Car)c).speed();

	}
}
