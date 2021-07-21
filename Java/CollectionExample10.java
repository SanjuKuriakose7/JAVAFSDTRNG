package com.ust;

import java.util.Iterator;
import java.util.TreeSet;

public class CollectionExample10 {

	public static void main(String[] args) {
		TreeSet<String>ts=new TreeSet<String>();
		ts.add("Geeks");
		ts.add("For");
		ts.add("Is");
		ts.add("Very helpful");
		Iterator<String>itr=ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
