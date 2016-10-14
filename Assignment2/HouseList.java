public class HouseList
{
	public static void main(String [] args)
	{
		try
		{
			AList<House> realEstate = new AList<House>();
			realEstate.add(new House("31 Main Street", 12));
			realEstate.add(new House("7 Randolph Avenue", 19));
			realEstate.add(new House("20 Baldwin Road", 10), 2);
			System.out.println(realEstate);
			realEstate.get(2);
			//realEstate.add(null);
		}
		catch(ListException e)
		{
			System.out.println(e);
		}
	}
}
