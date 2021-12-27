package com.vehicle;

public class Bus extends Vehicle {
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

	public Bus(String color, String model, int noOfWeels) {
		super(color, model, noOfWeels);
		this.color=color;
		this.model=model;
		this.noOfWeels=noOfWeels;
		
	}
	
	@Override
    public void start()
    {
		System.out.println("Bus started");
    }
	@Override
	public void breaks() {
		System.out.println("Bus stoped");
	}
	public void carries() {
		System.out.println("Bus carries people");
	}
	public void display() {
    	System.out.println("Bus color is:"+getColor()+" Bus model is:"+getModel()+" No of Weels are:"+getNoOfWeels());
    }
}
