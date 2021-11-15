package lab2;

/**
 * <b>Title:</b> Lab 2:<br>
 * <b>Filename:</b> Cube.java<br>
 * <b>Date Written:</b> 9/20/19<br>
 * <b>Due Date:</b> 9/21/19<br>
 * <p>
 * <b>Description:</b><br>
 * A cube object and methods to find specifics of a cube such as area, volume, and
 * get side. Inheritance of the CurvedShape3D class.
 * </p>
 * <p>
 * Methods allow for creation of cube object.
 * </p>
 * <p><b>Algorithm:</b></p>
 * <p>
 * Cube extends CurvedShape3D class. Methods in that class can be used
 * in this class. Create method compareTo().
 *</p>
 *@author Brandon Gonzalez
 * Lab Members: Anibal Ruiz, Victor Arana
 */


public class Cube extends Shape implements Comparable<Shape3D>{
	private double side;

	/**
	 * parameterized constructor Cube()
	 * 
	 * Inherits t, creates object Cube with side input.
	 * @param type
	 * @param side
	 */
	public Cube(String t, double s) {
		super (t);
		side = s;
	}
	
	/**
	 * method area()
	 * 
	 * calculates the area of a cube
	 * @return area
	 */
	public double area() {
		double x = 6 * (this.side*this.side);
		return x;
	}
	
	/**
	 * method volume()
	 * 
	 * calculates volume of a cube
	 * @return volume
	 */
	public double volume() {
		double x = this.side * this.side * this.side;
		return x;
	}

	/**
	 * method getSide()
	 * 
	 * gets the side measurement of the cube.
	 * @return side
	 */
	public double getSide() {
		return this.side;
	}

	/**
	 * method setSide()
	 * 
	 * set a new side measurement.
	 * @param side
	 */
	public void setSide(double s) {
		side = s;

	}
	
	/**
	 * method toString()
	 * 
	 * creates string of cubes' side, area, and volume
	 * @return string
	 */
	public String toString() {
		String str = "Cube: Side = "+ this.side + "  Area = "+ this.area() + "  Volume = "+ volume(); 
		return str;
	}
	
	/**
	 * method compareTo()
	 * 
	 * compares volume of a Cube to another 3D shape.
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
