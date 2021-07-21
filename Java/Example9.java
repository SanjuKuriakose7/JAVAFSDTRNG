package com.ust;
/*
 * about Strings
 */

public class Example9 {

	public static void main(String[] args) {
		String str="Hello";
		
		String str1="Hello";
		
		str="hi";
		System.out.println(str);
		
		System.out.println(str.concat( str1));
		
		
		System.out.println(str.charAt(1));
		
		
		//System.out.println(str.compareTo(str1));
		
		
		
		//System.out.println(str1.indexOf(1));
		
		
		System.out.println(	str.length());
		
		System.out.println(	str1.substring(3));
		
		System.out.println(str1.trim());
		System.out.println(String.valueOf(false));
		
		System.out.println(str.split(str1));
		System.out.println(str.isBlank());
		System.out.println(String.join(str1," Sanju "," Kuriakose"));
		
		

	}

}
