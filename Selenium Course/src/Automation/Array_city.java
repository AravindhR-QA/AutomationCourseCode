package Automation;

public class Array_city {

	public static void main(String[] args) 
	{
		String city[] = new String[5];
		city[0]="Chennai";
		city[1]="Bangalore";
		city[2]="Hyderabad";
		city[3]="Mumbai";
		
		Boolean Visit[]= new Boolean[2];
		Visit[0]=true;
		Visit[1]=false;
		
		String beenthere[] = new String[2];
		beenthere[0]="You have been there";
		beenthere[1]="You will visit soon";
		
		System.out.println(city[0] + " " + Visit[0]+ " "  + beenthere[0]);
		System.out.println(city[1] + " " + Visit[1]+ " "  + beenthere[1]);
		System.out.println(city[2] + " " + Visit[1]+ " "  + beenthere[1]);
		System.out.println(city[3] + " " + Visit[0]+ " "  + beenthere[0]);
		
	}

}
