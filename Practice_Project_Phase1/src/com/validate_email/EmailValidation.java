package com.validate_email;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	
	public static void main(String[] args) {
		
		int n=5,count=0;
		String st, st1;
		Scanner sc = new Scanner(System.in);
		ArrayList<String> email = new ArrayList<>();
		
		System.out.println("\nEnter 5 email address: ");
		for(int i=0; i<n ;i++)
		{
			st = sc.nextLine();
			
			Pattern pattern = Pattern.compile("^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$");
			Matcher m = pattern.matcher(st);
			boolean b = m.matches();
			
			if(!b)
			{
				System.out.println("\nInvalid email !!! Please enter the correct email address format.");
				n++;
			}
			else
			{
				email.add(st);
			}
			
		}
		
		System.out.println("\nEnter the email address to search : \n");
		st1 = sc.nextLine();
		
		for(int i=0;i<5;i++)
		{	
			if(email.get(i).equals(st1))
			{
				System.out.println("\nEmail found");
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("\nEmail not found!!!");
		}

	}

}
