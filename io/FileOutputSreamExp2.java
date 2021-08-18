package com.yash.PracticeDemos.io;

import java.io.FileOutputStream;

public class FileOutputSreamExp2 {

	public static void main(String args[]) {
		
		try{    
            FileOutputStream f1=new FileOutputStream("D:\\\\STS4\\\\workspace1\\\\PracticeDemos\\\\target\\\\abc.txt");    
            String s="Welcome to Yash Technologies";    
            byte b[]=s.getBytes();  
            f1.write(b);    
            f1.close();    
            System.out.println("success");    
           }catch(Exception e){
        	   
        	   System.out.println(e);
        	   
           }  

	}

}
