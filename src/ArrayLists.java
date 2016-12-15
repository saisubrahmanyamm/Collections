import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists {

	public static void main(String args[])
	{
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("sai");
		arrayList.add("james");
		arrayList.add("michel");
		arrayList.add("kevin");
		System.out.println("Arraylist after adding: "+arrayList);
		arrayList.remove(2);
		System.out.println("Arraylist after removing michel: "+arrayList);
		arrayList.set(2, "michelll");
		System.out.println("arraylist after set method: "+arrayList);
		arrayList.add("kevin");
		System.out.println("Upon again adding Kevin the list contains");
		Iterator<String> itr = arrayList.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
