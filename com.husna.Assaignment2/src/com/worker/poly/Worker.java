package com.worker.poly;

public class Worker {
	String name;
	int empno;
	Worker(int no,String n)
	{ 
		empno=no; name=n;
	}
	void show()
	{
	System.out.println("Employee number : "+empno);
	System.out.println("Employee name : "+name);
	}
}
