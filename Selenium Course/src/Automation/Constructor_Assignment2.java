package Automation;

public class Constructor_Assignment2 
{
	Constructor_Assignment2()
	{
		System.out.println("Constructor method");
	}
	void add()
	{
		System.out.println("Non static Method");
	}
	static void subtract()
	{
		System.out.println("Static Method");
	}
	public static void main(String[] args) 
	{
		Constructor_Assignment2 a1=new Constructor_Assignment2();
		a1.add();
		subtract();
		
		
	}

}
