package com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileOperation {

	public static void main(String[] args) throws IOException {
		
		//copying two file content and pasting it into third file
		
		PrintWriter pw = new PrintWriter("F://pqr.txt");
		
		BufferedReader br = new BufferedReader(new FileReader("F://abc/abc.txt"));
		
		String readLine = br.readLine();
		
		while(readLine!=null) {
			
			pw.println(readLine);
			
			readLine = br.readLine();
	
		}
		br = new BufferedReader(new FileReader("F://xyz/xyz.txt"));
		
		readLine = br.readLine();
		
		while(readLine!=null) {
			
			pw.println(readLine);
			
			readLine =  br.readLine();
		}
		
		pw.flush();
		pw.close();
		System.out.println("file is printed");
		
		

	}

}
