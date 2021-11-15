package lab5b;
/**
* <b>Title:QueueFullException class</b> :<br>
* <b>Date Written:</b> October 24, 2019<br>
* <b>Due Date:</b> November 2, 2019<br>
* <p>
* <b>Description:</b><br>
* * In the case that a stack is full, an exception is thrown 
* that displays information that the stack is full
*@author Anibal Ruiz
*/
@SuppressWarnings("serial")
public class QueueFullException extends RuntimeException {
	/**
	 * Constructs a new StackFullException with a default error message string.
	 */
	public QueueFullException(){
		super("Exception : Queue is full");
	}
	/**
	 * Constructs a new StackFullException with the parameter as the error message string.
	 * @param msg The string passed as the error message string.
	 */
	public QueueFullException(String msg){
		super(msg);
	}
}