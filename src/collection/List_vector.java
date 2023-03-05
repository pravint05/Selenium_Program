package collection;

import java.util.Enumeration;
import java.util.Vector;

public class List_vector {

	public static void main(String[] args) {

		Vector V1 = new Vector();

		// To add information
		V1.add("Rohit");
		V1.add(53);
		V1.add('A');
		V1.add(null);
		V1.add(53);
		V1.add(null);
		V1.add("F%:1");
		V1.add("Kundan");
		System.out.println(V1);

		 //To verify Vector is empty or not
		System.out.println(V1.isEmpty());
		
		//Size of Vector
		System.out.println(V1.size());
		
		//To verify information is present or not
		System.out.println(V1.contains(400));		//false
		
		//Add information in between Vector-->Right shift operations
		V1.add(1, "Shankar");
		System.out.println(V1);
		
	    //To remove information-->Left shift operation
		V1.remove(5);
		System.out.println(V1);
		
	    //to find index of data
		System.out.println(V1.indexOf("Kundan"));
		
		  //to get data by providing index
		System.out.println(V1.get(6));
		
		//update information   
		V1.set(4, 786);
		System.out.println(V1);

		System.out.println("----------Print arraylist by using enumeration curser----------------------------");

		Enumeration Etr = V1.elements();

		while (Etr.hasMoreElements()) {
			System.out.println(Etr.nextElement());
		}
	}

}
