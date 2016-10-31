public class LList<T>
{
	//same methods as AList in List interface
	private Node<T> head;
	private Node<T> tail;
	private int count;

	public LList()
	{
		head = tail = null;
		count = 0;
	}

	public void add(T m) throws ListException
	{
		try
		{
			Node<T> temp = new Node<T>(m);
			temp.setNext(null);
			if(head == null)
			{
				head = tail = temp;
			}
			else
			{
				tail.setNext(temp);
			}
			tail = temp;
			count++;
		}

		catch(OutOfMemoryError e)
		{
			throw new ListException("Can't add. No more memory.");
		}
}