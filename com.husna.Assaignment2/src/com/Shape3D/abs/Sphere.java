package com.Shape3D.abs;

public class Sphere extends Shape3D {
	private double radius;
	private double volume,surfacearea;
	
	

	public Sphere(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void volume() {
		// TODO Auto-generated method stub
		volume=(4.0/3.0)*3.142*(radius*radius*radius);
		System.out.println("Volume of Sphere "+volume);
	}

	@Override
	public void surfacearea() {
		// TODO Auto-generated method stub
		surfacearea=4*3.142*(radius*radius);
		System.out.println("Surface Area of Sphere "+surfacearea);
	}

}
