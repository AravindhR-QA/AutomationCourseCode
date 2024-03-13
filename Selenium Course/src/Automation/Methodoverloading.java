package Automation;

public class Methodoverloading {
	void add() //Nonstatic method
	{
		int a=100;
		int b=200;
		int c=a+b;
		System.out.println(c);
	}
	void add(int a) //Nonstatic parameterized method
	{
		int c=a+100;
		System.out.println(c);
	}
	
	public static void main(String[] args)
	{
	Methodoverloading m1=new Methodoverloading();
	m1.add();
	m1.add(100);
	}

}
