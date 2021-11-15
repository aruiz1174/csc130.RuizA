package lab3a;

/**
 * <p>
 * Title: Date Class
 * </p>
 *
 * <p>
 * Description: The goal is to learn how to handle exceptions creating methods that set day, month and year. In order 
 * to have a correct class, the code must works completely and it must take care any exception.
 * </p>
 *
 * <p>
 * Copyright: Copyright (c) 2016
 * </p>
 *
 * <p>
 * Company:
 * </p>
 *
 * @author not attributable
 * @version 1.0
 */
public class Date {
	
	private int dMonth; // variable to store the month
	private int dDay; // variable to store the day
	private int dYear; // variable to store the year

	/**
	 * default constructor - sets dMonth=1, dDay=1, and dYear=1900
	 */
	public Date() {
		dMonth = 1;
		dDay = 1;
		dYear = 1900;
	}

	/**
	 * parameterized constructor - sets dMonth, dDay, and dYear to user
	 * specified values
	 * 
	 * @param month
	 *            value to be stored in dMonth
	 * @param day
	 *            value to be stored in dDay
	 * @param year
	 *            value to be stored in dYear
	 */
	public Date(int month, int day, int year) throws DateException {
		setMonth(month);
		setDay(day);
		setYear(year);
	}

	/**
	 * setDate - stores month, day, and year in dMonth, dDay, and dYear
	 * respectively be calling each of the setMethods defined
	 * 
	 * @param month
	 *            value to be stored in dMonth
	 * @param day
	 *            value to be stored in dDay
	 * @param year
	 *            value to be stored in dYear
	 */
	public void setDate(int month, int day, int year) throws DateException {
		setMonth(month);
		setDay(day);
		setYear(year);
	}

	/**
	 * setMonth - stores month in dMonth
	 * 
	 * @param month
	 *            the value to be stored in dMonth
	 */
	public void setMonth(int month) throws DateException {
		if(month >= 1 && month <= 12)
		{
			dMonth = month;
		}
		else
			throw new DateException("Invalid Month: month out of range");
	}

	/**
	 * setDay - stores day in dDay
	 * 
	 * @param day
	 *            the value to be stored in dDay
	 */
	public void setDay(int day) throws DateException
	{
		if(dMonth == 1 || dMonth == 3 || dMonth == 5 || dMonth == 7 || dMonth == 8 || dMonth == 10 || dMonth == 12)
		{
			if(day >= 1 && day <= 31)
			{
				dDay = day;
			}
			else 
			{
				throw new DateException("Invalid Day: Day out of range");
			}
		}
		else if(dMonth == 4 || dMonth == 6 || dMonth == 9 || dMonth == 11)
		{
			if(day >= 1 && day <= 30)
			{
				dDay = day;
			}
			else 
			{
				throw new DateException("Invalid Day: Day out of range");
			}
		}
		else if(dMonth == 2)
		{
			if(day >= 1 && day <= 29)
			{
				dDay = day;
			}
			else 
			{
				throw new DateException("Invalid Day: Day out of range");
			}
		}
		
	}
	
	private boolean isLeapYear(int year) throws DateException
	{
		if((dDay >= 1 && dDay <= 29) && (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
			return false;
		else
			throw new DateException("Not a Leap year");
	}

	/**
	 * setYear - stores year in dYear
	 * 
	 * @param year the value to be stored in dYear
	 * @throws DateException 
	 */
	public void setYear(int year) throws DateException 
	{
		if(year >= 1752 && year <= 2019)
		{
			if(isLeapYear(year))
				dYear = year;
			dYear = year;
		}
		else
			throw new DateException("Invalid Year: Year out of range");
	}

	/**
	 * getMonth - accessor for dMonth
	 * 
	 * @return returns the value stored in dMonth
	 */
	public int getMonth() {
		return dMonth;
	}

	/**
	 * getDay - accessor for dDay
	 * 
	 * @return returns the value stored in dDay
	 */
	public int getDay() {
		return dDay;
	}

	/**
	 * getYear - accessor for dYear
	 * 
	 * @return returns the value stored in dYear
	 */
	public int getYear() {
		return dYear;
	}

	/**
	 * toString - returns the month, day, and year in the format: mm-dd-yyyy;
	 * leading zeros are NOT contained within the string
	 * 
	 * @return a String containing the date in month-day-year format
	 */
	public String toString() {
		return (dMonth + "-" + dDay + "-" + dYear);
	}
}

