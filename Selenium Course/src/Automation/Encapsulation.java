package Automation;
class Authentication
{
	private String username="hello@carealities.com";
	public void setusername(String username)//setter method
	{
		this.username=username;
	}
	public String getusername()//getter method
	{
		return username;
	}
}

public class Encapsulation {

	public static void main(String[] args)
	{
		Authentication a1=new Authentication();
		a1.setusername("aravindh@gmail.com");
		System.out.println(a1.getusername());
	}

}
