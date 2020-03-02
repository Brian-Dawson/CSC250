public class internet3
{
	public static void main(String args[])
	{
		int internetweekday = 500;
		int phoneweekday = 100;
		int internetweekendday = 1000;
		int phoneweekendday = 200;
		int totalcost = 0;
		for(int j = 0; j < 28; j++)
		{
			if(j < 20)
			{
				totalcost = totalcost + internetweekday + phoneweekday;
			}
			else
			{
				totalcost = totalcost + internetweekendday + phoneweekendday;
			}
		}
		System.out.println("The total cost for the month is: " + totalcost + " dollars");
		
	}
}