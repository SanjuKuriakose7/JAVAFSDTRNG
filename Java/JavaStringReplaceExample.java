package com.ust;

public class JavaStringReplaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Replace Region";
		/*
		 * replaces all occourances of given character with new one and returns new String object
		 */
		System.out.println(str.replace('R','A'));
		/*
		 * replaces first occourances of given character with new one and returns new String object
		 */
		System.out.println(str.replaceFirst("Re","Ra"));
		/*
		 * replaces all occourances of given character with new one and returns new String object
		 */
		System.out.println(str.replaceAll("Re","Ra"));

	}

}
