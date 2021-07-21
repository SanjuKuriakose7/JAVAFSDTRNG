package com.ust;
//Final example
 class Vehicles {
	int x=5;
	Vehicles(){
		System.out.println("Vehicle class Constructor");
	}
	
	/*
	 * final void changeGear() {
	 
		System.out.println("Automatic Variant");
	}*/
	void changeGear() {
		System.out.println("automatic variant");
	}
}
class BMW1 extends Vehicles {
	/*void changeGear1() {
	
		System.out.println("Running fine");
	}*/
	void changeGear() {
		System.out.println("automatic variant as subclass");
	}


}

public class TestFinal {
	
	public static void main(String[] args) {
		Vehicles v=new BMW1();
		Vehicles v1=new Vehicles();
		v1.changeGear();
		//BMW1 b1=(BMW1) new Vehicles();
		//b1.changeGear();
		
		v.changeGear();
		//BMW1 b=new BMW1();
		//b.changeGear1();
		System.out.println(v.x);
		
	}

}

