package lab2;

/**
 * <b>Title:</b> Lab 2:<br>
 * <b>Filename:</b> Shape3D.java<br>
 * <b>Date Written:</b> 9/20/19<br>
 * <b>Due Date:</b> 9/21/19<br>
 * <p>
 * <b>Description:</b><br>
 * Interface that holds the method volume and extends comparable to use the compareTo method
 * </p>
 * <p><b>Algorithm:</b></p>
 * <p>
 * Can only contain abstract methods. Extends comparable for those that inherit this interface
 * also inherit the comparable interface.
 *</p>
 *@author Brandon Gonzalez
 * Lab Members: Anibal Ruiz, Victor Arana
 */


public interface Shape3D extends Comparable<Shape3D>{
	/**
	 * abstract method volume()
	 * 
	 * Empty but allows those that inherit this class to use volume method.
	 * @return
	 */
	public abstract double volume();
	
}


