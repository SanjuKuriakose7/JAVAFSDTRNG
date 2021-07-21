package com.ust;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionExample9 {

	public static void main(String[] args) {
		HashSet<String>hs=new HashSet<String>();
		
		hs.add("Geeks");
		hs.add("For");
		hs.add("Geeks");
		hs.add("Very helpful");
		
		Iterator<String>itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
