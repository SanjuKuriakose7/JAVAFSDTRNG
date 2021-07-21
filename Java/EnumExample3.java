package com.ust;
 enum Directions {
	EAST,WEST,NORTH,SOUTH;
}
public class EnumExample3 {
	public static void main(String args[]) {
		Directions dir=Directions.NORTH;
		if(dir==Directions.EAST) {
			System.out.println("Direction.East");
		}
		else if(dir==Directions.WEST) {
			System.out.println("Directions.West");
		}
		else if(dir==Directions.NORTH) {
			System.out.println("Directions.North");
		}
		else {
			System.out.println("Directions.South");
		}
	}

}
