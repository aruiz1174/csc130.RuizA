package lab5b;
/**
 * Title: ProducerThread class
 * @author Anibal Ruiz
 * Description: The main loop is based on (the current time - start time < simulation time)
 * 
 */
public class ProducerThread extends Thread
{
	private ArrayQueue<Customer> line; // the line the customers wait in
	private long simulationTime; // how long to run the simulation
	private int averageArrivalTime; // average time between customer arrivals
	private int count; // number of customers handled
	private final long startTime = System.currentTimeMillis(); // current time

	/**
	 * Parameterized method:
	 * @param l for the queue
	 * @param simulate for the simualtionTime
	 * @param average for the avergaeArrivalTime
	 */
	public ProducerThread(ArrayQueue<Customer> l, long simulate, int average)
	{
		line = l;
		simulationTime = simulate;
		averageArrivalTime = average;
	}
	
	/**
	 * run() method
	 * run the program for 1 minute
	 */
	public void run() 
	{
		//SimulationTime time = new SimulationTime();
		//long t = time.timeSinceStart(startTime);
		//. Create a try block and sleep for 10000 milliseconds - sleep for 10 minutes (wait until bank is open).
		try
		{
			sleep(10*1000);
		}
		catch (InterruptedException ex)
		{
			System.out.println("Bank is opne now for business");
		}
		
		//System.out.println("Hey");
		//Create a loop that repeats for the specified simulation time:
		while((System.currentTimeMillis() - startTime) < simulationTime)
		{
			//Within the loop, create a try/catch block and do the following:
			try
			{
				//Instantiate a new customer with parameters: customer’s ID number and the arrival time. Use the
				//count for the id number and use System.currentTimeMillis() for the arrival time.
				Customer customer = new Customer(count, System.currentTimeMillis());
				
				//Display a message indicating the customer's arrival; use the same arrival time from step a above. 
				System.out.println("\nCustomer " + count + " arrived at minute " + SimulationTime.timeSinceStart(System.currentTimeMillis()));
				
				//If the queue is full, display a message indicating that the queue is full and the customer left the bank
				
				if(line.isFull())
				{
					System.out.println("Queue is full. Customer " + count + " left the bank.");
				}
				
				//Otherwise, add the customer to the queue and display a message indicating that the customer was
				//added to the queue.
				else
				{
					line.enqueue(customer);
					System.out.println("Customer " + count + " added to the queue.");
				}
				
				//Call the timeTillNext (static) method in the SimulationTime class and pass the averageArrivalTime.
				 //This will generate and return the time when the next customer will arrive.
				long waitTime = SimulationTime.timeTillNext(averageArrivalTime);
				sleep(waitTime); //waiting fot he next customer to arrive
				count++; //increment the count
			}
			catch (QueueFullException ex)
			{
				System.out.println("\n" + ex.getMessage());
			}
			catch (InterruptedException ex)
			{
				System.out.println(ex.getMessage());
			}
		}
		System.out.println("done");
		
		//When the thread stop's running (after the run method ends), display a message indicating the thread has stopped
		//and the number of customers produced.

	}
	

}
