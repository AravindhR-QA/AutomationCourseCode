package Automation;

public class LogicalOperators2 {

	public static void main(String[] args) 
	{
		int a=20;
		int b=30;
		if((a>b)&&(a!=b))
		{
			System.out.println("Logical AND Operator");
		}
		if((a>b)||(a==b))
		{
			System.out.println("Logical OR Operator");
		}
		if(!(a<b)&&(a!=b))
		{
			System.out.println("Logical ANDNOT Operator");
		}
		if(!(a<b)||(a==b))
		{
			System.out.println("Logical ORNOT Operator");
		}
	}

}
