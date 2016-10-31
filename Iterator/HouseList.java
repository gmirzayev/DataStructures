public class HouseList
{
	public static void main(String [] args)
	{
		try
		{
			House main = new House("31 Main Street", 12);
			AList<House> realEstate = new AList<House>();
			realEstate.add(main);
			realEstate.add(new House("7 Randolph Avenue", 19));
			realEstate.add(new House("20 Baldwin Road", 10), 2);
		}
		catch(ListException e)
		{
			System.out.println(e);
		}
	}
}
