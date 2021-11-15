package Queue;
/**
 * Title: 
 * @author anibalruiz
 * This Queue interface represents a first-in-first-out queue of objects.
 * The usual enqueue and dequeue operations are provided, and methods to test whether the stack is empty or full.
 */
public interface Queue<T> 
{
	/**
	 * enqueue method - adds the specified item to the rear of the queue
	 * @param T d a reference to the item to be added to the queue
	 *  * @throws an EmptyQueueException if the queue is empty
	 */
	void enqueue(T d) throws QueueException;
	
	/**
	 * dequeue method - removes the item at the front of the queue
	 * @return a reference to the item removed from the front of the queue
	 * @throws an EmptyQueueException if the queue is empty
	 */
	T dequeue() throws QueueException;
	
	/**
	 * front method - returns a reference to the item at the front of the queue
	 * without removing it from the queue
	 * @return a reference to the item at the front of the queue
	 * @throws an EmptyQueueException if the queue is empty  
	 */
	T front() throws QueueException;
	
	/**
	 * rear method - returns a reference to the item at the end of the queue
	 * without removing it from the queue
	 * @return a reference to the item at the end of the queue
	 * @throws an EmptyQueueException if the queue is empty  
	 */
	T rear() throws QueueException;
	
	/**
	 * isEmpty method - determines whether or not the queue is empty
	 * @return true if the queue is empty; false if the queue is not empty
	 */
	boolean isEmpty();
	
	/**
	 * isFull method - determines whether or not the queue is full
	 * @return true if the queue is full false if the queue is not full
	 */
	boolean isFull();
	
	int getSize();
	

}
