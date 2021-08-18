package com.yash.ClassDemos.MultiThreading;

public class ThreadSleepExp extends Thread{  
	 public void run(){  
	  for(int i=1;i<5;i++){  
	    try{
	    	Thread.sleep(500);
	    	
	    }catch(InterruptedException e){
	    	
	    	System.out.println(e);
	    	
	    }  
	    System.out.println(i);  
	  }  
	 }  
	 public static void main(String args[]){  
	  ThreadSleepExp t1=new ThreadSleepExp();  
	  ThreadSleepExp t2=new ThreadSleepExp();  
	   
	  t1.start();  
	  t2.start();  
	 }  
	}  
