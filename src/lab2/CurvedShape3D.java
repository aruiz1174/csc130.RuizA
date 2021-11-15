package lab2;

/**
 * <b>Title:</b> Lab 2:<br>
 * <b>Filename:</b> CurvedShape3D.java<br>
 * <b>Date Written:</b> 9/20/19<br>
 * <b>Due Date:</b> 9/21/19<br>
 * <p>
 * <b>Description:</b><br>
 * Base class for specific 3D shapes to inherit.
 * </p>
 * <p>
 * Creates methods that must be used in 3D shape classes.
 * </p>
 * <p><b>Algorithm:</b></p>
 * <p>
 * Extends the shape class and implements the comparable interface and Shape3D class. Allows for
 * class to use volume method and compareTo method. Creates methods that get used by 3D objects such as radius.
 *</p>
 *@author Brandon Gonzalez
 * Lab Members: Anibal Ruiz, Victor Arana
 */

public abstract class CurvedShape3D extends Shape implements Comparable<Shape3D>, Shape3D{

	private double radius;

	/**
	 * parameterized constructor CurvedShape3D()
	 * 
	 * Inherits parent class type. Creates radius by user.
	 * @param type
	 * @param radius
	 */
	public CurvedShape3D(String t, double r) {
		super (t);
		radius = r;

	}
	
	/**
	 * method getRadius()
	 * 
	 * gets the radius of a shape.
	 * @return radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * method setRadius()
	 * 
	 * sets a new radius number.
	 * @param new radius
	 */
	public void setRadius(double r) {
		this.radius = r;
	}
	
	/**
	 * method toString()
	 * 
	 * create string to for other classes to use and print type and information.
	 */
	public String toString() {
		String str = "";
		return str;
	}
	
	/**
	 * method compareTo()
	 * 
	 * compares two 3D shapes with their volume.
	 * @param 3D shape
	 * @return 1 if volume is greater, 0 if equal, -1 if less.
	 */
	public int compareTo(Shape3D s) {
		if (volume() > s.volume()) {
			return 1;
		}
		if (volume() < s.volume()) {
			return -1;
		}
		else {
			return 0;
		}
	}
}