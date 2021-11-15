package lab3a;
import java.util.Scanner;
/**
 * Title: Application class
 * 
 * @author Anibal Ruiz
 * 
 * Description: create a Date object to test every single method, ask the user to enter correct input.
 * A valid day, month and year must be checked.
 *
 */
public class Lab3App 
{
	public static void main(String[] args) 
	{
		
		// Create a Scanner object and connect it to System.in
		Scanner scan = new Scanner(System.in);
		Date aDate = new Date();
		int month = 0;
		int day = 0;
		int year = 0;
		boolean done = false;
		boolean validMonth = false;
		boolean validDay = false;
		boolean validYear = false;
		
		while(!done) 
		{
			try 
			{
				if(!validMonth)
				{
					System.out.print("Enter the month as an integer: ");
				    month = scan.nextInt();
				    aDate.setMonth(month);
				    validMonth = true;
				}
				if(!validDay)
				{
					 System.out.print("Enter the day as an integer: ");
					 day = scan.nextInt();
					 aDate.setDay(day);
					 validDay = true;
				}
				if(!validYear)
				{
					 System.out.print("Enter the year as an integer: ");
					 year = scan.nextInt();
					 aDate.setYear(year);
					 validYear = true;
					    
				}
			    aDate = new Date(month, day, year);
			    done = true;
			    System.out.println("The date is " + aDate);

			} 
			catch (DateException ex)
			{
				System.out.println("DateException: " + ex.getMessage());
				scan.nextLine();
			}
		}
		scan.close();
	}
}




