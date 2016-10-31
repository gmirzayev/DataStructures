public class House
{
	private int rooms;
	private String address;

	public House(String a, int r)
	{
		rooms = r;
		address = a;
	}

	public String toString()
	{
		return "A house with " + rooms + " rooms, located at " + address;
	}
}