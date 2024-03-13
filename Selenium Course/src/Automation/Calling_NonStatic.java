package Automation;

public class Calling_NonStatic 
{
	void add()
	{
		System.out.println("Non Static Method");
	}
	public static void main(String[] args) 
	{
		Calling_NonStatic a1= new Calling_NonStatic();
		a1.add();
	}

}
