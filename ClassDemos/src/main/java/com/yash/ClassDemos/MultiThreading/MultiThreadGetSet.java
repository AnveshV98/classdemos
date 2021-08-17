package com.yash.ClassDemos.MultiThreading;

public class MultiThreadGetSet extends Thread {
	int a = 5;
	int b = 3;

	public void run() {
		try {
			 System.out.println("current thread: " +Thread.currentThread().getName());  
			Thread.sleep(5000);
			System.out.println("Adding the two numbers:" +(a+b)); 
			Thread.sleep(1000);
			System.out.println("thread running");

		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) {

		MultiThreadGetSet t1 = new MultiThreadGetSet();
		MultiThreadGetSet t2 = new MultiThreadGetSet();

		System.out.println("Name of t1:"+t1.getName());  
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		System.out.println("Name of t2:"+t2.getName()); 
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("id of t1:"+t1.getId());

		t1.start();
		t2.start();
		t1.setName("Anvesh");  
		System.out.println("After changing name of t1:"+t1.getName());  

	}

}
