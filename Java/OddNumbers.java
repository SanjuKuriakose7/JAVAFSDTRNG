package com.ust;

public class OddNumbers {
	public static int Odd(int[] array) {
		//declare a variable max
		int max=0;
		 
		//compare with remaining to max
		max=array[0];
		
		//compare with remaining elements
		//loop
		for(int i=0;i<array.length;i++) {
			//compare
			if (max<array[i]) 
				max=array[i];
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Odd(new int[] {5,8,2,1}));
		

	}

}
