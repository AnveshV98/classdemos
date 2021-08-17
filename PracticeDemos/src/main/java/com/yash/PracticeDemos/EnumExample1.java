package com.yash.PracticeDemos;

public class EnumExample1 {
	
	public enum Season { WINTER, RAINY, SUMMER }

	public static void main(String[] args) {
		 
		 
		for (Season s : Season.values())  
		
			System.out.println(s);  
		

	}

}
