package com.ust;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
//import java.util.List;

class Student2 {
	int rollno;
	String name;
	int age;
	Student2(int rollno,String name,int age) {
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
}
class NameComp implements Comparator {
	public int compare(Object o1,Object o2) {
		Student2 s1=(Student2)o1;
		Student2 s2=(Student2)o2;
		return s1.name.compareToIgnoreCase(s2.name);
	}
}



public class ComparatorExample1  {

	

	public static void main(String[] args) {
		ArrayList<Student2> al=new ArrayList<Student2>();
		al.add(new Student2(101,"Sanju",22));
		al.add(new Student2(102,"Anju",23));
		al.add(new Student2(103,"Ranju",24));
		
		System.out.println("Sorting by Name");
		Collections.sort(al,new NameComp());
		Iterator<Student2> itr=al.iterator();
		while (itr.hasNext()) {
			Student2 st=(Student2)itr.next();
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
	}

}
