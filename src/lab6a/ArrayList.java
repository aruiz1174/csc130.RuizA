package lab6a;
/**
 * Title: ArrayList
 * 
 * @author anibalruiz
 * 
 * Description: CreeAte and array and comlete the method fro add, remove, and a a toString method representing the arrayList.
 * 
 * @param <T>
 */
public class ArrayList<T extends Comparable<T>> implements ArrayListADT<T>{
	private T[] data;
	private int numItems;
	private final int DEFAULT_CAPACITY = 100;
	
	/**
	 * Default constructor
	 */
	@SuppressWarnings("unchecked")
	public ArrayList() {
		data = (T[]) new Comparable[DEFAULT_CAPACITY];
		numItems = 0;
	}
	
	/**
	 * Parameterized Constructor
	 * @param size for the ArrayList size
	 */
	@SuppressWarnings("unchecked")
	public ArrayList(int size) {
		if(size < 1)
			data = (T[]) new Comparable[DEFAULT_CAPACITY];
		else
			data = (T[]) new Comparable[size];
		numItems = 0;
	}
	
	/**
     * add method - adds an item to this list
     * @param insertItem is a reference to the item to be added
     * @return <i>true</i> if item was added, <i>false</i> otherwise
     */
	public boolean add(T insertItem) {
		if(insertItem == null)
			return false;
		if(numItems == data.length)
			expandCapacity();
		data[numItems++] = insertItem;
		return true;
	}
	
	/**
	 * expand the capacity of the array the double
	 */
	@SuppressWarnings("unchecked")
	private void expandCapacity() {
		T[] tempArray = (T[])new Comparable[data.length * 2];
		for(int i=0;  i < data.length; i++)
			tempArray[i] = data[i];
		data = tempArray;
	}
	

    /**
     * Returns the index of the first occurrence of the specified item (key) in this list
     * @param searchItem is a reference to an item whose key-field has been initialized
     * @return the location of the first occurrence of the specified item in this list; 
     * if searchItem is not found, -1 is returned
     */
	public int indexOf(T searchItem) {
		for(int i=0; i < numItems; i++)
			if(data[i].equals(searchItem))
				return i;
		return -1;
	}
	
	 /**
     * Returns the index of the last occurrence of the specified item (key) in this list
     * @param searchItem is a reference to an item whose key-field has been initialized
     * @return the location of the last occurrence of the specified item in this list; 
     * if searchItem is not found, -1 is returned
     */
	public int lastIndexOf(T searchItem) {
		for(int i = numItems-1; i >= 0; i--)
			if(data[i].equals(searchItem))
				return i;
		return -1;
	}
	
	 /**
     * contains method - determines whether or not the searchItem (key)is in this list
     * @param searchItem is a reference to an item whose key-field has been initialized
     * @return <i>true</i> if the item is in this list, <i>false</i> otherwise 
     */
	public boolean contains(T searchItem) {
		if(indexOf(searchItem) == -1)
			return false;
		return true;
	}
	
	 /**
     * get method - returns the item at the specified location in this list
     * @param index is the index of the item in this list
     * @return the item, if it is in this list, otherwise null is returned
     */
	public T get(int index) {
		if(index >= 0 && index < numItems)
			return data[index];
		return null;
	}
	
	/**
     * Removes the first occurrence of the specified item from this list, if it is present
     * @param removeItem is a reference to an item whose key-field has been initialized
     * @return the item, if it is in this list, otherwise null is returned
     */
	public T remove(T removeItem) {
		int index = indexOf(removeItem);
		return(remove(index));
	}
	
	 /**
     * Removes the item at the specified location from this list, if it is present
     * @param index is the index of the item in this list
     * @return the item, if it is in this list, otherwise null is returned
     */
	public T remove(int index) {
		if(index < 0 )
			return null;
		// store data to return
		T tempData = data[index];
		//shift data
		data[index] = null;
		for(int i = index; i < data.length-1; i++)
			data[i] = data[i+1];
		
		--numItems;
 		return tempData;
 		
	}
	
	/**
     * empty method - determines whether or not this list is empty
     * @return <i>true</i> if this list is empty; <i>false</i> otherwise
     */
	public boolean isEmpty() {
		return numItems == 0;
	}

	/**
     * getSize method - returns the number of items in this list
     * @return the number of items in this list
     */
	public int getSize() {
		return numItems;
	}
	
	 /**
     * getCapacity method - returns the maximum size of this list
     * @return the maximum size of this list
     */
	public int getCapacity() {
		return data.length;
	}
	
	 /**
     * clear method - makes this list empty and sets numItems to 0
     */
	@SuppressWarnings("unchecked")
	public void clear() {
		data = (T[]) new Comparable[data.length];
		numItems = 0;
		System.gc();
	}
	
	/**
     * toString method - returns the state of the object as a String
     * @return a String containing the items in this list
     */
	public String toString() {
		String str = "";
		for(int i=0; i < numItems; i++)
			str += "\n" + data[i] + (i < numItems-1 ? ", " : "");
		return str + "\n";
	}

	/**
	 * 
	 */
	public boolean set(int index, T info) 
	{
		if(index >= 0 && index <= numItems && info != null)
		{
			data[index] = info;
			return true;
		}
		
		return false;
	}

	/**
	 * 
	 */
	public boolean set(T oldInfo, T newInfo) 
	{
		if(newInfo != null)
			return false;
		boolean did = false;
		for(int i = 0; i < numItems; i++)
		{
			if(data[i].compareTo(oldInfo) == 0)
			{
				data[i] = newInfo;
				did = true;
			}
		}
		return did;
	}

	/**
	 * 
	 */
	public boolean add(int index, T info) 
	{
		if(info == null)
			return false;
		if(index >= 0 && index <= numItems)
		{
			if(numItems == data.length)
				expandCapacity();
			for(int i = numItems-1; i >= index; i--)
			{
				data[i + 1] = data[i];
			}
			data[index] = info;
			numItems++;
			return true;
		}
		return false;
	}
}
