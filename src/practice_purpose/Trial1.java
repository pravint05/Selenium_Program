package practice_purpose;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Trial1 {
	public static void main(String[] args) {
		
		ArrayList AR1 = new ArrayList();
		AR1.add("ajay");
		AR1.add('v');
		AR1.add(78);
		AR1.add(45.09f);
		AR1.add("#5M");
		System.out.println(AR1);
		
		//Print arraylist by using iterator curser 
		System.out.println("---------------Print arraylist by using iterator curser-----------------------");
		Iterator Itr = AR1.iterator();
		while(Itr.hasNext())
		{
			System.out.println(Itr.next());
		}
		
		//Print arraylist by using iterator curser 
		System.out.println("---------------Print arraylist by using Listiterator curser-----------------------");
		ListIterator Ltr = AR1.listIterator();
		while(Ltr.hasNext())
		{
			System.out.println(Ltr.next());
		}
		System.out.println("---------------Print arraylist by using for each loop-----------------------");
		
		for(Object A:AR1)
		{
			System.out.println(A);
		}
	}

}
