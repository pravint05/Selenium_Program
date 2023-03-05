package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Set_TreeSet {

	public static void main(String[] args) {
		TreeSet T1 = new TreeSet();

		// Add Information
		T1.add("sohail");
		T1.add("Sonakshi");
		T1.add("Nihar");
		T1.add("Ashpaq");
		T1.add("sohail");
		T1.add("sanjay");
		T1.add("Bhushan");
		T1.add("Jayesh");
		System.out.println(T1);

		// size
		System.out.println(T1.size());

		// empty or not
		System.out.println(T1.isEmpty());

		// verify information present or not
		System.out.println(T1.contains("Akshay"));

		// to remove information
		T1.remove("sohail");
		System.out.println(T1);

		// to print 1st information
		System.out.println(T1.first());

		// to print last information
		System.out.println(T1.last());

		// To remove 1st information from asecending order
		T1.pollFirst();
		System.out.println(T1);

		// To remove last information from asecending order
		T1.pollLast();
		System.out.println(T1);

		System.out.println("---------------Print Treeset by using Iterator Cursor---------------");

		Iterator Itr = T1.iterator();

		while (Itr.hasNext()) {
			System.out.println(Itr.next());
		}

		System.out.println("-----------------Print Treeset by using for each loop----------------");
		for (Object F1 : T1) {
			System.out.println(F1);
		}
	}

}
