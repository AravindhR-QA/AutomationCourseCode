package Automation;

public class Nestedif
{

	public static void main(String[] args) 
	{
	 int age=52;
	 if(age>18)
	 	{
		 	if(age>60)
		 	{
			 System.out.println("Senior citizen");
		 	}
		 	if (age<60)
		 	{
			 System.out.println("You are still young");
		 	} 
	 else
	 	{
		 System.out.println("Logout");
	 	}
	 	}
	}
}
