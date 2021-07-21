package com.ust;

 enum Operation {
	PLUS,MINUS,TIMES,DIVIDE;
	double calculate(double x,double y) {
		switch (this) {
		case PLUS:
			return x+y;
		case MINUS:
			return x-y;
		case TIMES:
			return x*y;
		case DIVIDE:
			return x/y;
			default:
				throw new AssertionError("Unknown operations " + this);
		}
	}
}

public class EnumExample7 {

	public static void main(String[] args) {
		Operation op=Operation.MINUS;
		System.out.println(op.calculate(10, 5));
		
	}

}
