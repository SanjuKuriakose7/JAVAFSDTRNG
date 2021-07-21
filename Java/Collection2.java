package com.ust;

import java.util.ArrayList;
import java.util.Collections;

public class Collection2 {

	public static void main(String[] args) {
		ArrayList arr=new ArrayList();
		arr.add(2);
		arr.add(4.2f);
		arr.add("String hi");
		System.out.println(arr);

		arr.remove(1);
		
		arr.add(2,"Sanju");
		System.out.println(arr);
		
		ArrayList<Integer>x=new ArrayList<Integer>();
		x.add(4);
		x.add(10);
		x.add(1);
		x.add(0);
		Collections.sort(x);
		System.out.println(x);
		boolean a=x.contains(1);
		if(a) {
			System.out.println("The list contains 1");
		}
		else {
			System.out.println("Does not coontains 1");
		}
		x.set(1,3);
		System.out.println(x);

	}

}
