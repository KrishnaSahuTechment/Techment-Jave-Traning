package com.techment.day9.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fr = new FileReader("cricket.txt");
	
		int ch = fr.read();
		
//		System.out.println(ch);
		while(ch!=-1)
		{
		System.out.print((char)ch);
		ch=fr.read();
		}
	}

}
