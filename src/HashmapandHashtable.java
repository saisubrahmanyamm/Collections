  import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashmapandHashtable {

	public static void main(String args[]) throws IOException
	{
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(165, "sai");
		map.put(265, "james");
		map.put(77, null);
		map.put(49, "kevin");
		System.out.println(map);
		for(Map.Entry<Integer, String> m :map.entrySet())
		{
			System.out.println(m.getKey()+" : "+m.getValue() );
		}
	
		System.out.println("\nNow hash table:\n");
		
		Hashtable<Integer,String> table=new Hashtable<Integer,String>();
		table.put(165, "sai");
		table.put(265, "james");
		table.put(77, "o");
		table.put(49, "kevin");
		System.out.println(table);
		for(Map.Entry<Integer, String> m :table.entrySet())
		{
			System.out.println(m.getKey()+" : "+m.getValue() );
		}
		
	}
	
}
