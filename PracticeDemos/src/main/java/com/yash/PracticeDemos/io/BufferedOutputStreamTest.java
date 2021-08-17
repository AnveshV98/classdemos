package com.yash.PracticeDemos.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamTest {

	public static void main(String[] args)throws Exception {
		
		
		FileOutputStream fout = new FileOutputStream("D:\\STS4\\workspace1\\PracticeDemos\\target\\abc.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		String s = "Yash Technologies";
		byte b[] = s.getBytes();
		 bout.write(b);    
	     bout.flush();    
	     bout.close();    
	     fout.close();    
	     System.out.println("success");  
	}

}
