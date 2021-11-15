package Lists;

public class OrderedArrayList<T extends Comparable<T>> extends ArrayList<T>
{
	/**
     * add method - adds an item to this list
     * @param insertItem is a reference to the item to be added
     * @return <i>true</i> if item was added, <i>false</i> otherwise
     */
	public boolean add(T insertItem) 
	{
		if(insertItem == null)
			return false;
		if(numItems == data.length)
			expandCapacity();
		int location = 0;
		boolean done = false;
		
		//find location for insert
		for(int i = 0; i < numItems && !done; i++)
		{
			if(data[i].compareTo(insertItem) > 0)
			{
				location = i;
				done = true;
			}
		}
		//insert item
		data[location] = insertItem;
		numItems++;
		return true;
	}

	
}
