package com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class DuplicateRemove {

	public static void main(String[] args) throws IOException {
		
		PrintWriter pw = new PrintWriter("F://pqr.txt");
		
		BufferedReader br1 = new BufferedReader(new FileReader("F://abc/abc.txt"));
		
		String readLine1 = br1.readLine();
		
		while(readLine1!=null)
		{
			boolean flag = false;
			
			BufferedReader br2 = new BufferedReader(new FileReader("F://xyz/xyz.txt"));
			
			String readLine2 = br2.readLine();
			
			while(readLine2!=null)
			{
				if(readLine1.equals(readLine2))
				{
					flag = true;
					break;
					
				}
				readLine2 = br2.readLine();
			}
			if(flag==false) {
				
				pw.println(readLine1);
			}
			
			readLine1 = br1.readLine();
		}
		pw.flush();
		pw.close();
		System.out.println("file is done");

	}

}
