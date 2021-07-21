package com.ust;

class Base {
	final void dispaly() {
		System.out.println("Base method called");
	}
}
class Derived extends Base {
	void display() //cannot override 
	{
		System.out.println("Base method called");
	}
	
}
public class FinalMethod {

	public static void main(String[] args) {
		Derived d=new Derived();
		d.dispaly();

	}

}
