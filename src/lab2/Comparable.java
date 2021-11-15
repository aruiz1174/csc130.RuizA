package lab2;

/**
 * <b>Title:</b> Lab 2:<br>
 * <b>Filename:</b> Lab2App.java<br>
 * <b>Date Written:</b> 9/20/19<br>
 * <b>Due Date:</b> 9/21/19<br>
 * <p>
 * <b>Description:</b><br>
 * Interface that holds the compareTo abstract method.
 * </p>
 * <p><b>Algorithm:</b></p>
 * <p>
 * Allows the classes that inherit this interface to use the compareTo method.
 *</p>
 *@author Brandon Gonzalez
 * Lab Members: Anibal Ruiz, Victor Arana
 */


@SuppressWarnings("hiding")
public interface Comparable<Shape2D>{
	/**
	 * abstract method compareTo()
	 * 
	 * Empty but allows other classes to use this method.
	 * @return
	 */
	public abstract int compareTo();

}
