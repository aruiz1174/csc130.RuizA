package lab2;

/**
 * <b>Title:</b> Lab 2:<br>
 * <b>Filename:</b> Circle.java<br>
 * <b>Date Written:</b> 9/20/19<br>
 * <b>Due Date:</b> 9/21/19<br>
 * <p>
 * <b>Description:</b><br>
 * Creates a circle object by methods and inheritance of the Shape2D class.
 * </p>
 * <p>
 * Methods allow for creation of circle object.
 * </p>
 * <p><b>Algorithm:</b></p>
 * <p>
 * Circle extends Shape2D class, abstract methods must be made into methods that are
 * usable. Create other methods to find area such as radius. Create method compareTo()
 * from Shape2D class.
 *</p>
 *@author Brandon Gonzalez
 * Lab Members: Anibal Ruiz, Victor Arana
 */

public class Circle extends Shape2D 
{
	private double radius;
	
	/**
	 * parameterized constructor Circle()
	 * 
	 * creates circle object by inheriting type from Shape class. Creates radius.
	 * @param type
	 * @param radius
	 */
	public Circle(String t, double r)
	{
		super (t);
		radius = r;
		
	}
	
	/**
	 * method getRadius()
	 * 
	 * get the radius number of the shape.
	 * @return radius
	 */
	public double getRadius()
	{
		return radius;
	}
	
	/**
	 * method setRadius
	 * 
	 * set a new radius number for the circle.
	 * @param new radius
	 */
	public void setRadius(double r)
	{
		this.radius = r;
	}
	
	/**
	 * method area()
	 * 
	 * find the area of the circle.
	 * @return area
	 */
	public double area()
	{
		double x = Math.PI * radius * radius;
		return x;
	}
	
	/**
	 * method perimeter()
	 * 
	 * calculates the perimeter of a circle.
	 * @return perimeter
	 */
	public double perimeter()
	{
		double x = 2 * (Math.PI) * radius;
		return x;
	}
	
	/**
	 * method toString()
	 * 
	 * create a string of information of the circle including area, perimeter, and radius.
	 * @return string of information
	 */
	public String toString()
	{
		String str = "Circle: Area = " + area() + "  Perimeter = " + perimeter() + "   Radius = "+ radius;
		return str;
	}

	/**
	 * method compareTo()
	 * 
	 * compares the area of a circle to another shape.
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
