package com.calculator;

import java.util.Scanner;

interface cal{                  //Interface
	
	public void calculate(int a, int b);
}

class Operation implements cal{
	
	Scanner sc = new Scanner(System.in);
	int a,b;
	
	Operation(int a, int b)     //Constructor
	{
		a = this.a;
		b = this.b;
	}
	
	public void calculate(int a, int b)
	{
		String ch;
		int n;
		System.out.println("\nMain Menu:");
		
		do {
			System.out.println("\n1.Addition \n2.Substraction \n3.Multiplication \n4.Division\n");
			System.out.println("Choose any option from above : ");
			n = sc.nextInt();
			switch(n)
			{
			
			case 1: System.out.println("\nResult is "+ (a+b));
			        break;
			        
			case 2: System.out.println("\nResult is "+ (a-b));
			        break;
			        
			case 3: System.out.println("\nResult is "+ (a*b));
	                break;    
	                
			case 4: System.out.println("\nResult is "+ (a/b));
			        break;
			        
			default: System.out.println("\nInvalid choice !!!");
			
			}
			System.out.println("\nDo you want to calculate other operations? (Yes/No)\n");
			ch = sc.next();
		}while(ch.charAt(0)=='y' || ch.charAt(0)=='Y');
		
	}
}
public class ArithmeticCalculator {
	
	public static void main(String[] args) {
		
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers a and b:");
		a = sc.nextInt();
		b = sc.nextInt();
		Operation op = new Operation(a,b);
		op.calculate(a,b);
		
	}

}
