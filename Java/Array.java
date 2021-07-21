package com.ust;
class Example {
	int a=9;
	int b=18;
	void m1() {
		a=10;
		b=20;
	}
}
class Test {
	static void m1(Example[]e) {
		e[1].m1();
	}
}
public class Array {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example[] ex= {new Example(),new Example(),new Example()};
		Test.m1(ex);
		for(int i=0;i<ex.length;i++) {
			System.out.print(ex[i].a+"\t");
			System.out.println(ex[i].b+"\n");
		}

	}

}
