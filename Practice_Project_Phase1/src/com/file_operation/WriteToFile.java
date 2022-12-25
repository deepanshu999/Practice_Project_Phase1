package com.file_operation;

import java.io.FileWriter;
import java.util.Scanner;

public class WriteToFile {
	
	public static void main(String[] args) {
		
		
		try {
			
		   FileWriter Writer = new FileWriter("project_file2.txt");       //Write to a file.
		   Scanner sc = new Scanner(System.in);
		   
		   System.out.println("\nFile opened for Writing.\nNow you can write\n");
		   Writer.write(sc.nextLine());                                  //write operation
		   Writer.close();
		   System.out.println("\nSuccessfully written in file.");
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
