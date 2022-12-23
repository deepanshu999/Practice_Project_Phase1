package com.file_operation;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileCreation {
	
	public static void main(String[] args) {
		
		try {
			
			File file = new File("project_file.txt");
			
			if(file.createNewFile())
				System.out.println("\nFile " + file.getName() +" created successfully");
			else
				System.out.println("\nFile already exists!!!");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}

