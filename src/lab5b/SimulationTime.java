package lab5b;
import java.util.Random;
/**
 * <b>Title:</b> Simulation Time for Queue Simulations:<br>
 * <b>Filename:</b> SimulationTime.java<br>
 * <b>Date Written:</b> January 23, 2007<br>
 * <b>Due Date:</b> January 23, 2007<br>
 * <p>
 * <b>Description:</b><br>
 * A class with static methods for converting time between milliseconds and minutes or seconds.<br>
 * It also contains a method <i>timeTillNext</i> for calculating the time an event will occur based on a mean arrival time
 *@author Graham, F
 */

public class SimulationTime {
	/**
	 * Stores the time the simulation started
	 */
	private static final long startTime = System.currentTimeMillis();;
	/*	
	public SimulationTime() {
		startTime = System.currentTimeMillis();
	}*/
	/**
	 * Returns the start time in milliseconds
	 * @return the start time in milliseconds
	 */
	public static long getStartTime() {
		return startTime;
	}
	/**
	 * Returns the number of milliseconds since the simulation started
	 * @param currentTime the current system time in milliseconds
	 * @return the number of milliseconds since the simulation started
	 */
    public static int timeSinceStart(long currentTime){
        return (int)(millisecsToSeconds(currentTime) - millisecsToSeconds(startTime));
    }
    /**
     * Converts milliseconds to minutes
     * @param millisecs the current time in milliseconds
     * @return milliseconds converted to minutes
     */
	public static long millisecsToMinutes(long millisecs){
		return millisecs / 60000;
	}
    /**
     * Converts milliseconds to seconds
     * @param millisecs the current time in milliseconds
     * @return milliseconds converted to seconds
     */
	public static long millisecsToSeconds(long millisecs){
		return millisecs / 1000;
	}
    /**
     * Converts minutes to milliseconds
     * @param timeInMinutes minutes
     * @return timeInMinutes converted to milliseconds
     */
	public static long minutesToMilisecs(long timeInMinutes){
		return timeInMinutes * 60000;
	}
	/**
	 * Calculates the time the next event will occur
	 * @param meanArrivalTime the mean average time between events
	 * @return the time the next event will occur
	 */
	public static int timeTillNext(int meanArrivalTime){
		Random random = new Random();
		double randomDouble = random.nextDouble();
    	int timeTillNext = (int)Math.round (-meanArrivalTime * Math.log (1 - randomDouble));
    	return timeTillNext;
	}
}
