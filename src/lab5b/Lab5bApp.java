package lab5b;
/**
 * Title: Application Class
 * @author anibal ruiz
 * Description: claa the producer, banl and costumer classes, with the quwue to run the program 
 * and start the transaction.
 *
 */
public class Lab5bApp 
{
	public static void main(String[] args)
	{
		//Declare a constant (final int) to represent the 5 input values passed into the program via command line
		//arguments
		final int constant;
		
		//Declare an integer array, input, to store the 5 parameters
		int[] input = new int[5];
		
		//Declare an integer variable, queueSize, for the size of the queue.
		int queueSize;
		
		//Declare an integer variable, avgArrivalTime, for the mean customer arrival time
		int avgArrivalTime;
		
		//Declare an integer variable called tellers for the number of tellers.
		int tellers;
		
		//Declare a long variable, simulationTime, for the simulation time (this will store minutes after conversion
		//to milliseconds).
		long simulationTime;
		
		//Declare a variable, tg, for a ThreadGroup (see the code below). The bank teller threads will be added to
		//this ThreadGroup later.
		ThreadGroup tg = new ThreadGroup("tellers");
		
		//Declare a reference to an array of Threads, teller, (data type is Thread) and set it equal to null
		Thread[] teller = null;
		
		//Declare a reference to a ProducerThread called producer
		ProducerThread producer;
		
		//Declare a reference to an ArrayQueue of Customers called queue
		ArrayQueue<Customer> queue;
		
		//Validate the input passed into the main method. If there are not 5 numeric
		//values display a message and end the program. 
		
		//Convert the values from string data to integers by using Integer.parseInt
		for (int i = 0; i < args.length; i++)
			input[i] = Integer.parseInt(args[i]);
		
		//Store the value of input[0] in tellers
		tellers = input[0];
		
		/**
		 * Store input[1] in the queue size (step 4) and input[2] as the mean customer arrival time (step 5)
           (multiply this value by 1000 to convert it to milliseconds
		 */
		queueSize = input[1];
		avgArrivalTime = input[2] * 1000;
		
		//Instantiate an ArrayQueue of Customer large enough to store queueSize customers. Store the address in
		//queue declared in step 10.
		queue = new ArrayQueue<Customer>(queueSize);
		
		//Instantiate an array of Thread and store it in teller (declared in step 8). The array size is the value of
		//tellers (see step 13 above). This will create an array of Threads to be used for the bank tellers.
		teller = new Thread[tellers];
		
		/**
		 * jnput[4] represents the length of time to run the simulation, but it is currently in minutes. Convert it to
         * milliseconds and store the value in simulationTime. Call the minutesToMilisecs in the SimulationTime
         * class to do the conversion.
		 * 
		 */
		simulationTime = input[4];
		SimulationTime time = new SimulationTime();
		simulationTime = time.minutesToMilisecs(simulationTime);
		
		//Create an instance of ProducerThread and store the address in the reference variable declared in step 9.
		//The constructor needs an ArrayQueue (step 15), the simulation time (step 17), and the mean arrival time
		producer = new ProducerThread(queue, simulationTime, avgArrivalTime);
		
		//Display a message stating the bank is now open for business – the start of the simulation
		System.out.println("Tellers are getting ready. The bank will open in 10 minutes...");
		
		//Create an instance of SimulationTime. This will start the clock and store the starting time in the
		//instance variable in the SimulationTime class. 
		time = new SimulationTime();
		
		//Call the start method of the producer thread. This will in turn call the run method that repeats for the
		//specified time
		producer.start();
		
		//Create the customer threads and add them to the ThreadGroup. Use the code below to accomplish this.
		for (int i = 0; i < tellers; i++) 
		{
			teller[i] = new Thread(tg, new BankTellerThread(i, queue, producer));
			teller[i].start();
		} 
		
		//Create a loop that runs until the producer thread is no longer alive. Use the isAlive method of the
		//producer thread. The loop causes the program to wait until the producer thread ends. 
		while(producer.isAlive())
		{
			producer.run();
			//System.out.println("ffff");
			
		}
		
		//After the loop ends, display a message indicating the producer thread has finished.
		System.out.println("The producer thread has finished...");
		
		while(tg.activeCount() > 0)
		{
			//waiting for tellers to complete the transaction
		}
		//display a message indicating the teller have finished
		
		System.out.println("\nThe tellers have completed all transactions...");
		
		//Display an end of program message.
		System.out.println("E#nd of program...");
	}

}
