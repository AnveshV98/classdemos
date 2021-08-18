package com.yash.ClassDemos.MultiThreading;  

public class WorkerThread implements Runnable {
	
	private String name;  
    public WorkerThread(String name){  
        this.name=name;  
    }  
     public void run() {  
       System.out.println("start thread:" +name); 
       		try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
   
       		System.out.println("ended thread:" +name);
     }  

}
