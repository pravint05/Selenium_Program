package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Set_linkedhashset {
	public static void main(String[] args) {

		LinkedHashSet LHS = new LinkedHashSet();

		LHS.add(200);
		LHS.add(null);
		LHS.add("Shree");
		LHS.add(200);
		LHS.add('H');
		LHS.add(null);
		LHS.add("*7");
		System.out.println(LHS);

		// empty or not
		System.out.println(LHS.isEmpty());

		// size/capacity
		System.out.println(LHS.size());

		// verify data/information
		System.out.println(LHS.contains(null));

		// to remove information
		LHS.remove("*7");
		System.out.println(LHS);

		System.out.println("---------------Print LinkedHashSet by using Iterator Cursor-----------");
		Iterator Itr = LHS.iterator();
		while (Itr.hasNext()) {
			System.out.println(Itr.next());
		}

		System.out.println("-----------Print LinkedHashset by using for each loop------------");

		for (Object L1 : LHS) {
			System.out.println(L1);
		}
	}

}
