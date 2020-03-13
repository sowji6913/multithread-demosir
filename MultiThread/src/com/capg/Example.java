package com.capg;
class NamePrinter{
	static  void multiplicationTable(int i) {
		for(int i=1;i<=10;i++) {
		System.out.println(n+" X "+i+" =  "+n*i);
		//System.out.println(name);
	}
class A implements Runnable
{
	public void run() {
		for(int i=1;i<=10;i++) {
			Multiplication.multiplicationTable(5);
		}
			//NamePrinter.printName("sowji");
		}
			//System.out.println("from"+ Thread.currentThread().getName()+":i="+i);
			//if(i==4) {
			//	yield();
			}
			
				//try {
				//	Thread.sleep(500);
				//} catch (InterruptedException e) {
					
				//}
			
		}

	public static void printName(String string) {
		// TODO Auto-generated method stub
		
	}
	}

class B extends Thread
{
	public void run() {
		for(int i=1;i<=10;i++) {
			NamePrinter.printName("lavanya");
			//System.out.println();
			//System.out.println("from"+ getName()+":i="+i);
		}
		//try {
		//	Thread.sleep(500);
		//} catch (InterruptedException e) {
			
		//}
	}
}
public class Example {

	public static void main(String[] args) {
		A a1 =new A();
		A a2 =new A();
	Thread t1=new Thread(a1);
	Thread t2=new Thread(a2);
	//t1.setPriority(Thread.MAX_PRIORITY);
	t1.setName("T1");
	t2.setName("T2");
	t1.start();
	t2.start();

	}

}

