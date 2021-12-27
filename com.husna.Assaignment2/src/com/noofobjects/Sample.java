package com.noofobjects;

public class Sample {
	 static int noOfObjects = 0;
	    {
	        noOfObjects += 1;
	    }
	    public Sample()
	    {
	    }
	    public Sample(int n)
	    {
	    }
	    public Sample(String s)
	    {
	    }
	  
	    public static void main(String args[])
	    {
	        Sample s1 = new Sample();
	        Sample s2 = new Sample(5);
	        Sample s3 = new Sample("GFG");
	        System.out.println(Sample.noOfObjects);
	    }
	
}
