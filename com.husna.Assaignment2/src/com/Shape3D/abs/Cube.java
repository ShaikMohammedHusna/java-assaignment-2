package com.Shape3D.abs;

public class Cube extends Shape3D {
	private double a;
	private double volume,surfacearea;

	public Cube(double a) {
		super();
		this.a = a;
	}

	@Override
	public void volume() {
		// TODO Auto-generated method stub
		volume=a*a*a;
		System.out.println("Volume of Cude "+volume);

	}

	@Override
	public void surfacearea() {
		// TODO Auto-generated method stub
		surfacearea=6*(a*a);
		System.out.println("Surface of cube "+surfacearea);

	}

}
