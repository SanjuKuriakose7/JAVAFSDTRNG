package com.ust;

public class LargestNumber {

		//Java method to find largest number in array
		public static int Largest(int[] array) {
			//declare a variable max
			int max=0;
			 
			//compare with remaining to max
			max=array[0];
			
			//compare with remaining elements
			//loop
			for(int i=1;i<array.length;i++) {
				//compare
				if (max<array[i]) 
					max=array[i];
			}
			return max;
		}
		public static void main(String args[]) {
			
			System.out.println(Largest(new int[] {5,8,2,}));
		}
}



	


