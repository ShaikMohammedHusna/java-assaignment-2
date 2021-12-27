package com.vehicle;

public class Truck extends Vehicle {
	
	private String color,model;
	private int noOfWeels;

	public Truck(String color, String model, int noOfWeels) {
		super(color, model, noOfWeels);
		this.color=color;
		this.model=model;
		this.noOfWeels=noOfWeels;
	
	}
	@Override
	public void start() {
		System.out.println("Truck started");
	}
    public String getColor() {
		return color;
	}
	public String getModel() {
		return model;
	}
	public int getNoOfWeels() {
		return noOfWeels;
	}
	@Override
    public void breaks() {
    	System.out.println("Truck stoped");
    }
    public void loadingCapacity() {
    	System.out.println("Truck can load 50 tuns");
    }
    
    public void display() {
    	System.out.println("Truck color is:"+getColor()+" Truck model is:"+getModel()+" No of Weels are:"+getNoOfWeels());
    }
}
