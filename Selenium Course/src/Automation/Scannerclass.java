package Automation;

import java.util.Scanner;

public class Scannerclass 
{
	
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Int");
		int a1=s1.nextInt();
		System.out.println("Enter Byte");
		byte a2=s1.nextByte();
		System.out.println("Enter Short");
		short a3=s1.nextShort();
		System.out.println("Enter Long");
		long a4=s1.nextLong();
		System.out.println("Enter Float");
		float a5=s1.nextFloat();
		System.out.println("Enter Double");
		double a6=s1.nextDouble();
		System.out.println("Enter Boolean");
		boolean a7=s1.nextBoolean();
		s1.close();
		
		
	}
	

}
