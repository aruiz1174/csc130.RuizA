package lab2;

/**
 * <b>Title:</b> Lab 2:<br>
 * <b>Filename:</b> Sphere.java<br>
 * <b>Date Written:</b> 9/20/19<br>
 * <b>Due Date:</b> 9/21/19<br>
 * <p>
 * <b>Description:</b><br>
 *  A sphere object and methods to find specifics of a sphere such as area, volume. 
 * Inheritance of the CurvedShape3D class.
 * </p>
 * <p>
 * Methods allow for creation of cone object.
 * </p>
 * <p><b>Algorithm:</b></p>
 * <p>
 * Sphere extends CurvedShape3D class. Methods in that class can be used
 * in this class. Create method compareTo() from Shape2D class.
 *</p>
 *@author Brandon Gonzalez
 * Lab Members: Anibal Ruiz, Victor Arana
 */

public class Sphere extends CurvedShape3D {
	
	/**
	 * parameterized constructor Sphere()
	 * 
	 * creates a new sphere object with set radius
	 * @param type
	 * @param radius
	 */
	public Sphere(String t, double r) {
		super(t, r);
	}
	
	/**
	 * method area()
	 * 
	 * calculates the area of a sphere.
	 * @return area
	 */
	public double area() {
		double x = 4 * (Math.PI) * (getRadius() * getRadius());
		return x;
	}
	
	/**
	 * method volume()
	 * 
	 * calculates volume of a sphere
	 * @return volume
	 */
	public double volume() {
		double x = 4 * Math.PI * getRadius() * getRadius();
		return x;
	}
	
	/**
	 * method toString()
	 * 
	 * creates string of spheres radius, area and volume.
	 * @return string
	 */
	public String toString() {
		String str = "Sphere: Radius = "+ getRadius() + "   Area = "+ area() + "   Volume = "+ volume();
		return str;
	}

	/**
	 * method compareTo()
	 * 
	 * compares volume of a sphere to another 3D shape.
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
