package com.yash.PracticeDemos.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;



public class CustomerApp {

	public static void main(String[] args) {
		
		  CustomerList c1=new CustomerList(1,"Anvesh",5);  
		  CustomerList c2=new CustomerList(2,"Dharmesh",6); 
		  CustomerList c3=new CustomerList(3,"Anuj",8); 
		  CustomerList c4=new CustomerList(4,"ravi",9); 
		  CustomerList c5=new CustomerList(5,"Aishwary",12); 
		  CustomerList c6=new CustomerList(3,"Anuj",8);
		  
		  ArrayList<CustomerList> al=new ArrayList<CustomerList>();  
		  al.add(c1);
		  al.add(c2);  
		  al.add(c3);  
		  al.add(c4);
		  al.add(c5);
		  al.add(c6);
		    
		  Iterator<CustomerList> itr=al.iterator();  
		  
		  while(itr.hasNext()){  
			  CustomerList c=(CustomerList)itr.next();  
		    System.out.println(c.Cust_ID+" "+c.Cust_Name+" "+c.Prod_Quantity);  
		  }  
		  //remove method
		  System.out.println("after remove method");
		  al.remove(c1);
		  Iterator<CustomerList> itr1=al.iterator(); 
		  while(itr1.hasNext()){  
			  CustomerList c=(CustomerList)itr1.next();  
		    System.out.println(c.Cust_ID+" "+c.Cust_Name+" "+c.Prod_Quantity);  
		  }  
		  // set
		  
		  System.out.println("after using set method");
		  al.set(0, new CustomerList(12, "Riya", 15));
		  Iterator<CustomerList> itr2=al.iterator(); 
		  while(itr2.hasNext()){  
			  CustomerList c=(CustomerList)itr2.next();  
		    System.out.println(c.Cust_ID+" "+c.Cust_Name+" "+c.Prod_Quantity);  
		  }  
		  
		  //remove duplicate names
		//sort names
		  
	}

}
