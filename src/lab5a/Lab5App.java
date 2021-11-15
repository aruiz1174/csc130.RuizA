package lab5a;

/**
 * Title: The Application Class
 * 
 * @author Anibal Ruiz
 *
 * Description: Practice testing methods within the ArrayQueue class
 */

public class Lab5App 
{
	/**
	 * @param args
	 * @throws QueueException 
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) //throws QueueException
	{
		ArrayQueue<Integer> queue1 = new ArrayQueue<Integer>();
		System.out.println(queue1.toString());
		
		ArrayQueue<Integer> queue2 = new ArrayQueue<Integer>(3);
		System.out.println(queue2.toString());
		
		try {
			queue2.enqueue(new Integer(4));
		} catch (QueueException ex) {
			// TODO Auto-generated catch block
			System.out.println(ex.getMessage());
		}
		System.out.println(queue2.toString());
		
		try {
			queue2.enqueue(new Integer(5));
		} catch (QueueException ex) {
			// TODO Auto-generated catch block
			System.out.println(ex.getMessage());
		}
		try {
			queue2.enqueue(new Integer(6));
		} catch (QueueException ex) {
			// TODO Auto-generated catch block
			System.out.println(ex.getMessage());
		}
		System.out.println(queue2.toString());
		
		//queue2.enqueue(new Integer(7));
		//System.out.println(queue2.toString());
		System.out.println("The queue1 is full: " + queue1.isFull());
		System.out.println("The queue2 is full: " + queue2.isFull());
		
		try {
			System.out.println(queue1.front());
		} catch (QueueException ex) {
			System.out.println("The front for queue1 is empty");
		}
		
		try {
			System.out.println(queue1.rear());
		} catch (QueueException ex) {
			System.out.println("The rear for queue1 is empty");
		}
		
		try {
			System.out.println("The front for queue2 is: " + queue2.front());
		} catch (QueueException ex) {
			System.out.println("The front for queue2 is empty");
		}
		
		try {
			System.out.println("The rear for queue2 is; " + queue2.rear());
		} catch (QueueException ex) {
			System.out.println("The rear is empty");
		}
		
		System.out.println("\n************************************\n");
		System.out.println("The queue2 is full: " + queue2.isFull() + "\n");
		
		System.out.println("Dequeue until the queue2 is empty:");

		try {
			while(!queue2.isEmpty())
				System.out.println(queue2.dequeue());
		} catch (QueueException e) {
			// TODO Auto-generated catch block
			System.out.println("The queue2 is empty");
		}
		
		System.out.println("\nThe queue2 is full: " + queue2.isFull());
		
		System.out.println("\n************************************\n");
		
		System.out.println("\nThe queue1 is full: " + queue1.isFull());
		System.out.println("\nDequeue until the queue1 is empty:");

		try {
			while(!queue1.isEmpty())
				System.out.println(queue1.dequeue());
		} catch (QueueException e) {
			System.out.println("The queue1 is empty");
		}
		
		System.out.println("\nThe queue1 is full: " + queue1.isFull());
		
		System.out.println("\n************************************\n");
		System.out.println("New Queue:");
		ArrayQueue<Integer> queue3 = new ArrayQueue<Integer>(3);
		
		try {
			queue3.enqueue(new Integer(4));
		} catch (QueueException ex) {
			// TODO Auto-generated catch block
			System.out.println(ex.getMessage());
		}
		
		try {
			queue3.enqueue(new Integer(5));
		} catch (QueueException ex) {
			// TODO Auto-generated catch block
			System.out.println(ex.getMessage());
		}
		try {
			queue3.enqueue(new Integer(6));
		} catch (QueueException ex) {
			// TODO Auto-generated catch block
			System.out.println(ex.getMessage());
		}
		System.out.println(queue3.toString());

		System.out.println("\nThe queue3 is empty?\n" + queue3.isEmpty());
		System.out.println("\nThe queue2 is empty?\n" + queue2.isEmpty());
		
		System.out.println("\ntesting the makeEmpty method: ");
		
		System.out.println("\nThe queue3 is empty?\n" + queue3.isEmpty());
		
		try {
			queue3.makeEmpty();
		} catch (QueueException e) {
			// TODO Auto-generated catch block
			System.out.println("The queue is empty");
		}
		
		System.out.println("\nAfter calling the makeEmpty, The queue3 is empty?\n" + queue3.isEmpty());
		
	}
	
}
