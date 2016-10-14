public class HouseList
{
	public static void main(String [] args)
	{
		try
		{
			AList<House> realEstate = new AList<House>(5);
			realEstate.add(new House("31 Main Street", 12));
			realEstate.add(new House("7 Randolph Avenue", 19));
			System.out.println("Donald Trump owns " + realEstate);
			realEstate.add(new House("20 Baldwin Road", 10), 2);
			System.out.println(realEstate);
			realEstate.delete();
			System.out.println(realEstate);
		}
		catch(ListException e)
		{
			System.out.println(e);
		}
	}
}
