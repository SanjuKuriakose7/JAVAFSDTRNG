package com.ust;
//Example of final

public class Example25 {
	int a;
	final int b;
 Example25(){ 
	 a=7;
	 b=2;
	 
 }
 
 
	
	

	public static void main(String[] args) {
		
		final int x; //x is a local variable and is also  made final
		x=5;
		
		System.out.println(x);
		Example25 e=new Example25();
		System.out.println(e.a);
		System.out.println(e.b);
		e.a=3;
		System.out.println(e.a);
		
		

	}

}
