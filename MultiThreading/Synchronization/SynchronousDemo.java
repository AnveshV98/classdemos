package com.yash.ClassDemos.MultiThreading.Synchronization;
import java.lang.Thread;

class Display{
	
	synchronized public void display(){
		try {
			Thread.sleep(400);
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	
}

class GetProducts2 extends Thread{
 Display d;
 GetProducts2(Display d){
	 this.d=d;
 }
 @Override
 public void run() {
	 
	 System.out.println("1 get products");
	 d.display();
 }
 
}
class AddProducts2 extends Thread{
	 Display d;
	 AddProducts2(Display d){
		 this.d=d;
	 }
	 @Override
	 public void run() {
		 d.display();
		 System.out.println("2 add products");
		 
	 }
	 
	}
class Verify extends Thread{
	 Display d;
	 Verify(Display d){
		 this.d=d;
	 }
	 @Override
	 public void run() {
		 d.display();
		 System.out.println("3 verify");
		
	 }
	 
	}
//class Pay extends Thread{
//	 Display d;
//	 Pay(Display d){
//		 this.d=d;
//	 }
//	 @Override
//	 public void run() {
//		 
//		 d.display();
//		 System.out.println("4 Payment done");
//		 
//	 }
//	 
//	}
public class SynchronousDemo {

	public static void main(String[] args) {
		
		
		Display d1 = new Display();
		GetProducts2 gp = new GetProducts2(d1);
		AddProducts2 ap = new AddProducts2(d1);
		Verify v = new Verify(d1);
		//Pay p =new Pay(d1);
		
		gp.start();
		ap.start();
		v.start();
		//p.start();
	}

}
