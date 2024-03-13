package Automation;

public class Arithmetic 
{
	static void add()
	{
		int a=5;
		int b=5;
		int c=a+b;
		System.out.println("Addition of 2 numbers is");
		System.out.println(c);
	}
	static void subtraction()
	{
		int d=6;
		int e=5;
		int f=d-e;
		System.out.println("Subtraction of 2 numbers is");
		System.out.println(f);
	}
	static void multiplication()
	{
		int g=9;
		int h=10;
		int i=g*h;
		System.out.println("Multiplication of 2 numbers is");
		System.out.println(i);
	}
	static void division()
	{
		int j=8;
		int k=2;
		int l=j/k;
		System.out.println("Division of 2 numbers is");
		System.out.println(l);
	}
	public static void main(String[] args) 
	{
		add();
		subtraction();
		multiplication();
		division();
	}

}
