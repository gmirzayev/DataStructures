public class Node<T>
{
	private T data;
	private Node<T> next;

	public Node(T m)
	{
		data = m;
	}

	public void setData(T m)
	{
		data = m;
	}

	public T getData()
	{
		return data;
	}

	public void setNext(Node<T> m)
	{
		next = m;
	}

	public Node<T> getNext()
	{
		return next;
	}
}