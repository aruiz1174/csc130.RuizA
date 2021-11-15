package Stacks;

/**
* <b>Title:StackFullException class</b> :<br>
* <b>Date Written:</b> October 3, 2019<br>
* <b>Due Date:</b> October 5, 2019<br>
* <p>
* <b>Description:</b><br>
* * In the case that a stack is full, an exception is thrown 
* that displays information that the stack is full
*@author Scott Altman and Anibal Ruiz
*/
@SuppressWarnings("serial")
public class StackFullException extends RuntimeException {
	/**
	 * Constructs a new StackFullException with a default error message string.
	 */
	public StackFullException(){
		super("Exception : Stack is full");
	}
	/**
	 * Constructs a new StackFullException with the parameter as the error message string.
	 * @param msg The string passed as the error message string.
	 */
	public StackFullException(String msg){
		super(msg);
	}
}