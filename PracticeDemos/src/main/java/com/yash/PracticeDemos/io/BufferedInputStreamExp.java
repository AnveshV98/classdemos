package com.yash.PracticeDemos.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExp {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream fin = new FileInputStream("D:\\\\STS4\\\\workspace1\\\\PracticeDemos\\\\target\\\\abc.txt");
			BufferedInputStream bin = new BufferedInputStream(fin);
			int i;
			   while((i=bin.read())!=-1){    
				     System.out.print((char)i);    
				    }    
				       
			
			
		}catch(Exception e) {
			
			
			
		}
		

	}

}
