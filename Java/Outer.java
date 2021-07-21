package com.ust;

public class Outer {
	private void getValue() {
		//Note that local variables(sum)must be final till JDK7
		//hence this code will work only in jdk8
		int sum=20;
		//Local inner class inside method
		class Inner {
			public int divisor;
			public int remainder;
			public  Inner() 
			{
				divisor=4;
				remainder=sum%divisor;
			}
			public int getDivisor() {
				return divisor;
			}
			public int getRemainder() {
				return sum%divisor;
			}
			private int getQuotient() {
				System.out.println("Inside inner class");
				return sum/divisor;
			}
		}
		Inner inner=new Inner();
		System.out.println("Divisor="+inner.getDivisor());
		System.out.println("Remainder="+inner.getRemainder());
		System.out.println("Quotient="+inner.getQuotient());
	}

	public static void main(String[] args) {
		Outer outer=new Outer();
		outer.getValue();

	}

}
