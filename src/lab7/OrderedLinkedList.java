package lab7;

/**
 * 
 * @author anibalruiz
 *
 * @param <T>
 */


public class OrderedLinkedList<T extends Comparable<T>> extends LinkedList<T> 
{
	/**
	 * add method - adds an item to this list
	 * 
	 * @param insertItem is a reference to the item to be added
	 */
	public void add(T insertItem) {
		Node<T> trav = front;
		while (trav.getNext() != null 
				&& trav.getNext().getData().compareTo(insertItem) < 0)
			trav = trav.getNext();
		trav.setNext(new Node<T>(insertItem,trav.getNext()));
		size++;
	}
	
	/**
	 * remove method - remove an item to this list
	 * 
	 * @param removeItem is a reference to the item to be removed
	 */
	public T remove(T removeItem) {
		Node<T> trav = front;
		while (trav.getNext() != null) {
			int compare = trav.getNext().getData().compareTo(removeItem);
			if (compare == 0) {
				T temp = trav.getNext().getData();
				trav.setNext(trav.getNext().getNext());
				size--;
				return temp;
			}
			else
				if(compare < 0)			
					trav = trav.getNext();
				else
					return null;
		}
		return null;
	}
	
	/**
	 * indeOf method - return the location of an item
	 * 
	 * @param searchItem the item to be located
	 * return the location of the item
	 */
	public int indexOf(T searchItem) {
		Node<T> trav = front;
		int index = 0;
		if (size > 0) {
			while (trav.getNext() != null) {
				int compare = trav.getNext().getData().compareTo(searchItem);		
				if (compare == 0)
					return index;
				else 
					if(compare < 0) {			
						trav = trav.getNext();
						index++;
					}
					else
						break;
			}
		}
		return -1;
	}
	
	/**
	 * set method - mutator method, chanfe the value of an item
	 * 
	 * @param index and newItem
	 */
	public T set(int index, T newItem) {
		if (index < 0 || index >= size)
			throw new RuntimeException("Invalid index exception");
		if (newItem == null)
			throw new NullPointerException();
		T theData = remove(index);
		add(newItem);
		return theData;
	}
	
	/**
	 * 
	 * @param ol
	 * @return
	 */
	public OrderedLinkedList<T> merge(OrderedLinkedList<T> ol){
		OrderedLinkedList<T> newList = null;
		if(ol == null) return this; 
		//if(size == 0) return ol;
		newList = new OrderedLinkedList<T>();
		Node<T> trav = this.front;
		Node<T> otrav = ol.front;
		Node<T> ntrav = newList.front;
		while(trav.getNext() != null && otrav.getNext() != null) {
			int compare = trav.getNext().getData().compareTo(otrav.getNext().getData());
			if(compare <= 0) {
				ntrav.setNext(new Node<T>(trav.getNext().getData()));
				trav = trav.getNext();
			}
			else {
				ntrav.setNext(new Node<T>(otrav.getNext().getData()));
				otrav = otrav.getNext();
			}
			ntrav = ntrav.getNext();
		}
		while(trav.getNext() != null) {
			ntrav.setNext(new Node<T>(trav.getNext().getData()));
			trav = trav.getNext();
			ntrav = ntrav.getNext();
		}
		while(otrav.getNext() != null) {
			ntrav.setNext(new Node<T>(otrav.getNext().getData()));
			otrav = otrav.getNext();
			ntrav = ntrav.getNext();
		}	
		newList.size = this.size + ol.size;
		return newList;
	}
	
	
	private void addNode(Node<T> trav, Node<T> ntrav, OrderedLinkedList<T> newList) 
	{
		ntrav.setNext(new Node<T>(trav.getNext().getData()));
		trav = trav.getNext();
		ntrav = ntrav.getNext();
		newList.size++;
	}
}
