package com.ust;

public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]=new int[3];
			a[3]=8/0;
		
		try {
			 a[2]=78;
		}
		catch (ArithmeticException e)
		{
			System.out.println("Error occurs");
		}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("No Error");
		}

			
	}

}
