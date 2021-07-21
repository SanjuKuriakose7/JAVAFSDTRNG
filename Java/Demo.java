package com.ust;

public class Demo {
	String web;
	Demo(String w) {
		web = w;
	}
	Demo(Demo cc) {
		web=cc.web;
	}
	void disp() {
		System.out.println("Constructor:"+web);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo obj1=new Demo("Example of Copy Constructor in Java");
		Demo obj2=new Demo(obj1);
		obj1.disp();
		obj2.disp();
		

	}

}
