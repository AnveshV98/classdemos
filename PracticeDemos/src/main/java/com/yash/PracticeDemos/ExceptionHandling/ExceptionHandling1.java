package com.yash.PracticeDemos.ExceptionHandling;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		try {
			
		int data = 10/0;
		System.out.println(data);       //arithmetic exception
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		try {
			
			String s =null;
			System.out.println(s.length());  //null pointer exception
		}catch(NullPointerException e) {
			System.out.println(e);
		}
		
		try {
			
			String s1 = "abc";
			int i = Integer.parseInt(s1);
			System.out.println(s1);         //numberfarmat exception
		}catch(NumberFormatException e) {
			System.out.println(e);
		}
		
		try {
			
			int a[] = new int[5];
			System.out.println(a[10]);
		}catch(ArrayIndexOutOfBoundsException e) {   //arrayindexoutofboundsexceptions
			System.out.println(e);
		}
		
		try {
			
			int b = 100/0;
			System.out.println(b);
		}catch(Exception e) {
			System.out.println("Can't be devided by zero");
		}
		
		System.out.println("Anvesh");
		
	}

}
