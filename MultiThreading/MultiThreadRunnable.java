package com.yash.ClassDemos.MultiThreading;

public class MultiThreadRunnable implements Runnable{

	public void run(){  
		System.out.println("thread is running");  
		}  
	
	public static void main(String[] args) {
		
		MultiThreadRunnable m1=new MultiThreadRunnable();  
		Thread t1 =new Thread(m1);  
		t1.start();  
		 }  

	}


