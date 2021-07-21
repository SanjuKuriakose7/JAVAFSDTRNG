package com.ust;
//Encapsulation
class TestData {
	private String name;
	private int age;
	private float salary;
	
	public  String setName(String name) {
		 return this.name=name;
	}
	public String getName() {
		return name;
	}
	public  int setAge(int age) {
		 return this.age=age;
	}
	public int getAge() {
		return age;
	}
	public  float setSalary(float salary) {
		 return this.salary=salary;
	}
	public float getSalary() {
		return salary;
	}
	
	
	
}




public class TestDataHiding {

	public static void main(String[] args) {
		TestData t=new TestData();
		t.setName("Sanju");
		t.setSalary((float) 10000.0);
		t.setAge(22);
		System.out.println(t.getName()+" "+t.getSalary()+" "+t.getAge());
	}

}
