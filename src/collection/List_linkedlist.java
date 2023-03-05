package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class List_linkedlist {

	public static void main(String[] args) {
		LinkedList L1 = new LinkedList();

		// To add information
		L1.add("Virat");
		L1.add(59.07f);
		L1.add('j');
		L1.add(null);
		L1.add("Virat");
		L1.add("#");
		L1.add(null);
		System.out.println(L1);

		// To verify Linkedlist is empty or not
		System.out.println(L1.isEmpty());

		// Size of Linkedlist
		System.out.println(L1.size());

		// To verify information is present or not
		System.out.println(L1.contains("#"));

		// Add information in between Linkedlist
		L1.add(6, 304);
		System.out.println(L1);

		// To remove information
		L1.remove(4);
		System.out.println(L1);

		// update information
		L1.set(2, 'P');
		System.out.println(L1);

		// to find index of data
		System.out.println(L1.indexOf(null));

		// to get data by providing index
		System.out.println(L1.get(1));

		System.out.println("---------Print Linkedlist by using iterator curser---------------------------");

		Iterator Itr = L1.iterator();

		while (Itr.hasNext()) {
			System.out.println(Itr.next());
		}

		System.out.println("---------Print Linkedlist by using ListIterator curser---------------------------");

		ListIterator Ltr=L1.listIterator();
		
		while(Ltr.hasNext())
		{
			System.out.println(Ltr.next());
		}
		
		System.out.println("---------Print Linkedlist by using for each loop---------------------------");

		for(Object A1:L1)
		{
			System.out.println(A1);
		}
	}

}
