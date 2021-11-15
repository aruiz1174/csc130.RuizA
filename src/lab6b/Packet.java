package lab6b;
/**
 <p>Title: Packet Class</p>
 *
 * <p>Description: A Packet object will store an position, and message.
 * The equals method defined in the Object class is overridden here.</p>
 *
 * @author Anibal Ruiz
 */

public class Packet implements Comparable<Packet> 
{
	private int position;
	private String msg;
	
	/**
     * parameterized constructor -- initializes position, and message to the
     * user-specified values
     * @param p to be stored in position
     * @param m to be stored in message
     */
	public Packet(int p, String m)
	{
		position = p;
		msg = m;
	}
	
	/**
	 * getPosition - get the  position
	 * @return the position
	 */
	public int getPosition()
	{
		return position;
	}
	
	/**
	 * getMsg - get the message
	 * @return the message
	 */
	public String getMsg()
	{
		return msg;
	}
	
	/**
	 * setPosition - store the user-value for position
	 * @param p for position
	 */
	public void setPosition(int p)
	{
		position = p;
	}
	
	/**
	 * setMsg - store the user-value for msg
	 * @param m for msg
	 */
	public void setMsg(String m)
	{
		msg = m;
	}

	/**
	 * method should order the packets by the position number.
	 */
	public int compareTo(Packet o) 
	{
		int result = -1; //variable to return
		if(o instanceof Packet) //test if the object is a subtype of a given type.
		{
			if(this.getPosition() > o.getPosition()) //if this is greater, return 1.
				result = 1;
			else if(this.getPosition() < o.getPosition()) //if is less, return 1
				result = -1;
			else
				result = 0; //if they are equeal, return 0
		}
		return result;
		
	}
	
	
}
