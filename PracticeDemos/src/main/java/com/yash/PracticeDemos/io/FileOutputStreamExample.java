package com.yash.PracticeDemos.io;
import java.io.*;
public class FileOutputStreamExample {

	public static void main(String[] args) {
		
		 try{    
             FileOutputStream f=new FileOutputStream("D:\\STS4\\workspace1\\PracticeDemos\\target\\abc.txt");    
             f.write(72);    
             f.close();    
             System.out.println("success");    
            }catch(Exception e){System.out.println(e);} 
	}

}
