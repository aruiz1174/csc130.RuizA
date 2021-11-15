package lab5b;
/**
 * Title: Customer class
 * @author Anibal Ruiz
 * Description: The wait time is (the transaction start time - arrival time)
The transaction time: is (transaction end time - transaction start time) / 1000
 */

public class Customer 
{
	private int number; // The customer’s id number starting with 0
	private long transactionStartTime; // the time the transaction starts
	private long arrivalTime; // the time the customer arrived at the bank
	private long transactionEndTime; // the time the transaction end and the customer exits the bank
	
	/** 
	 * @param n for id number
	 * @param arrival for the time when the customer arrives in
	 * milliseconds.
	 */
	public Customer(int n, long arrival)
	{
		number = n;
		arrivalTime = arrival;
	}
	
	/**
	 * accessor method
	 * @return number
	 */
	public int getNumber()
	{
		return number;
	}
	
	/**
	 * accessor method
	 * @return transacionStartTime
	 */
	public long getTransactionStartTime()
	{
		return transactionStartTime;
	}
	
	/**
	 * accssore method
	 * @return arrivaltime
	 */
	public long getArrivalTime()
	{
		return arrivalTime;
	}
	
	/**
	 * accessor method
	 * @return transactionEndTime
	 */
	public long getTransactionEndTime()
	{
		return transactionEndTime;
	}
	
	/**
	 * accesor mutator
	 * @param start as a variable for transactionStratIme
	 */
	public void setTransactionStartTime(long start)
	{
		transactionStartTime = start;
	}
	
	/**
	 * accessor mutator
	 * @param end as a variable for transactionEndTime
	 */
	public void setTransactionEndTime(long end)
	{
		transactionEndTime = end;
	}
	
	/**
	 * accesor mutator
	 * @param arrival as a varable for arrivalTime
	 */
	public void setArrivalTime(long arrival)
	{
		arrivalTime = arrival;
	}
	
	/**
	 * toString method: return the customer and their entered time at the bank.
	 * 
	 */
	public String toString()
	{
		String str = "";
		
		str += "Customer: " + number + " entered the bank at minute " + SimulationTime.timeSinceStart(transactionEndTime - transactionStartTime);
		//The information in the brackets should only display after the transaction ends. The transaction time is the
		//difference between the transact
		if(transactionEndTime != 0L)
		{
			str += " [Transaction time: " + ((SimulationTime.timeSinceStart(transactionEndTime - transactionStartTime))) + " min, wait time: " + (transactionStartTime - arrivalTime)/transactionEndTime;
		}
		return str;
	}

}
