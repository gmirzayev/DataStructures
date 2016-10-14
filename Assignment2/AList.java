public class AList<T> implements List<T>
{
	private T[] List;
	private int count;

	public AList(int s)
	{
		List = (T[]) new Object[s];
		count = 0;
	}
	
	public void get(int pos)
	{
		System.out.println(List[pos-1]);
	}
	
	public void set(T t, int pos)
	{
		List[pos-1] = t;
	}

	public void add(T t) throws ListException
	{
		if(count < List.length)
		{
			List[count] = t;
			count++;
		}
		else
		{
			throw new ListException("Cannot add. List is full");
		}
	}

	public T delete() throws ListException
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
	}

	public void add(T item, int position) throws ListException
	{
		if(count == 0)
		{
			throw new ListException("Cannot insert. The list is empty");
		}
		if(count == List.length)
		{
			throw new ListException("Cannot insert. The list is full.");
		}
		if(position < 1 || position > count)
		{
			throw new ListException("Cannot insert. Bad position.");
		}
		for(int k = count-1; k>=position-1; k--)
		{
			List[k+1] = List[k];
		}
		List[position-1] = item;
		count++;
	}

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
	}
}
