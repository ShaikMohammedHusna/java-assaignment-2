package com.vehicle;

public class Vehicle {
	private String color,model;
	private int noOfWeels;
	
	public Vehicle(String color, String model, int noOfWeels) {
		super();
		this.color = color;
		this.model = model;
		this.noOfWeels = noOfWeels;
	}
	 void start() {
		System.out.println("Vehicle started");
	}
	 void breaks()
	{
		System.out.println("Vehicle stoped");
	}
	public void display() {
		System.out.println("");
	}
}
