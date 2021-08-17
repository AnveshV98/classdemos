package com.yash.PracticeDemos;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAdd {
	
	public static void main(String args[]) {
		
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("list of elements before adding" +al);
		
		al.add("Ravi");
		al.add("Anvesh");
		al.add("Anuj");
		
		System.out.println("list after adding elements" +al);
		al.add(1, "Dharmesh");
		System.out.println("after adding an element at specific index" +al);
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("aishwary");
		al1.add("harshada");
		System.out.println("second array list elements" +al1);
		al.addAll(al1);
		System.out.println("after adding second list elements to first list " +al);
		
		Collections.sort(al);
		System.out.println("names after sorting");
		for(String names:al)    
		    System.out.println(names);  
		
		
		// remove elements
		
		System.out.println("elements before removing" +al);
		al.remove(1);
		System.out.println("elements after removeing" +al);
		al.remove("Ravi");
		System.out.println(al);
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("anvesh");
		al2.add("ravi");
		al.addAll(al2);
		System.out.println("elements after updating" +al);
		al.clear();
		System.out.println("elements after clearing" +al);
		 System.out.println("Is ArrayList Empty: "+al.isEmpty());  
		 al.add("Ravi");
		 al.add("Anvesh");
		 al.add("Anuj");
		 System.out.println(al);
		 System.out.println();
		
		
	}

}
