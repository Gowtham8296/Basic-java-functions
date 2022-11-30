package CollectionAPI.src;

import java.util.ArrayList;


public class Test_ArrayList {

	public static void main(String[] args) {

		
		/*Arraylist class implements List interface. It is widely used because of 
		 * the functionality and flexibility it offers. Most of the developers choose 
		 * Arraylist over Array as it’s a very good alternative of traditional java arrays.*/
		
		ArrayList<String> obj = new ArrayList<String>();

		  /*This is how elements should be added to the array list*/
		  obj.add("Ajeet");
		  obj.add("Harry");
		  obj.add("Chaitanya");
		  obj.add("Steve");
		  obj.add("Anuj");
		  obj.add("Anuj");
		  obj.add("Anuj");
		  obj.add("Anuj");
		  obj.add("Anuj");
		  obj.add(null);
		  obj.add(null);
		  
		  
		  System.out.println("Currently the array list has following elements:"+obj);
		  
		  
		  obj.add(0, "Rahul");
		  obj.add(1, "Justin");

		  /*Remove elements from array list like this*/
		  obj.remove("Chaitanya");
		  obj.remove("Harry");

		  System.out.println("Current array list is:"+obj);

		  /*Remove element from the given index*/
		  obj.remove(1);

		  System.out.println("Current array list is:"+obj);
		
	}

}
