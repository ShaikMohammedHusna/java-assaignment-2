package com.worker.poly;

class DailyWorker extends Worker
{
int rate;
DailyWorker(int no,String n,int r)
{
super(no,n);
rate=r;
}
void compay(int h)
{
show();
System.out.println("Salary : "+rate*h);
}
}