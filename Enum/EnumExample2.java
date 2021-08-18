package com.yash.PracticeDemos.Enum;

public class EnumExample2 {
	
	enum Day
	{
	    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
	    THURSDAY, FRIDAY, SATURDAY;
	}

	private EnumExample2() {
		
		System.out.println("Constructor called for : " +this.toString());
		        
	}
	
	

}
