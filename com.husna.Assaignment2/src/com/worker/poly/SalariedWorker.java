package com.worker.poly;

class SalariedWorker extends Worker
{
int rate;
SalariedWorker(int no,String n,int r)
{
super(no,n);
rate=r;
}
int hour=40;
void compay()
{
show();
System.out.println("Salary : "+rate*hour);
}
}
