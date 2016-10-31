public class AList<T> implements List<T>
{
	private T[] List;
	private int count;

	public AList()
	{
		List = (T[]) new Object[20];
		count = 0;
	}

	public void add(T t) throws ListException
	{
		if(count < List.length && t != null)
		{
			List[count] = t;
			count++;
		}
		if(count >= List.length)
		{
			throw new ListException("Error. Unable to add. List is full or not enough memory.");
		}
		if(t == null)
		{
			throw new ListException("Error unable to add. Cannot add null entries.");
		}
	}

	public void add(T item, int position) throws ListException
	{
		if(count == 0)
		{
			throw new ListException("Error. Unable to insert. List is empty");
		}
		if(count == List.length)
		{
			throw new ListException("Error. Unable to insert. List is full.");
		}
		if(position < 1 || position > count)
		{
			throw new ListException("Error. Unable to insert. Bad position.");
		}
		if(item == null)
		{
			throw new ListException("Error. Unable to insert. Attempt to insert null object.");
		}
		for(int k = count-1; k>=position-1; k--)
		{
			List[k+1] = List[k];
		}
		List[position-1] = item;
		count++;
	}

	public T get(int position) throws ListException
	{
		if(position < 1 || position > count)
		{
			throw new ListException("Error. Unable to get. Bad position.");
		}
		if(count == 0)
		{
			throw new ListException("Error. Unable to get. List is empty.");
		}
		return List[position-1];
	}

	public T set(T t, int pos) throws ListException
	{
		if(t == null)
		{
			throw new ListException("Error. Unable to replace. Replacement cannot be null.");
		}
		if(pos < 1 || pos > count)
		{
			throw new ListException("Error. Unable to replace. Bad position.");
		}
		if(count == 0)
		{
			throw new ListException("Error. Unable to replace. List is empty.");
		}
		T temp = List[pos-1];
		List[pos-1] = t;
		return temp;
	}

	public int find(T t, int start, int end) throws ListException
	{
		if(start < 1 || start > count)
		{
			throw new ListException("Error. Unable to find. Start position is bad.");
		}
		if(end < 1 || end > count)
		{
			throw new ListException("Error. Unable to find. End position is bad.");
		}
		if(start > end)
		{
			return -1;
		}
		for(int i = start-1; i < end-1; i++)
		{
			if(List[i].equals(t))
			{
				return i;
			}
		}
		return -1;

	}

	public int size()
	{
		return count;
	}

	public String toString()
	{
		if(count == 0)
		{
			return "list is empty";
		}
		else
		{
			String temp = "";
			for(int i = 0; i < count; i++)
			{
				temp += List[i] + "\n";
			}
			return temp;
		}
		//return List[0].toString();
	}

	/*public T delete() throws ListException
	{
		if(count > 0)
		{
			T t = List[count - 1];
			List[count - 1] = null;
			count--;
			return t;
		}
		else
		{
			throw new ListException("Cannot delete. List is empty");
		}
	}*/

	public T remove(int position) throws ListException
	{
		if(position > 0 && position < count)
		{
			T item = List[position-1];
			count--;
			for(int i = position-1; i<count; i++)
			{
				List[i] = List[i+1];
			}
			List[count] = null;
			return item;
		}
		else if(count == 0)
		{
			throw new ListException("Cannot remove. List is empty.");
		}
		else
		{
			throw new ListException("Position out of bounds. Please try again.");
		}
	}

	public void clear()
	{
		for(int i = 0; i<count; i++)
		{
			List[i] = null;
		}
	}

	public boolean isEmpty()
	{
		if(count == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public int contains(T item, int start, int end) throws ListException
	{
		int k = start-1;
		if(!(start >=1 && start<=count))
		{
			throw new ListException("Cannot locate item. Start point is bad.");
		}
		if(!(end >=1 && end<=count))
		{
			throw new ListException("Cannot locate item. End point is bad.");
		}
		while(k<=end-1)
		{
			if(List[k].equals(item)==true)
			{
				return k+1;
			}
			k++;
		}
		return -1;
	}

	public void contains(T item) throws ListException
	{
		int foundAt;
		foundAt = contains(item, 1, count);
		while(foundAt != -1)
		{
			System.out.println(item + "is found at position" + foundAt);
			foundAt = contains(item, foundAt+1, count);
		}
	}

}
