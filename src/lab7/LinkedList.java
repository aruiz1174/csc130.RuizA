package lab7;

/**
 * @author grahamf
 */
public class LinkedList<T extends Comparable<T>> implements List<T> {
	protected class Node<E> {
		private E data;
		private Node<E> next;

		public Node() {
			data = null;
			next = null;
		}

		public Node(E d) {
			data = d;
			next = null;
		}

		public Node(E d, Node<E> n) {
			data = d;
			next = n;
		}

		public E getData() {
			return data;
		}

		public void setData(E data) {
			this.data = data;
		}

		public Node<E> getNext() {
			return next;
		}

		public void setNext(Node<E> next) {
			this.next = next;
		}

		public String toString() {
			return data + ":" + next;
		}
	}

	protected Node<T> front = new Node<T>();
	protected int size;

	/**
	 * add method - adds an item to this list
	 * 
	 * @param insertItem is a reference to the item to be added
	 */
	public void add(T insertItem) {
		Node<T> trav = front;
		while (trav.next != null)
			trav = trav.next;
		trav.next = new Node<T>(insertItem);
		size++;
	}
	/**
	 * remove method - removes the first occurrence of the specified item from this
	 * list, if it is present
	 * 
	 * @param removeItem is a reference to an item whose key-field has been
	 *                   initialized
	 * @return the item, if it is in this list, otherwise null is returned
	 */
	public T remove(T removeItem) {
		Node<T> trav = front;
		while (trav.next != null) {
			if (trav.next.data.compareTo(removeItem) == 0) {
				T temp = trav.next.data;
				trav.next = trav.next.next;
				size--;
				return temp;
			}
			trav = trav.next;
		}
		return null;
	}
	/**
	 * indexOf method - returns the index of the first occurrence of the specified
	 * item (key) in this list
	 * 
	 * @param searchItem is a reference to an item whose key-field has been
	 *                   initialized
	 * @return the index of the first occurrence of the specified item in this list;
	 *         if searchItem is not found, -1 is returned
	 */
	public int indexOf(T searchItem) {
		Node<T> trav = front;
		int index = 0;
		if (size > 0) {
			while (trav.next != null)
				if (trav.next.data.compareTo(searchItem) == 0)
					return index;
				else {
					trav = trav.next;
					index++;
				}
		}
		return -1;
	}

	/**
	 * lastIndexOf method - returns the index of the last occurrence of the specified
	 * item (key) in this list
	 * 
	 * @param searchItem is a reference to an item whose key-field has been
	 *                   initialized
	 * @return the index of the last occurrence of the specified item in this list;
	 *         if searchItem is not found, -1 is returned
	 */
	public int lastIndexOf(T searchItem) {
		Node<T> trav = front;
		int index = 0, loc = -1;
		if (size > 0) {
			while (trav.next != null) {
				if (trav.next.data.compareTo(searchItem) == 0)
					loc = index;
				else {
					trav = trav.next;
					index++;
				}
			}
		}
		return loc;
	}

	/**
	 * contains method - determines whether or not the searchItem (key)is in this
	 * list
	 * 
	 * @param searchItem is a reference to an item whose key-field has been
	 *                   initialized
	 * @return <i>true</i> if the item is in this list, <i>false</i> otherwise
	 */
	public boolean contains(T searchItem) {
		return indexOf(searchItem) >= 0;				
	}
	
	/**
	 * isEmpty method - determines whether or not this list is empty
	 * 
	 * @return <i>true</i> if this list is empty; <i>false</i> otherwise
	 */
	public boolean isEmpty() {
		return size==0;
	}

	/**
	 * getSize method - returns the number of items in this list
	 * 
	 * @return the number of items in this list
	 */
	public int getSize() {
		return size;
	}

	/**
	 * clear method - makes this list empty and sets size to 0
	 */
	public void clear() {
		size = 0;
		front = new Node<T>();
	}
	/**
	 * toString method - returns the state of the object as a String
	 * 
	 * @return a String containing the items in this list
	 */
	public String toString() {
		String str = "";
		Node<T> trav = front;
		while (trav.next != null) {
			str += trav.next.data + "->";
			trav = trav.next;
		}
		return str;
	}
	/**
	 * get method - returns the item at the specified index in this list
	 * 
	 * @throws RuntimeException if the index is out of bounds
	 * @param index   is the index of the item in this list
	 * @return the item, if it is in this list, otherwise null is returned
	 */
	public T get(int index) {
		if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
		Node<T> trav = front;
		for(int i=0; i < index; i++)
			trav = trav.next;
		return trav.next.data;
	}
	/**
	 * set method - returns the item at the specified index in this list
	 * 
	 * @throws RuntimeException if the index is out of bounds
	 * @param index is the index of the item in this list
	 * @param newItem the value to change the item at the specified index 
	 * @return the item, if it is in this list, otherwise null is returned
	 */
	public T set(int index, T newItem) {
		if (index < 0 || index >= size)
			throw new RuntimeException("Invalid index exception");
		if (newItem == null)
			throw new NullPointerException();

		Node<T> trav = front;
		for (int i = 0; i < index; i++)
			trav = trav.next;

		T theData = trav.next.data;
		trav.next.data = newItem;
		return theData;
	}

	/**
	 * remove method - removes the item at the specified location from this list, if it is present
	 * 
	 * @throws RuntimeException if the index is out of bounds
	 * @param index is the index of the item in this list
	 * @return the item, if it is in this list, otherwise null is returned
	 */
	public T remove(int index) throws RuntimeException {
		if (index < 0 || index >= size)
			throw new RuntimeException("Invalid index exception");

		Node<T> trav = front;
		for (int i = 0; i < index; i++)
			trav = trav.next;

		T theData = trav.next.data;
		trav.next = trav.next.next;
		--size;
		return theData;
	}
	/**
	 * subList method - returns a list starting from fromIndex to ToIndex-1
	 * 
	 * @throws RuntimeException if the indices are out of bounds or toIndex < fromindex
	 * @param fromIndex is the index from which to start
	 * @param toIndex is the index to stop 
	 * @return the sublist
	 */
	public LinkedList<T> subList(int fromIndex, int toIndex)  throws RuntimeException{
		if ((fromIndex < 0 || fromIndex >= size) || (toIndex < 0 || toIndex > size || toIndex < fromIndex))
			throw new RuntimeException("Invalid index exception");
		LinkedList<T> subList = new LinkedList<T>();
		Node<T> trav = front;
		for (int i = 0; i < fromIndex; i++)
			trav = trav.next;
		Node<T> subTrav = subList.front;
		for (int i = fromIndex; i < toIndex; i++) {
			subTrav.next = new Node<T>(trav.next.data);
			subList.size++;
			trav = trav.next;
			subTrav = subTrav.next;
		}
		return subList;
	}

}