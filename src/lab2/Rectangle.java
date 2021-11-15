package lab2;

/**
 * <b>Title:</b> Lab 2:<br>
 * <b>Filename:</b> Rectangle.java<br>
 * <b>Date Written:</b> 9/20/19<br>
 * <b>Due Date:</b> 9/21/19<br>
 * <p>
 * <b>Description:</b><br>
 * A rectangle object with the help of methods and variables, like length and width, and inheritance of the Shape2D class.
 * </p>
 * <p>
 * Methods allow for creation of rectangle object.
 * </p>
 * <p><b>Algorithm:</b></p>
 * <p>
 * Rectangle extends Shape2D class, abstract methods must be made into methods that are
 * usable. Create other methods to find area such as Length and width. Create method compareTo()
 * from Shape2D class.
 *</p>
 *@author Brandon Gonzalez
 * Lab Members: Anibal Ruiz, Victor Arana
 */


public class Rectangle extends Shape2D 
{
	private double length;
	private double width;

	/**
	 * parameterized Constructor Rectangle()
	 * 
	 * creates rectangle object by inheriting type from Shape class. Creates length and width from user.
	 * @param type
	 * @param length
	 * @param width
	 */
	public Rectangle(String t, double l, double w) {
		super(t);
		length = l;
		width = w;

	}
	
	/**
	 * method area()
	 * 
	 * calculates the area of a rectangle
	 * @return area
	 */
	public double area() {
		double x = this.length * this.width;
		return x;
	}
	
	/**
	 * method perimeter()
	 * 
	 * calculates the perimeter of a rectangle.
	 * @return perimeter
	 */
	public double perimeter() {
		double x = 2 * (this.length + this.width);
		return x;
	}
	
	/**
	 * method getLength()
	 * 
	 * find the length of the current rectangle.
	 * @return length
	 */
	public  double getLength() {
		return this.length;
	}
	
	/**
	 * method getWidth()
	 * 
	 * find the width of a rectangle
	 * @return width
	 */
	public double getWidth() {
		return this.width;
	}
	
	/**
	 * method toString()
	 * 
	 * creates string of a rectangles area, perimeter, length, and width.
	 * @return string
	 */
	public String toString() {
		String str = "Rectangle: Area = " + area() + "  Perimeter = " + perimeter() + "  Length = " + this.length + "  Width = " + this.width ;
		return str;
	}
	
	/**
	 * method compareTo()
	 * 
	 * compares area of rectangle to another shape.
	 * @return 1 if area is greater, 0 if equal, -1 if less.
	 */
	public int compareTo() {
		if ( this.area() > area() ) {
			return 1;
		}
		
		if ( this.area() < area() ) {
			return -1;
		}
		else {
			return 0;
		}
	}
}
