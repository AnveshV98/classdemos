package com.yash.ClassDemos.MultiThreading;

public class DaemonThread extends Thread{
	
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("daemon thread ");
		}else {
			
			System.out.println("user thread");
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		DaemonThread t1 =  new DaemonThread();
		DaemonThread t2 = new DaemonThread();
		
		//t1.setDaemon(true);
		t1.start();
		
		t1.setDaemon(true);
		t2.start();
		
		
	}

}
