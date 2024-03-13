package Automation;

import java.util.Scanner;

public class ScannerClass_Addition 
{
	
	public static void main(String[] args) 
	{	
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter 'A' value");
		int a=s1.nextInt();
		System.out.println("Enter 'B' value");
		int b=s1.nextInt();
		int c=a+b;
		s1.close();
		System.out.println("The addition of two numbers is: " +c);
		
	}

}
