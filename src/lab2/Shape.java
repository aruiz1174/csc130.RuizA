package lab2;

/**
 * <b>Title:</b> Lab 2:<br>
 * <b>Filename:</b> Shape.java<br>
 * <b>Date Written:</b> 9/20/19<br>
 * <b>Due Date:</b> 9/21/19<br>
 * <p>
 * <b>Description:</b><br>
 * Parent class for all other classes to inherit from.
 * </p>
 * <p>
 * Creates base methods that all other classes that inherit the shape class will have.
 * </p>
 * <p><b>Algorithm:</b></p>
 * <p>
 * Create methods that are mostly abstract or not specific so children classes can fill
 * them in.
 *</p>
 *@author Brandon Gonzalez
 * Lab Members: Anibal Ruiz, Victor Arana
 */

public abstract class Shape 
{
	private String type;
	
	/**
	 * Parameterized constructor Shape(String t)
	 * 
	 * Shape object that will specify its type.
	 * @param t
	 */
	public Shape(String t)
	{
		type = t;
	}
	
	/**
	 * abstract method area()
	 * 
	 * Will calculate area for specific shapes that all children classes must have.
	 * @return
	 */
	public abstract double area();
	
	/**
	 * method getType()
	 * 
	 * Will display a string of the shapes type.
	 * @return shape type
	 */
	public String getType()
	{
		return type;
	}
	
	/**
	 * method toString
	 * 
	 * String to show type of shape
	 */
	public String toString() 
	{
		return "Shape [types: " + type + "]";
		
	}
	

}
