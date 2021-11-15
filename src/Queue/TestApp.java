package Queue;

public class TestApp 
{
	/**
	 * 
	 * @param args
	 * @throws QueueException 
	 */
	public static void main(String[] args) throws QueueException
	{
		LinkedQueue<Integer> queue = new LinkedQueue<Integer>();
		System.out.println(queue);
		
		int[] x = {3, 2, 1, 7};
		for(int i : x)
			queue.enqueue(i);
		System.out.println(queue);
		System.out.println("The front is " + queue.front());
		System.out.println("The rear is " + queue.rear());
		
		queue.dequeue();
		System.out.println("\nAfter calling the dequeue method once, the queue is now: \n" + queue);
		System.out.println("The front is " + queue.front());
		System.out.println("The rear is " + queue.rear());
		System.out.println("Is the queue empty? " + queue.isEmpty());
		
		LinkedQueue<Integer> queue2 = new LinkedQueue<Integer>();
		System.out.println("Is the queue2 empty? " + queue2.isEmpty());
	}
	

}
