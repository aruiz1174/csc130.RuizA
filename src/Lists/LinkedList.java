package Lists;
/**
 * 
 * @author anibal ruiz
 *
 * @param <T>
 */

public class LinkedList<T extends Comparable<T>> implements List<T> {
	private class Node<E> {
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

	private Node<T> front = new Node<T>();
	private int size;


	public boolean add(T insertItem) {
		Node<T> trav = front;
		while (trav.next != null)
			trav = trav.next;
		trav.next = new Node<T>(insertItem);
		size++;
		return true;
	}


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

	@Override
	public boolean contains(T searchItem) {
		return indexOf(searchItem) >= 0;				
	}

	public T get(int index) {
		if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
		Node<T> trav = front;
		for(int i=0; i <= index; i++)
			trav = trav.next;
		return trav.data;
	}


	public T remove(T removeItem) {
		Node<T> trav = front;
		while (trav.next != null) {
			if (trav.next.data.compareTo(removeItem) == 0) {
				T temp = trav.next.data;
				trav.next = trav.next.next;
				size--;
				return temp;
			}
		}
		return null;
	}

	public T remove(int index) {
		System.out.println("haha");
		return null;
	}

	public boolean isEmpty() {
		return size==0;
	}


	public int getSize() {
		return size;
	}

	public void clear() {
		size = 0;
		front = new Node<T>();
	}
	public String toString() {
		String str = "";
		Node<T> trav = front;
		while (trav.next != null) {
			str += trav.next.data + "->";
			trav = trav.next;
		}
		return str;
	}
}
