package com.ust;
//abstract example
abstract class Pay{
	abstract int getInterestRate();
}
class HDFC extends Pay {
	int getInterestRate() {
		return 10;
		
	}
}
class ICIC extends Pay {
	int getInterestRate() {
		return 8;
	}
}

public class TestBank {

	public static void main(String[] args) {
		Pay b=new HDFC();
		System.out.println(b.getInterestRate());
		 b=new ICIC();
		System.out.println(b.getInterestRate());
		
	}

}
