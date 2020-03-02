public class internet
{
	public static void main(String args[])
	{
		int internetweekday = 500;
		int phoneweekday = 100;
		int internetweekendday = 1000;
		int phoneweekendday = 200;
		int internettotal = (20*(internetweekday)) + (8*(internetweekendday));
		int phonetotal = (20*(phoneweekday)) + (8*(phoneweekendday));
		int monthtotal = internettotal + phonetotal;
		System.out.println("The total cost in the month was: "+ monthtotal +" dollars");

	}

}