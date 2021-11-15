package lab2;

/**
 * <b>Title:</b> Lab 2:<br>
 * <b>Filename:</b> Cylinder.java<br>
 * <b>Date Written:</b> 9/20/19<br>
 * <b>Due Date:</b> 9/21/19<br>
 * <p>
 * <b>Description:</b><br>
 *  A cylinder object and methods to find specifics of a cylinder such as area, volume, and
 * get height. Inheritance of the CurvedShape3D class.
 * </p>
 * <p>
 * Methods allow for creation of cylinder object.
 * </p>
 * <p><b>Algorithm:</b></p>
 * <p>
 * Cylinder extends CurvedShape3D class. Methods in that class can be used
 * in this class. Create method compareTo().
 *</p>
 *@author Brandon Gonzalez
 * Lab Members: Anibal Ruiz, Victor Arana
 */


public class Cylinder extends CurvedShape3D  {
	
	private double height;
	
	/**
	 * parameterized constructor Cylinder()
	 * 
	 * creates cylinder object with type, radius and height.
	 * @param type
	 * @param radius
	 * @param height
	 */
	public Cylinder(String t, double r, double h) {
		super(t,r);
		height = h;
	}
	
	/**
	 * method area()
	 * 
	 * calculates area of a cylinder
	 * @return area
	 */
	public double area() {
		double x  = 2 * (Math.PI) * (getRadius()) * (getRadius() + height);
		return x;
	}
	
	/**
	 * method volume()
	 * 
	 * calculates volume of a cylinder
	 * @return cylinder
	 */
	public double volume() {
		double x = Math.PI * (getRadius() * getRadius()) * height;
		return x;
	}
	
	/**
	 * method getHeight()
	 * 
	 * get the height measurement of a cylinder
	 * @return height
	 */
	public double getHeight() {
		return this.height;
	}
	
	/**
	 * method setHeight()
	 * set a new height measurement
	 * @param new height
	 */
	public void setHeight(double h) {
		height = h;
	}
	
	/**
	 * method toString()
	 * 
	 * create string of cylinders radius, area, volumes, and height.
	 * @return string
	 */
	public String toString() {
		String str = "Cylinder: Radius = "+ getRadius() + "  Area = "+ area() + "  Volume = "+ volume() + "   Height = " +  this.height;
		return str;
	}
	
	/**
	 * method compareTo()
	 * 
	 * compares volume of a cylinder to another 3D shape.
	 * @return 1 if volume is greater, 0 if equal, -1 if less.
	 */
	public int compareTo() {
		if (this.volume() > volume()) {
			return 1;
		}
		if (this.volume() < volume()) {
			return -1;
		}
		else {
			return 0;
		}
	}

}
