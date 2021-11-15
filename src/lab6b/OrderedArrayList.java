package lab6b;
/**
 * Title: OrderedArraylist
 * @author Anibal Ruiz
 * Description: an extends of the ArrayList, the OrderedArrayL
 * @param <T>
 */
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
		for(int i = 0; i < numItems && done; i++)
		{
			//System.out.println(i);
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
	
	/**
     * Removes the first occurrence of the specified item from this list, if it is present
     * @param removeItem is a reference to an item whose key-field has been initialized
     * @return the item, if it is in this list, otherwise null is returned
     */
	public T remove(T removeItem)
	{
		int index = indexOf(removeItem);
		return(remove(index));
		
	}
	
	/**
     * Removes the item at the specified location from this list, if it is present
     * @param index is the index of the item in this list
     * @return the item, if it is in this list, otherwise null is returned
     */
	public T remove(int index) {
		if(index < 0 )
			return null;
		// store data to return
		T tempData = data[index];
		//shift data
		data[index] = null;
		for(int i = index; i < data.length-1; i++)
			data[i] = data[i+1];
		
		--numItems;
 		return tempData;
	}
	
	 /**
     * Returns the index of the first occurrence of the specified item (key) in this list
     * @param searchItem is a reference to an item whose key-field has been initialized
     * @return the location of the first occurrence of the specified item in this list; 
     * if searchItem is not found, -1 is returned
     */
	public int indexOf(T searchItem) 
	{
		int loc = -1;
		if (searchItem != null) 
		{
			int left = 0, right = numItems, middle = 0;
			System.out.println("Number of comparisons should be " + Math.log(numItems)/Math.log(2));
			int comparisons = 0;
			while (left < right) 
			{
				middle = (left + right) / 2;
				System.out.println(left + "\t" + middle + "\t" + right);
				comparisons++;
				int compared = searchItem.compareTo(data[middle]);
				if (compared == 0) 
				{
					loc = middle;
					right = middle;
				} else if (compared < 0)
					right = middle;
				else
					left = middle + 1;
			}
			System.out.println("List size: " + numItems);
			System.out.println("No of comparisons: " + comparisons);
		}
		
		return loc;
	}

	
}
