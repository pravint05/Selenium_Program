package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Set_hashset {

	public static void main(String[] args) {

		HashSet HS = new HashSet();
		
		//to add information
		HS.add("Rohit");
		HS.add(null);
		HS.add(0);
		HS.add("*R");
		HS.add('G');
		HS.add(null);
		HS.add(0);
		System.out.println(HS);

		//empty or not
		System.out.println(HS.isEmpty());
		
		//size/capacity
		System.out.println(HS.size());
		
		//verify data/information
		System.out.println(HS.contains('P'));
		
		//to remove information
		HS.remove("*R");
		System.out.println(HS);

		System.out.println("----------Print Hashset by using Iterator cursor--------------------------------");

		Iterator Itr = HS.iterator();

		while (Itr.hasNext()) {
			System.out.println(Itr.next());
		}

		System.out.println("---------Print HashSet by using for each loop------------------------------------");
		for(Object F1: HS)
		{
			System.out.println(F1);
		}
	}

}
