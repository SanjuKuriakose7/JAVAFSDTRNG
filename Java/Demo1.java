package com.ust;


abstract class Sum {
	/*
	 * These two are abstract methods,the child class
	 * must implement these methods
	 */
	public abstract int SumOfTwo(int n1,int n2);
	public abstract int SumOfThree(int n1,int n2,int n3);
	
	// Regular method
	public void disp() {
		System.out.println("Method of class Sum");
}
}
//Regular class extends abstract class
class Demo1 extends Sum {
	/*
	 * if don't provide the implementation of these two methods, the program will throw compilation error. 
	 */
	public int SumOfTwo(int num1,int num2) {
		return num1+num2;
	}
	public int SumOfThree(int num1,int num2, int num3) {
		return num1+num2+num3;
	}
	
	public static void main(String[] args) {
		Sum s=new Demo1();
		System.out.println(s.SumOfTwo(3,7));
		System.out.println(s.SumOfThree(4,3,19));
		s.disp();
		
	}

}
