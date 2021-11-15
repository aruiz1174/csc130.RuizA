package Stacks;

/**
* <b>Title:StackEmptyException Class</b> :<br>
* <b>Date Written:</b> October 3, 2019<br>
* <b>Due Date:</b> October 5, 2019<br>
* <p>
* <b>Description:</b><br>
* In the case that a stack is empty, an exception is thrown 
* that displays information that the stack is empty
*@author Scott Altman and Anibal Ruiz
*/
@SuppressWarnings("serial")
public class StackEmptyException extends RuntimeException {
	/**
	 * Constructs a new StackEmptyException with a default error message string.
	 */
	public StackEmptyException(){
		super("Exception : Stack is empty");
	}
	/**
	 * Constructs a new StackEmptyException with the parameter as the error message string.
	 * @param msg The string passed as the error message string.
	 */
	public StackEmptyException(String msg){
		super(msg);
	}
}