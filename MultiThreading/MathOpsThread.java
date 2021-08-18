package com.yash.ClassDemos.MultiThreading;

public class MathOpsThread extends Thread{
	int a = 5;
	int b = 3;
	//int c;
	
	public void run() {
		try {
			System.out.println("addition of two numbers: " +(a+b));
			Thread.sleep(1000);
			System.out.println("multiplication of two no's: " +(a*b));
			Thread.sleep(1000);
			System.out.println("substraction of two no's: " +(a-b));
			Thread.sleep(1000);
			System.out.println("mdivision of two no's: " +(a/b));
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

	
	public static void main(String[] args) {

		MathOpsThread t1 = new MathOpsThread();
		t1.start();
		
		//implemented join method
		 try{  
			  t1.join();
			  
			 }catch(Exception e){
				 
				 System.out.println(e);
				 
			 }  
			  
		
		MathOpsThread t2 = new MathOpsThread();
		t2.start();
		
     	MathOpsThread t3 = new MathOpsThread();
     	t3.start();

		
		

	}

}
