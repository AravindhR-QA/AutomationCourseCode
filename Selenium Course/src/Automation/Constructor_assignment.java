package Automation;

public class Constructor_assignment 
{
	Constructor_assignment(float a)
	{
		System.out.println("Float constructor");
	}
	Constructor_assignment(double b)
	{
		System.out.println("Double constructor");
	}
	Constructor_assignment(char c)
	{
		System.out.println("Char constructor");
	}
	 Constructor_assignment(boolean d)
	 {
		 System.out.println("Boolean constructor");
	 }
	 Constructor_assignment(String e)
	 {
		 System.out.println("String constructor");
	 }
	public static void main(String[] args) 
	{
		new Constructor_assignment(2.13f);
		new Constructor_assignment(7.32);
		new Constructor_assignment('h');
		new Constructor_assignment(true);
		new Constructor_assignment("string_dt");
		
	}

}
