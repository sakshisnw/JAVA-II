import java.util.*;
class StudentHashTable
{
	public static void main(String [] args)
	{
		Hashtable<String,String>ht=new Hashtable<String,String>();
		ht.put("1234567809","sk");
		ht.put("9876543281","sid");
		ht.put("7634633481","pali");
		ht.put("2835485048","john");
		ht.put("2383483448","ray");
		System.out.println("Contact list is:"+ht);
	}
}