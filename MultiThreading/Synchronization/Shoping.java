package com.yash.ClassDemos.MultiThreading.Synchronization;
import java.lang.Thread;

class GetProducts extends Thread{
	public void run() {
		System.out.println("get products");
	}
	
}
class AddProducts extends Thread{
	
	public void run() {
		System.out.println("add products");
	}
	
}
class VerifyProducts extends Thread{
	
	public void run() {
		System.out.println("verify products");
	}
}

class Payment extends Thread{
	
	public void run() {
		System.out.println("payment process");
	}
}

class Receipt extends Thread{
	public void run() {
		System.out.println("get receipt");
	}
	
}
class Shoping {
	

	public static void main(String[] args) {
		
		GetProducts gp = new GetProducts();
		AddProducts ap = new AddProducts();
		VerifyProducts vp = new VerifyProducts();
		Payment p = new Payment();
		Receipt r = new Receipt();
		
		gp.start();
		ap.start();
		vp.start();
		p.start();
		r.start();
		
		
	}
}