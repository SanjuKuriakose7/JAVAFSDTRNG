package com.ust;

/*
 * java program to illustrate the concept of Hierarchical inheritance 
 */
class A1 {
	public void print_A() {
		System.out.println("Class A");
	}
}
class B1 extends A1 {
	public void print_B() {
		System.out.println("Class B");
	}
}
class C1 extends A1 {
	public void print_C() {
		System.out.println("Class C");
	}
}
class D1 extends A1 {
	public void print_D() {
	System.out.println("Class D");
}
}
//Driver Class
public class Test2 {

	public static void main(String[] args) {
		B1 obj_B=new B1();
		obj_B.print_A();
		obj_B.print_B();
		
		C1 obj_C=new C1();
		obj_C.print_A();
		obj_C.print_C();
		
		D1 obj_D=new D1();
		obj_D.print_A();
		obj_D.print_D();
		

	}

}
