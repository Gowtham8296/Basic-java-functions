import java.util.HashSet;


public class Test_HastSet {

	public static void main(String[] args) {

		
		//HashSet doesn’t maintain any order, the elements would be returned in any random order.
		//HashSet doesn’t allow duplicates. If you try to add a duplicate element in HashSet, the old value would be overwritten.
		//HashSet allows null values however if you insert more than one nulls it would still return only one null value.
		//HashSet is non-synchronized.
		//However it can be synchronized explicitly like this: Set s = Collections.synchronizedSet(new HashSet(...));
		
		 // HashSet declaration
	      HashSet<String> hset = 
	               new HashSet<String>();

	      // Adding elements to the HashSet
	      hset.add("Apple");
	      hset.add("Mango");
	      hset.add("Grapes");
	      hset.add("Orange");
	      hset.add("Fig");
	      //Addition of duplicate elements
	      hset.add("Apple");
	      hset.add("Mango");
	      //Addition of null values
	      hset.add(null);
	      hset.add(null);

	      //Displaying HashSet elements
	      System.out.println(hset);
		
		
	}

}
