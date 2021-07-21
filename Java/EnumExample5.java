package com.ust;

enum Directions3 {
	EAST("E"),WEST("W"),NORTH("N"),SOUTH("S");

private final String shortCode;

Directions3 (String code) {
	this.shortCode=code;
}
public String getDirectionCode() {
	return this.shortCode;
}
}
public class EnumExample5 {

	public static void main(String[] args) {
		Directions3 dir=Directions3.SOUTH;
		System.out.println(dir.getDirectionCode());
		Directions3 dir2=Directions3.EAST;
		System.out.println(dir2.getDirectionCode());
		

	}

}
