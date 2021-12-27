package com.vehicle;

public class Car extends Vehicle {
	private String color,model;
	private int noOfWeels;

	public String getColor() {
		return color;
	}

	public String getModel() {
		return model;
	}

	public int getNoOfWeels() {
		return noOfWeels;
	}

	public Car(String color, String model, int noOfWeels) {
		super(color, model, noOfWeels);
		this.color=color;
		this.model=model;
		this.noOfWeels=noOfWeels;
		
	}

	@Override
	public void start() {
		System.out.println("Car started");
	}
    
	@Override
	public void breaks() {
		System.out.println("Car stoped");
	}
	public void speed()
	{
		System.out.println("Car can goes with 300 kmph");
	}
	public void display() {
    	System.out.println("Car color is: "+getColor()+"Car model is:"+getModel()+" No of Weels are:"+getNoOfWeels());
    }
}