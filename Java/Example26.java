package com.ust;
//Interface

interface Animal1 {
	public void animalSound();
	public void sleep();
}
class Pig implements Animal1 {
	public void animalSound() {
		System.out.println("The Pig says:Wee Wee");
	}
	public void sleep() {
		System.out.println("Zzz");
	}
}

public class Example26 {

	public static void main(String[] args) {
		Pig myPig=new Pig();
		myPig.animalSound();
		myPig.sleep();

	}

}
