package testngpackage;
import org.testng.annotations.Test;

public class Mathclass
{
	@Test
	public void scenario1()
	{
		double q=Math.PI;
		System.out.println(q);
		System.out.println(Math.addExact(10, 20));
		System.out.println(Math.max(28,48));
		System.out.println(Math.random());
	}
	
}
