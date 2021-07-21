package com.ust;

class GenericsClass1<T extends Number> {
	public void display() {
		System.out.println("This is a bounded type generics class");
	}
}
public class CollectionExample15 {

	public static void main(String[] args) {
		
		GenericsClass1<Number> obj=new GenericsClass1<>();
		obj.display();
		
		
	}

}
