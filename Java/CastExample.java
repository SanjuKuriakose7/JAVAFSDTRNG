package com.ust;
/*
 * Upcasting & Downcasting
 */

public class CastExample {

	public static void main(String[] args) {
		double num=15.625;
		System.out.println(num);
		int n=(int)num;//Down casting
		System.out.println(n);
		int x=17;
		double y=x;
		System.out.println(x);
		System.out.println(y);
		float f=(float)3.67;
		byte d=(byte)f;
		System.out.println(d);
		long l=(long)3.5678;
		short s=(short)l;
		System.out.println(s);
		long t=(long)3.5678;
		double b=(double)t;
		System.out.println(b);
		int c=15;
		String dbValue=String.valueOf(c);
		System.out.println(dbValue);
		dbValue=String.valueOf(l);
		System.out.println(dbValue);
		dbValue=String.valueOf(f);
		System.out.println(dbValue);

	}

}
