import java.util.ArrayList;
public class CitiesArrayList
{
	public static void main(String args[])
	{
		ArrayList<String> a1 = new ArrayList<>(5);
		a1.add("Nashik");
		a1.add("pune");
		a1.add("Jalgaon");
		a1.add("Mumbai");
		a1.add("Thane");
		System.out.println("List of size:"+a1.size());
		for(String name:a1)
		{
			System.out.println("Name:"+name);
		}
		a1.clear();
		System.out.print("After removing elelments are : ");
		for(String name:a1)
		{
			System.out.println("Name:"+name);	
		}
	}
}

