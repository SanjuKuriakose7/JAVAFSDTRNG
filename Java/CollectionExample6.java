package com.ust;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionExample6 {
	public static void main(String[]args) {
		List list=Arrays.asList("One Two Three Four Five Six One Three".split(" "));
		System.out.println("List:"+list);
		
		List sublist=Arrays.asList("Three Four".split(" "));
		System.out.println("SubList:"+sublist);
		System.out.println("indexOfSubList:"+Collections.indexOfSubList(list,sublist));
		System.out.println("lastIndexOfSubList:"+Collections.lastIndexOfSubList(list, sublist));
				
	}

}
