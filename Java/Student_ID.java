package com.ust;

public class Student_ID {
	int id;
	String name;
	
	Student_ID(int id,String name) {
		
	}
	void display() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_ID s1=new Student_ID(1,"Sanju");
		Student_ID s2=new Student_ID(2,"Chai");
		s1.display();
		s2.display();
		

	}

}
