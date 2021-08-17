package com.yash.PracticeDemos;

import java.io.Console;

public class ConsoleRead {
	
	public static void main(String args[]) {
		
		Console con = System.console();    
		System.out.println("Enter password: ");    
		char[] ch = con.readPassword();    
		String pass=String.valueOf(ch);//converting char array into string    
		System.out.println("Password is: "+pass);    
		}   

}
