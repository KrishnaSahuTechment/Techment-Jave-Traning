package com.techment.day9.IO;

import java.io.File;
import java.io.IOException;

public class FileCreateDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("E:\\bhasker");

		file.mkdir(); 			 // create folder
		File file1 = new File("E:\\bhasker","demo.txt");
		System.out.println(file1.exists());


		file1.createNewFile(); 		// crate file
		System.out.println(file1.exists());
	}

}
