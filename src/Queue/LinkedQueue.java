package Queue;

public class LinkedQueue<T> implements Queue<T>
{
	private class Node<E>
	{
		private E data;
		Node<E> next;
		
		@SuppressWarnings("unused")
		public Node()
		{
			data = null;
			next = null;
		}
		
		public Node(E d)
		{
			data = d;
			next = null;
		}
		
		@SuppressWarnings("unused")
		public Node(E d, Node<E> e)
		{
			data = d;
			next = e;
		}
	}
	
	private Node<T> front, rear; //references to the first and last nodes
	private int size;

	/**
	 * default constructor - creates an empty queue
	 */
	public LinkedQueue()
	{
		front = rear = null;
	}

	/**
	 * enqueue method - adds the specified item to the rear of the queue
	 * @param newItem a reference to the item to be added to the queue
	 */
	public void enqueue(T d)  
	{
		Node<T> temp = new Node<T>(d);
		if(isEmpty())
		{
			front = rear = temp;
		}
		else
		{
			rear.next = temp;
			rear = rear.next;
		}
		size++;
	}

	/**
	 * dequeue method - removes the item at the front of the queue
	 * @return a reference to the item removed from the front of the queue
	 * @throws an EmptyQueueException if the queue is empty
	 */
	public T dequeue() throws QueueException 
	{
		if(isEmpty())
			throw new QueueException("The Queue is empty");
		T temp = front.data;
		front = front.next;
		
		if(front == null)
			rear = null;
		size--;
		
		return temp;
	}

	public T front() throws QueueException 
	{
		
		if(isEmpty())
			throw new QueueException();
		return front.data;
	}


	public T rear() throws QueueException 
	{
		if(isEmpty())
			throw new QueueException();
		
		return rear.data;
	}

	public boolean isEmpty() 
	{
		
		return size == 0;
	}

	public boolean isFull() {
		return false;
	}


	public int getSize() {
		return 0;
	}
	
	/**
	 * toString method - returns a String representing the state of the queue
	 * @return a string containing all items in the queue
	 */
	public String toString()
	{
		String str = "Size of the queue is " + size + "\n";
		Node<T> current = front;
		while(current != null)
		{
			str += current.data + " ";
			current = current.next;
		}
		
		return str;
	}
	

}
