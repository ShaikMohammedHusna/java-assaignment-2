package com.vehicle;

public class City {
	public static void main(String[] args) {
		Vehicle t=new Truck("red", "Truck 101", 6);
		t.display();
	    t=new Bus("yellow","Bus 101",6);
	    t.display();
		t=new Car("White","Car 101",4);
        t.display();
	}
}
