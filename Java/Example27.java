package com.ust;

interface FirstInterface {
	public void myMethod();
}
interface SecondInterface {
	public void myOtherMethod();
}
  class DemoClass implements FirstInterface,SecondInterface {
	public void myMethod() {
		System.out.println("Some other text...");
	}

	@Override
	public void myOtherMethod() {
		// TODO Auto-generated method stub
		
	}
}

public class Example27 {

	public static void main(String[] args) {
		DemoClass myObj=new DemoClass();
		myObj.myMethod();
		myObj.myOtherMethod();

	}

}
