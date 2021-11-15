package lab2;

/**
 * <b>Title:</b> Lab 2:<br>
 * <b>Filename:</b> Triangle.java<br>
 * <b>Date Written:</b> 9/20/19<br>
 * <b>Due Date:</b> 9/21/19<br>
 * <p>
 * <b>Description:</b><br>
 * A Triangle object and methods to find specifics of a triangle such as area, isValid, and
 * get side. and inheritance of the Shape2D class.
 * </p>
 * <p>
 * Methods allow for creation of Triangle object.
 * </p>
 * <p><b>Algorithm:</b></p>
 * <p>
 * Circle extends Shape2D class, abstract methods must be made into methods that are
 * usable. Create other methods to find area such as three sides and isValid
 * to check if the triangle is a valid triangle. Create method compareTo()
 * from Shape2D class.
 *</p>
 *@author Brandon Gonzalez
 * Lab Members: Anibal Ruiz, Victor Arana
 */


public class Triangle extends Shape2D 
{
	private double a, b, c;
	
	/**
	 * parameterized constructor Triangle()
	 * 
	 * creates triangle object with 3 sides inputed. Inherits type.
	 * @param type
	 * @param side a
	 * @param side b
	 * @param side c
	 */
	public Triangle(String t, double a, double b, double c)
	{
		super(t);
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	/**
	 * method isValid
	 * 
	 * Checks to see if the third side is less than the sum of the two other sides.
	 * @param side a
	 * @param side b
	 * @param side c
	 * @return true or false
	 */
	public boolean isValid(double a, double b, double c)
	{
		if( a + b > c && b + c > a && c + a > b) {
			return true;
		}
		return false;
	}
	
	/**
	 * method area()
	 * 
	 * finds area of a triangle.
	 * @return area
	 */
	public double area() {
		double s = (this.a + this.b + this.c) / 2;
		double x = Math.sqrt(s * (s - this.a) * (s - this.b) * (s - this.c));
		return x;
	}
	
	/**
	 * method perimeter()
	 * 
	 * finds perimeter of triangle.
	 * @return perimeter
	 */
	public double perimeter() {
		double x = this.a + this.b + this.c;
		return x;
	}
	
	/**
	 * method toString()
	 * 
	 * creates string of triangles' area, perimeter, length of side 1,2,3.
	 * @return string
	 */
	public String toString() {
		String str = "Triangle: Area = " + area() + "  Perimeter = " + perimeter() + "  Side 1 = " + this.a + "  Side 2 = " + this.b + "  Side 3 = " + this.b;
		return str;
	}
	
	public double getSide1() {
		return this.a;
	}
	
	public double getSide2() {
		return this.b;
	}
	
	public double getSide3() {
		return this.c;
	}

	/**
	 * method compareTo()
	 * 
	 * compares area of triangle to another 2D shape.
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
