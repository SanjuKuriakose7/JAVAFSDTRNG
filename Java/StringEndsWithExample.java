package com.ust;
/*
 * StrindendsWith Example
 * This example show how to check if a particular string is ending with a specified word.
 */

public class StringEndsWithExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare the original  String
		String StrOrig="Hello Hi";
		/*
		 * check whether the string ends with World or not.
		 * Use endsWith method of the String class to check the same.
		 * endsWith() method returns true if a String is ending with a given word Otherwise it returns false
		 */
		if(StrOrig.endsWith("World")) {
			System.out.println("String ends with World");
		}
		else {
			System.out.println("String does not end with World");
		}
				

	}

}
