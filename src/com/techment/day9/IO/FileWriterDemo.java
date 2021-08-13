package com.techment.day9.IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
			
//		File file = new File("cricket.txt");	
//		System.out.println(file.exists());
//		file.createNewFile(); 		// crate file
		
		
		FileWriter fw =new FileWriter("cricket.txt",true);
		
		fw.write("hello \n");
		
		fw.write("krishna sahu");
		
		char[] ch = {'a','b','c'};
		fw.write(ch);
		fw.write("\n");
		fw.flush();
		fw.close();
		
		System.out.println("written successfully");
		
	}

}
