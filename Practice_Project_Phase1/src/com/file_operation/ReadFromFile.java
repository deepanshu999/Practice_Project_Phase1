package com.file_operation;

import java.util.Scanner;
import java.io.File;

public class ReadFromFile {
	
	public static void main(String[] args) {
		
		try {
			
			File obj = new File("project_file.txt");
			Scanner sc = new Scanner(obj);
					
			System.out.println("\nReading from the file.");
			
			while(sc.hasNextLine())
			{
				String data = sc.nextLine();
				System.out.println(data);
			}
			sc.close();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
