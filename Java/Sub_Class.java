package com.ust;
class Super_Class {
	int num=20;
	//display method of Super_Class
	public void display() {
		System.out.println("This is the display method of Super class");
	}
}


public class Sub_Class extends Super_Class {
       int num=10;
	//display method of Subclass
	public void display() {
		System.out.println("This is the display method of Subclass");
		
	}
	public void my_method() {
		//Instantiating Subclass 
		Sub_Class sub=new Sub_Class();
		//invoking the display() method of sub class
		sub.display();
		//invoking the display()method of superclass	
		super.display();
		//printing the value of variable num of subclass
		System.out.println("Value of the variable named num in sub class:"+sub.num);
		//printing the value of the variable num of superclass
		System.out.println("Value of the variable named num in super class:"+super.num);
		
		
		}

	public static void main(String[] args) {
		Sub_Class obj=new Sub_Class();
		obj.my_method();
		obj.my_method();
		
	}

}
