package lab5a;
/**
 * Title: ArrayQueue<T> class
 * 
 * @author Anibal Ruiz
 *
 * Description: This ArrayQueue class represents a first-in-first-out, queue of objects.
 * The usual enqueue and dequeue operations are provided.
 * and methods to test whether the queue is empty or full.
 * When a queue is first created, it contains no items.
 */

public class ArrayQueue<T> implements Queue<T>
{
	private T[] data;
	private int numItems;
	private int front;
	private final int DEFAULT_CAPACITY = 100;
	

	/**
	 * default constructor - creates an empty queue
	 */
	@SuppressWarnings("unchecked")
	public ArrayQueue()
	{
		data = (T[]) new Object[DEFAULT_CAPACITY];
		numItems = 0;
		front = 0;
	}
	
	/**
	 * parameterized Constructor- creates an empty queue and instantiated with the param.
	 * @param size
	 */
	@SuppressWarnings("unchecked")
	public ArrayQueue(int size)
	{
		front = 0;
		if (size > 0)
			data = (T[]) (new Object[size]);
		else
			data = (T[]) (new Object[100]);
		numItems = 0;
	}

	/**
	 * enqueue method - adds the specified item to the rear of the queue
	 * @param T d a reference to the item to be added to the queue
	 *  * @throws an EmptyQueueException if the queue is empty
	 */
	public void enqueue(T d) throws QueueException 
	{
		if(isFull())
		{
			throw new QueueException("Queue full exception");
		}
		data[(front + numItems) % data.length] = d;
		numItems++;
		
	}

	/**
	 * dequeue method - removes the item at the front of the queue
	 * @return a reference to the item removed from the front of the queue
	 * @throws an EmptyQueueException if the queue is empty
	 */
	public T dequeue() throws QueueException 
	{
		if(isEmpty())
			throw new QueueException("Queue empty exception");
		T info = data[front];
		data[front] = null;
		front = (front + 1) % data.length;
		numItems--; 
		return info;
	}

	/**
	 * front method - returns a reference to the item at the front of the queue
	 * without removing it from the queue
	 * @return a reference to the item at the front of the queue
	 * @throws an EmptyQueueException if the queue is empty  
	 */
	public T front() throws QueueException 
	{

		if(isEmpty())
			throw new QueueException("Queue empty exception");
		
		return data[front];
	}

	/**
	 * rear method - returns a reference to the item at the end of the queue
	 * without removing it from the queue
	 * @return a reference to the item at the end of the queue
	 * @throws an EmptyQueueException if the queue is empty  
	 */
	public T rear() throws QueueException 
	{

		if(isEmpty())
			throw new QueueException("Queue empty exception");
		
		return data[((front + numItems) - 1)/data.length];
	}

	/**
	 * isEmpty method - determines whether or not the queue is empty
	 * @return true if the queue is empty; false if the queue is not empty
	 */
	public boolean isEmpty() 
	{
		return numItems == 0;
	}

	/**
	 * isFull method - determines whether or not the queue is full
	 * @return true if the queue is full false if the queue is not full
	 */
	public boolean isFull() 
	{
		return numItems == data.length;
	}

	/**
	 *  return and get numItems
	 */
	public int getSize() 
	{
		return numItems;
	}
	

/**
 * toString method - returns a String representing the state of the queue
 * @return a string containing all items in the queue
 */
	public String toString()
	{
		String str = "";
		
		if(numItems == 0)
		{
			str += "Queue is empty! Maximum number of items that can be stored is " + data.length;
		}
		else
		{
			str += "The number of items in the queue is: " + numItems;
			str += "\nThe queue contains the following:\n";
			for(int i = 0; i < numItems; i++)
			{
				str += data[(front + i) & data.length] + " ";
			}
		}
		return str;
	}
	
	/**
	 * makeEmpty method - this method makes the queue totally empty.
	 * @throws QueueException
	 */
	@SuppressWarnings("unused")
	public void makeEmpty() throws QueueException
	{
		if(isEmpty())
			throw new QueueException("Queue empty exception");
		while(!isEmpty())
		{
			T info = data[front];
			data[front] = null;
			front = (front + 1) % data.length;
			numItems--;
		}
	}

}
