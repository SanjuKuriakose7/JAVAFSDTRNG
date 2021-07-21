package com.ust;

   abstract class Emp {
	   private String name;
	   private int PayPerHr;
	   
	   void display() {
		   System.out.println("name is " + name+ "\n" +"Employee hour is "+ PayPerHr);
	   }
	   public Emp() {
		   
	   }
	   public Emp(String name,int PayPerHr) {
		   this.name=name;
		   this.PayPerHr=PayPerHr;
		   
	   }
	   //public abstract int calculateSalary();
   
   public void setName(String name) {
	   this.name=name;
   }
   public String getName() {
	   return name;
   }
   public void setPayPerHr(int PayPerHr) {
	this.PayPerHr=PayPerHr;  
	}
   public int getPayPerHr() {
	   return PayPerHr;
	   
   }
   
   abstract void salary(int x,int y);
   }
	   
   
   public class Employee extends Emp {
	   Employee() {
		   super();
	   }
	   Employee(String name, int PayPerHr) {
		   super(name,PayPerHr);
	   }
	   void salary(int days, int totalsal) {
		   if((totalsal/days)>500) {
			   System.out.println("the pay is good");
		   }
		   else {
			   System.out.println("the pay is not good");
		   }
	   }
  // }
	   public static void main(String[] args) {
		   Employee e1=new Employee("Sanju",18);
		   e1.display();
		   Employee e2=new Employee();
		   System.out.println(e2.getName());
		   e2.salary(10, 10000);
	   }
   }
	   
   
   
   