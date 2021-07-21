package com.ust;

public class ExpExa5 {
	@SuppressWarnings("finally")
	public static int returnTest(int num) {
		try {
			if(num==0)throw new Exception("Occurred");
			else
				return 5;
		}
		catch(Exception e) {
			return 10;
		}
		finally {
			return 4;
		
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(returnTest(2));

	}

}
