package com.techment.day9.IO;

import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter fr = new FileWriter("cricket.txt");
		PrintWriter out = new PrintWriter(fr);
		
		out.write(100);
		out.println(true);
		out.println("krishna");
		out.flush();
		out.close();
	}

}
