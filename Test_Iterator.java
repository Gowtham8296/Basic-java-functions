import java.util.ArrayList;
import java.util.Iterator;


public class Test_Iterator {

	public static void main(String[] args) {

		//Iterator is used for iterating (looping) various collection classes such as HashMap, ArrayList, LinkedList etc.
		
		
		ArrayList<String> names = new ArrayList<String>();
	    names.add("Chaitanya");
	    names.add("Steve");
	    names.add("Jack");
	 
	    Iterator<String> it = names.iterator();
	 
	    while(it.hasNext()) {
	      String obj = (String)it.next();
	      System.out.println(obj);
	    }
		
	}

}
