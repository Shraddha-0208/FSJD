package org.simplilearn.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		List<Integer> list= new Vector<>();
		
		Integer array[]= {10,20,30,20,50};
		Collections.addAll(list, array);
		
		System.out.println(list);
		list.remove(3);
		System.out.println("AFter remove: "+list);
		System.out.println("List SIze: "+list.size());
		System.out.println("Check it containes 50 or not "+list.contains(50));
		
		System.out.println("Iterate using for each loop");
		for(Integer num:list)
			System.out.println(num);
		//to print data we have Iterator Interface in Collection
		System.out.println("Use Iterator");
		Iterator<Integer> it= list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}