import java.util.Scanner;

public class internet2
{
		public static void main(String[] args) 
		{	
		int internetweekday;
		int phoneweekday;
		int internetweekendday;
		int phoneweekendday;
		System.out.println("Enter your weekday internet usage");

		Scanner internetweekdaysc = new Scanner(System.in);
		internetweekday = internetweekdaysc.nextInt();

		System.out.println("Enter your weekday phone usage");

		Scanner phoneweekdaysc = new Scanner(System.in);
		phoneweekday = phoneweekdaysc.nextInt();

		System.out.println("Enter your weekendday internet usage");

		Scanner internetweekenddaysc = new Scanner(System.in);
		internetweekendday = internetweekenddaysc.nextInt();

		System.out.println("Enter your weekendday phone usage");

		Scanner phoneweekenddaysc = new Scanner(System.in);
		phoneweekendday = phoneweekenddaysc.nextInt();

		int internet = ((20 * internetweekday) + (8 * internetweekendday));
		int phone = ((20 * phoneweekday) + (8 * phoneweekendday));

		System.out.println("The final total is: " + (internet+phone));
		

		}
}