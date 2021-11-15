package lab2;

/**
 * <b>Title:</b> Lab 2:<br>
 * <b>Filename:</b> Cone.java<br>
 * <b>Date Written:</b> 9/20/19<br>
 * <b>Due Date:</b> 9/21/19<br>
 * <p>
 * <b>Description:</b><br>
 *  A cone object and methods to find specifics of a cone such as area, volume, and
 * get height. and inheritance of the CurvedShape3D class.
 * </p>
 * <p>
 * Methods allow for creation of cone object.
 * </p>
 * <p><b>Algorithm:</b></p>
 * <p>
 * Cone extends CurvedShape3D class. Methods in that class can be used
 * in this class. Create method compareTo()
 *</p>
 *@author Brandon Gonzalez
 * Lab Members: Anibal Ruiz, Victor Arana
 */


public class Cone extends CurvedShape3D{
	private double height;
	
	/**
	 * parameterized constructor Cone()
	 * 
	 * creates cone object with type cone, height, and radius.
	 * @param type
	 * @param height
	 * @param radius
	 */
	public Cone( String t, double h, double r) {
		super(t,r);
		height = h;
		
	}
	
	/**
	 * method area()
	 * 
	 * calculates area of a cone.
	 * @return area
	 */
	public double area() {
		double x = Math.sqrt((this.height * this.height)+ getRadius() * getRadius());
		double y = Math.PI * getRadius() * x;
		return y;
	}
	
	/**
	 * method volume()
	 * 
	 * calculates volume of a cone.
	 * @return volume
	 */
	public double volume() {
		double x = (1/3) * Math.PI * (getRadius() * getRadius()) * this.height;
		return x;
	}
	
	/**
	 * method getHeight()
	 * 
	 * gets the height number of the cone.
	 * @return height
	 */
	public double getHeight() {
		return this.height;
	}
	
	/**
	 * method setHeight()
	 * 
	 * sets a new height for the cone.
	 * @param new height
	 */
	public void setHeight(double h) {
		height = h;
		}
	
	/**
	 * method getSlantHeight()
	 * 
	 * returns the slant height of the cone using pythagorean theorem.
	 * @return slant height
	 */
	public double getSlantHeight() {
		double x = (this.height * this.height) +  (getRadius() * getRadius());
		Math.sqrt(x);
		return x;
	}
	
	/**
	 * method toString
	 * 
	 * creates string of cones' radius, area, volume, height, and slant height.
	 * @return string
	 */
	public String toString() {
		String str = "Cone: Radius = "+ getRadius() + "  Area  = "+ area() + "  Volume = "+ volume() + "   Height = " +  this.height + "   Slant Height = " + getSlantHeight();
				return str;
	}
	
	/**
	 * method compareTo()
	 * 
	 * compares volume of a cone to another 3D shape.
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
