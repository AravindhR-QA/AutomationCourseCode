package Automation;

public class LogicalOperators 
{
	
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		if((a<b)&&(a!=b))
		{
			System.out.println("Logical AND Operator");
		}
		if((a<b)||(a>b))
		{
			System.out.println("Logical OR Operator");
		}
		if(!(a>b)&&(a!=b))
		{
			System.out.println("Logical ANDNOT Operator");
		}
		if(!(a==b)||(a>=b))
		{
			System.out.println("Logical ORNOT Operator");
		}
	}

}
