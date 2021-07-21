package com.ust;

 class Overload{
	final void foo(int i)  //overloading is allowed 
	 {
		System.out.println(i);
	
	}
}
class Child extends Overload {
	 void foo(int i, String s) {
		System.out.println(i+" "+s);
	}
	//void foo(int i) {}
}
public class Base2 {
	public static void main(String[] args) {
		Child obj1=new Child();
		obj1.foo(2);
		obj1.foo(10,"SK");
	}
}