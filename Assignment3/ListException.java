public class ListException extends Exception
{
	private String eMessage;

	public ListException(String m)
	{
		eMessage = m;
	}

	public String toString()
	{
		return eMessage;
	}
}