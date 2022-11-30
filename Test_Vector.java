import java.util.Enumeration;
import java.util.Vector;


public class Test_Vector {

	public static void main(String[] args) {

		/*Vector implements List Interface. Like ArrayList it also maintains insertion 
		 * order but it is rarely used in non-thread environment as it is synchronized and 
		 * due to which it gives poor performance in searching, adding, delete and update of its elements.*/
		
		
		//Vector vec = new Vector();
		
		
		//Vector object= new Vector(int initialCapacity)
		//Vector vec = new Vector(3);
		
		//Vector object= new vector(int initialcapacity, capacityIncrement)
		//Vector vec= new Vector(4, 6)
		
		
		 /* Vector of initial capacity(size) of 2 */
	      Vector<String> vec = new Vector<String>(2);

	      /* Adding elements to a vector*/
	      vec.addElement("Apple");
	      vec.addElement("Orange");
	      vec.addElement("Mango");
	      vec.addElement("Fig");

	      /* check size and capacityIncrement*/
	      System.out.println("Size is: "+vec.size());
	      System.out.println("Default capacity increment is: "+vec.capacity());

	      vec.addElement("fruit1");
	      vec.addElement("fruit2");
	      vec.addElement("fruit3");

	      /*size and capacityIncrement after two insertions*/
	      System.out.println("Size after addition: "+vec.size());
	      System.out.println("Capacity after increment is: "+vec.capacity());

	      /*Display Vector elements*/
	      Enumeration<String> en = vec.elements();
	      System.out.println("\nElements are:");
	      while(en.hasMoreElements())
	         System.out.print(en.nextElement() + " ");
	}

}
