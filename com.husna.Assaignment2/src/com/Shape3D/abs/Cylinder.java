package com.Shape3D.abs;

public class Cylinder extends Shape3D {
	private double radius;
	private double height;
	private double surfacearea,volume;

	

	public Cylinder(double radius, double height) {
		super();
		this.radius = radius;
		this.height = height;
	}

	@Override
	public void volume() {
		// TODO Auto-generated method stub
		volume=3.142*(radius*radius)*height;
		System.out.println("Volume of cylinder "+volume);

	}

	@Override
	public void surfacearea() {
		// TODO Auto-generated method stub
		surfacearea = (2 * 22 * (radius + height)) / 7;
		System.out.println("Surface Area of cylinder " + surfacearea);
	}

}
