package com.worker.poly;

public class WorkerMain {
	public static void main(String args[])
	{
	DailyWorker d=new DailyWorker(254,"Arjun",75);
	SalariedWorker s=new SalariedWorker(666,"Unni",100);
	d.compay(45);
	s.compay();
	}
}
