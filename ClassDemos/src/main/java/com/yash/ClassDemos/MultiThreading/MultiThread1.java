package com.yash.ClassDemos.MultiThreading;

public class MultiThread1 extends Thread {
	
	
	public void run() {
		System.out.println("thread is running");
	}

	public static void main(String[] args) {
		
		
		MultiThread1 m1 = new MultiThread1();
		m1.start();

	}

}
