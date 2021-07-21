package com.ust;

class Example14 {
	int id;
	String name;
	float salary;
	void insert(int i,String n, float s) {
		id=i;
		name=n;
		salary=s;
	}
	void display() {System.out.println(id+" "+name+" "+salary);}
	
}
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example14 e1=new Example14();
		Example14 e2=new Example14();
		Example14 e3=new Example14();
		
		e1.insert(101,"a",45000);
		e2.insert(102,"a",25000);
		e3.insert(103,"a",55000);
		
		e1.display();
		e2.display();
		e3.display();

	}

}

