package Stacks;
/**
 * <p>Title: The LinkedStack Class</p>
 *
 * <p>Description: Defines the properties and behaviors of a basic stack
 * implemented using a linked list.</p>
 *
 * @author Anibal
 */

public class LinkedStack<T> implements Stack<T>
{
	private class Node<E>
	{
		private E info;
		private Node<E> next;
		
		public Node()
		{
			info = null;
			next = null;
		}
		
		public Node(E info)
		{
			this.info = info;
			next = null;
		}
		
		public Node(E info, Node<E> next)
		{
			this.info = info;
			this.next = next;
		}
		
	}
	
	private Node<T> front;
	private int size;
	
	/**
	 * default constructor - creates an empty stack
	 */
	public LinkedStack()
	{
		front = null;
	}
	

	/**
	 * push method - stores a new item on the top of the stack
	 * @param item a reference to the item to be stored on top of the stack
	 */
	public void push(T item)  
	{
		front = new Node<T>(item, front);
		size++;
	}

	/**
	 * pop method - removes the top-most item from the stack
	 * @return a reference to the item which was stored on top of the stack
	 * @throws EmptyStackException 
	 */
	public T pop() throws StackEmptyException 
	{
		if(isEmpty())
		{
			throw new StackEmptyException("Stack is empty");
		}
		T data = front.info;
		size--;
		front = front.next;
		return data;
	}

	/**
	 * peek method - returns the top-most item on the stack without removing it
	 * @return a reference to the item which is stored on top of the stack
	 * @throws EmptyStackException if the stack is empty
	 */  
	public T peek() throws StackEmptyException 
	{
		if(isEmpty())
		{
			throw new StackEmptyException("Stack is empty");
		}
		return front.info;
	}

	/**
	 * toString method - returns a String representing the state of the stack
	 * @return a string containing all items in the stack
	 */
	public String toString()
	{
		String str = "Stack size: " + size + "\n";
		Node<T> trav = front;
		while(trav != null)
		{
			str += trav.info + "\n";
			trav = trav.next;
		}
		return str;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return false;
	}

	public int getSize() 
	{
		return size;
	}
	

}
