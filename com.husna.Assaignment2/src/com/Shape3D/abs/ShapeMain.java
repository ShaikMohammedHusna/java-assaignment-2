package com.Shape3D.abs;

public class ShapeMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape3D s3;
		s3=new Cylinder(10.0,10.0);
		s3.surfacearea();
		s3.volume();
		
		System.out.println("-----------------");
		
		s3=new Sphere(10.0);
		s3.surfacearea();
		s3.volume();
		
		System.out.println("-----------------");
		
		s3=new Cube(11.0);
		s3.surfacearea();
		s3.volume();
		
	}

}

