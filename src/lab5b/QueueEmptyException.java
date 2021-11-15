package lab5b;
/**
* <b>Title:QueueEmptyException Class</b> :<br>
* <b>Date Written:</b> OCotber 24, 2019<br>
* <b>Due Date:</b> November 2, 2019<br>
* <p>
* <b>Description:</b><br>
* In the case that a queue is empty, an exception is thrown 
* that displays information that the queue is empty
*@author Anibal Ruiz
*/
@SuppressWarnings("serial")
public class QueueEmptyException extends RuntimeException
{
	/**
	 * Constructs a new QueueEmptyException with a default error message string.
	 */
	public QueueEmptyException(){
		super("Exception : Queue is empty");
	}
	/**
	 * Constructs a new QueueEmptyException with the parameter as the error message string.
	 * @param msg The string passed as the error message string.
	 */
	public QueueEmptyException(String msg){
		super(msg);
	}

}
