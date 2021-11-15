package lab2;

/**
 * <b>Title:</b> Lab 2:<br>
 * <b>Filename:</b> Shape2D.java<br>
 * <b>Date Written:</b> 9/20/19<br>
 * <b>Due Date:</b> 9/21/19<br>
 * <p>
 * <b>Description:</b><br>
 * Inherits the shape class and gets inherited by 2D shapes only.
 * Works as a parent for specific 2D shapes and makes them methods they must use.
 * </p>
 * <p>
 * Implements Comparable method to have other 2D shapes use the method.
 * </p>
 * <p><b>Algorithm:</b></p>
 * <p>
 * Inherits Shape class and its methods. Implements comparable interface. Creates
 * perimeter for all 2D children classes to use.
 *</p>
 *@author Brandon Gonzalez
 * Lab Members: Anibal Ruiz, Victor Arana
 */

public abstract class Shape2D extends Shape implements Comparable<Shape2D>{
	/**
	 * Parameterized constructor Shape2D()
	 * 
	 * Inherits shape class constructor
	 * @param shape type
	 */
	public Shape2D(String t)
	{
		super(t);
	}
	
	/**
	 * abstract method perimeter()
	 * 
	 * forces 2D children classes to use this
	 * @return
	 */
	public abstract double perimeter();
	
	/**
	 * method toString()
	 * 
	 * creates string for other classes to inherit from and to print type.
	 */
	public String toString()
	{
		String str = "";
		return str;
	}
	
	/**
	 * method compareTo()
	 * 
	 * compares to 2D shape area.
	 * @param o, another 2D shape.
	 * @return 1 if area is greater, 0 if equal, -1 if less.
	 */
	public int compareTo(Shape2D o) {
		if ( area() > o.area() ) {
			return 1;
		}
		
		if ( area() < o.area() ) {
			return -1;
		}
		else {
			return 0;
		}
	}
}
