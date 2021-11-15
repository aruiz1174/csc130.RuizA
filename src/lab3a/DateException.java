package lab3a;
/**
 * Title: DateException
 * @author Anibal Ruiz
 * Description: show a message indicating the user that invalid values have been entered.
 */
@SuppressWarnings("serial")
public class DateException extends Exception 
{
	public DateException() 
	{
		super("Invalid value for Date");
	}
    public DateException(String message) 
    {
    	super(message);
    }
}
