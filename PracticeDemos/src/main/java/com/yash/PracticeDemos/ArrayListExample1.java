package com.yash.PracticeDemos;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample1 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		  list.add("Anvesh");                
		  list.add("Ravi");    
		  list.add("Dharmesh");    
		  list.add("Anuj");    
		  Collections.sort(list);   //sorting the list
		  for(String names:list)    
		    System.out.println(names);    
		  

	}

}
