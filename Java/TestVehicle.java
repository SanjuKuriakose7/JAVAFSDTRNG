package com.ust;
//Abstract example
abstract class Vehicle {
	int x=5;
	Vehicle(){
		System.out.println("Vehicle class Constructor");
	}
	abstract void Run();
	void changeGear() {
		System.out.println("Automatic Variant");
	}
}
class BMW extends Vehicle {
	void Run() {
		System.out.println("Running fine");
	}


}

public class TestVehicle {

	public static void main(String[] args) {
		Vehicle v=new BMW();
		v.Run();
		v.changeGear();
		System.out.println(v.x);
		
	}

}

