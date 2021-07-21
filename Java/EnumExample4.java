package com.ust;

 enum Directions1 {
	EAST,WEST,NORTH,SOUTH;

}
 
public class EnumExample4 {
	Directions1 dir;
	public EnumExample4(Directions1 dir) {
		this.dir=dir;
	}
	public void getMyDirections() {
		switch(dir) {
		case EAST:
			System.out.println("In East Direction");
			break;
			
		case WEST:
			System.out.println("In West Direction");
			break;
			
		case NORTH:
			System.out.println("In North Direction");
			break;
			
		default:
			System.out.println("In South Direction");
			break;		
		}
	}

	public static void main(String[] args) {
		EnumExample4 obj1=new EnumExample4(Directions1.EAST);
		obj1.getMyDirections();
		EnumExample4 obj2=new EnumExample4(Directions1.SOUTH);
		obj2.getMyDirections();
		
		

	}

}
