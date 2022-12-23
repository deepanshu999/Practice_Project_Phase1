package com.file_operation;

import java.io.File;
import java.io.FileWriter;

public class AppendToFile {
	
	public static void main(String[] args) {
		
		File file = new File("project_file.txt");
		FileWriter Writer = null;
		
		try {
			
			String text = "I am a Software Engineer.";
			Writer = new FileWriter(file,true);
			Writer.write(text);
			System.out.println("\nAppended Successfully");
			Writer.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
