package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class List_arraylist {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		// To add information
		al.add("Pravin");
		al.add(100);
		al.add('c');
		al.add(82.65f);
		al.add(null);
		al.add("anuj");
		al.add(null);
		al.add(100);
		al.add("Ab$.3+@");
		al.add('r');
		al.add(67);

		System.out.println(al);

		// To verify Arraylist is empty or not
		System.out.println(al.isEmpty()); // data available=>false, empty=>true

		// Size of arraylist
		System.out.println(al.size());

		// To verify information is present or not
		System.out.println(al.contains(300)); // false
		System.out.println(al.contains("Pravin")); // true

		// Add information in between Arraylist --> Right shift operations
		al.add(5, "Dhoom");
		System.out.println(al);

		// To remove information-->Left shift operation
		al.remove(5);
		System.out.println(al);

		// update information
		al.set(2, 'P');
		System.out.println(al);

		// to find index of data
		System.out.println(al.indexOf("anuj"));

		// to get data by providing index
		System.out.println(al.get(10));

		System.out.println(
				"-----------------Print arraylist by using iterator curser -----------------------------------------");

		// Print arraylist by using iterator curser
		Iterator itr = al.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println(
				"-----------------Print arraylist by using ListIterator curser -----------------------------------------");

		ListIterator Itr = al.listIterator();

		while (Itr.hasNext()) {
			System.out.println(Itr.next());
		}

		System.out.println(
				"-----------------Print arraylist by using for each loop -----------------------------------------");
		for (Object A1 : al) {
			System.out.println(A1);

		}

	}
}
