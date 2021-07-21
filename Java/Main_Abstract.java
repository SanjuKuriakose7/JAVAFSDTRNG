package com.ust;
abstract class Janvar {
	abstract void makeSound();
	
}
class Puppy extends Janvar {
	//implementation of abstract method
	public void makeSound() {
		System.out.println("Bark bark");
	}
}
class Cat extends Janvar {
	//implementation of abstract method
	public void makeSound() {
		System.out.println("Meows");
	}
}

public class Main_Abstract {

	public static void main(String[] args) {
		Puppy d1=new Puppy();
		d1.makeSound();
		
		Cat c1=new Cat();
		c1.makeSound();
	}

}
