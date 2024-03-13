import org.testng.annotations.Test;

public class Grouping 
{
	@Test(groups= {"smoke"})
	public void scenario1()
	{
		System.out.println("1");
	}

	@Test(groups= {"smoke"})
	public void scenario2()
	{
		System.out.println("2");
	}

	@Test(groups= {"smoke","system"})
	public void scenario3()
	{
		System.out.println("3");
	}
	@Test(groups= {"system","regression"})
	public void scenario4()
	{
		System.out.println("4");
	}
	@Test(groups= {"regression"})
	public void scenario5()
	{
		System.out.println("5");
	}
	@Test(groups= {"regression"})
	public void scenario6()
	{
		System.out.println("6");
	}
	@Test(groups= {"regression"})
	public void scenario7()
	{
		System.out.println("7");
	}
	@Test(groups= {"regression"})
	public void scenario8()
	{
		System.out.println("8");
	}
	@Test(groups= {"regression"})
	public void scenario9()
	{
		System.out.println("9");
	}
	@Test(groups= {"regression"})
	public void scenario10()
	{
		System.out.println("10");
	}
	
}

