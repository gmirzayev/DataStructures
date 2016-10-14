public class ShoppingList
{
	public static void main(String [] args)
	{
		try
		{
			AList <String>x = new AList<String>(5);
			x.add("Bread");
			x.add("Milk");
			x.add("Butter");
			System.out.println("The list is: " + x);
			x.delete();
			System.out.println("The list is: " + x);
			x.delete();
			System.out.println("The list is: " + x);
		}
		catch(ListException e)
		{
			System.out.println(e);
		}
	}
}
