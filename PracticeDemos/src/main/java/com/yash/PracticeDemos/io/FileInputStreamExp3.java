package com.yash.PracticeDemos.io;

import java.io.FileInputStream;

public class FileInputStreamExp3 {

	public static void main(String[] args) {
		try {
		FileInputStream fin = new FileInputStream("D:\\STS4\\workspace1\\PracticeDemos\\target\\abc.txt");
		int i=0;
		while((i=fin.read())!=-1) {
		System.out.println((char)i);
		}
		fin.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
