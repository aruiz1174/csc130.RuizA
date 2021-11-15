package lab2;

/**
 * <b>Title:</b> Lab 2:<br>
 * <b>Filename:</b> Square.java<br>
 * <b>Date Written:</b> 9/20/19<br>
 * <b>Due Date:</b> 9/21/19<br>
 * <p>
 * <b>Description:</b><br>
 * Creates a Square object by methods and inheritance of the Rectangle class.
 * </p>
 * <p>
 * Methods allow for creation of circle object.
 * </p>
 * <p><b>Algorithm:</b></p>
 * <p>
 * Circle extends Rectangle class, all methods in the rectangle class can be used by the
 * square class. Square only does not have both a length and width, only one. 
 *</p>
 *@author Brandon Gonzalez
 * Lab Members: Anibal Ruiz, Victor Arana
 */


public class Square extends Rectangle{
	
	/**
	 * Parameterized Constructor Square()
	 * 
	 * creates a square object. Inherits the rectangle class and the parent class shape.
	 * @param type -from shape class-
	 * @param side -from rectangle class-
	 */
	public Square(String t,double s) {
		super(t,s,s);
	}
}
