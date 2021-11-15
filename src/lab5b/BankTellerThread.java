package lab5b;
/**
 * Title: BankTellerThread
 * Author; Anibal Ruiz
 * Description: as an extends of Thread, it has all the time for the transactions and the min.
 */
import java.util.Random;

public class BankTellerThread extends Thread
{
	private int iDNumber; // teller's id number
	private ArrayQueue<Customer> queue; // the queue for the customers
	private long startIdleTime = System.currentTimeMillis(); // start of idle time
	private long endIdleTime = startIdleTime; // end of idle time
	private int count; // number of customers processed by this teller
	private ProducerThread producer; // the producer thread
	
	/**
	 * Parameterized constructor
	 * @param number for Idnumber
	 * @param q for fot he queue
	 * @param p for producer
	 */
	public BankTellerThread(int number, ArrayQueue<Customer> q, ProducerThread p)
	{
		iDNumber = number;
		queue = q;
		producer = p;
	}

	/**
	 * void run() method
	 * have the time of the transaction
	 */
	public void run()
	{
		@SuppressWarnings("unused")
		long wait = System.currentTimeMillis() - startIdleTime;
		long idleTime = endIdleTime - startIdleTime/1000;
		
		//Create a loop that repeats as long as the ProducerThread is alive (call the isAlive method)
		while(producer.isAlive())
		{
			// Create an if block that executes if the queue is not empty
			if(!queue.isEmpty())
			{
				try
				{
					//Get a customer from the queue
					Customer customer = new Customer(count, System.currentTimeMillis());
					customer = queue.dequeue();
					
					//Update the teller's idle time with the current time
					idleTime = System.currentTimeMillis();
					
					//Update the customer's wait time and start time with the same current time
					wait = System.currentTimeMillis();
					
					//Generate a random number 1000 to 15000 milliseconds representing the transaction time.
					Random rand = new Random();
					int n = rand.nextInt(15000) + 1000;
					
					//Display a message with the current time stating the start of a transaction.
					startIdleTime = System.currentTimeMillis();
					System.out.println("\nMinute: " + SimulationTime.timeSinceStart(System.currentTimeMillis()) + "\nTeller " + iDNumber + ": [idle time: " + SimulationTime.timeSinceStart(idleTime) + " minutes, processing transaction for customer: " + count + "\n");
					
					//Use the above random number to pause the thread by calling the sleep method with the specified
					//time. This will simulate the time spend processing the transaction.
					//The sleep method throws and InterruptedException. so surround it with a try/catch block.
					sleep(n);
					
					//save the current time
					long save = System.currentTimeMillis();
					
					//Call the customer's setEndTime method and pass the above time to update the time the
					//transaction ended.
					customer.setTransactionEndTime(save);
					
					//Display an appropriate message with the teller's id number and idle time. The idle time in minutes
					//is calculated by (endIdleTime - startIdleTime) / 1000.
					System.out.println("\nMinute: " + SimulationTime.timeSinceStart(System.currentTimeMillis()) + "\nteller " + iDNumber + ": Idle time: " + SimulationTime.timeSinceStart(idleTime) + ", processed:");
					
					//Display the customer. This will call the customer’s toString method automatically.
					System.out.println(customer.toString() + "\n");
					count++;
					//add 1 to count
					idleTime = System.currentTimeMillis();
					
					
				}
				catch (QueueEmptyException ex)
				{
					System.out.println("\n" + ex.getMessage() + "... teller " + iDNumber + " waiting for costumer"+ "\n");
				}
				catch (InterruptedException ex)
				{
					System.out.println(ex.getMessage());
				}
				
			}
		}
	}
} 
