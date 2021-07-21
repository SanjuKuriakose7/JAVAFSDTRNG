package com.ust;

import java.util.Enumeration;
import java.util.Hashtable;

public class EnumExample1 {
	public static void  main(String[]args) {
		Enumeration names;
		String key;
		Hashtable<String,String> hash=new Hashtable<String,String>();
		hash.put("key1","Kuriakose");
		hash.put("key2","Mini");
		hash.put("key3","Chinju");
		hash.put("key4","Rinchu");
		hash.put("key5","Sanju");
		names=hash.keys();
		
		while(names.hasMoreElements()) {
			key=(String)names.nextElement();
			System.out.println("key: "+key+" & Value: "+hash.get(key));
		}
		
	}

}
