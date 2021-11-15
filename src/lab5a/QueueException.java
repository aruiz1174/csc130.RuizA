package lab5a;
/**
 * Title: QueueException class
 * @author Anibal Ruiz
 * Description: send a message telling that a exception has been thrown
 */
@SuppressWarnings("serial")
public class QueueException extends Exception
{
	public QueueException()
	{
		super("Queue Exception...");
	}
	
	public QueueException(String message)
	{
		super(message);
	}

}
