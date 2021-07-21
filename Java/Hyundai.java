package com.ust;
//Abstract Class
abstract class Cars {
	int x;
	//abstract void insuranceDetails();
	void display() {}
}







public class Hyundai extends Cars {
	void insuaranceDetails() {
		System.out.println("Please provide the Insurance formula here");
	}

	public static void main(String[] args) {
		//Cars c=new Cars();
		Hyundai h=new Hyundai();
		//Cars c=new Hyundai();
        //c.insuranceDetails();
        //Hyundai h1=new Cars();
		h.insuaranceDetails();
		

	}

}
