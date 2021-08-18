	package com.techment.day9.IO;

import java.io.*;	
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String PNR="BH_11112021_100";
		
		
		FileWriter fw = new FileWriter(PNR+".txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		bw.write("krishna sahu");
		bw.newLine();
		char[] ch = {'a','b','c','d','e'};		
		bw.write(ch);
		bw.flush();
		bw.close();
		System.out.println("writtern succefully");
	}

}
