import java.util.Enumeration;
import java.util.Hashtable;


public class Test_HashTable {

	public static void main(String[] args) {

		/*This class implements a hash table, which maps keys to values. Any non-null object can be 
		 * used as a key or as a value. Hashtable is similar to HashMap except it is synchronized.*/
		
		Enumeration names;
		  String key;
		 
		   // Creating a Hashtable
		   Hashtable<String, String> hashtable = 
		              new Hashtable<String, String>();
		 
		   // Adding Key and Value pairs to Hashtable
		   hashtable.put("Key1","Chaitanya");
		   hashtable.put("Key2","Ajeet");
		   hashtable.put("Key3","Peter");
		   hashtable.put("Key4","Ricky");
		   hashtable.put("Key5","Mona");
		 
		   names = hashtable.keys();
		   while(names.hasMoreElements()) {
		      key = (String) names.nextElement();
		      System.out.println("Key: " +key+ " & Value: " +hashtable.get(key));
		   }
		
	}

}
