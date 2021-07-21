package com.ust;

public class Employeedetails {
	String fName;
	String lName;
	String City;
	String Address;
	String Dob;
	float Salary;
	
	Employeedetails(String x,String y,String z,String a,String b,float c) {
		fName=x;
		lName=y;
		City=z;
		Address=a;
		Dob=b;
		Salary=c;
	}
	void display() {
		System.out.println(fName+" "+lName+" "+City+" "+Address+" "+Dob+" "+Salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Employeedetails e1=new Employeedetails("Sanju","Kuriakose","Perumbavoor","125,Thuruthy","15-Sep-1998",25000.0f);
		Employeedetails e2=new Employeedetails("Abhinaya","Vishakan","Palakkad","122,Ottappalam","12-June-1999",35000.0f);
		Employeedetails e3=new Employeedetails("Gireesh","reji","Kollam","123,Kottayam","16-Nov-1995",45000.0f);
		Employeedetails e4=new Employeedetails("Deepu","john","Padanilam","124,Idukki","17-July-1996",55000.0f);
		Employeedetails e5=new Employeedetails("Jossy","Kurian","Paniyeli","126,Ernakulam","18-May-1997",65000.0f);
		*/
		//Employeedetails e;
		
		
		Employeedetails array[]=new Employeedetails[5];
		array[0]=new Employeedetails("Sanju","Kuriakose","Perumbavoor","125,Thuruthy","15-Sep-1998",25000.0f);
		array[1]=new Employeedetails("Abhinaya","Vishakan","Palakkad","122,Ottappalam","12-June-1999",35000.0f);
		array[2]=new Employeedetails("Gireesh","reji","Kollam","123,Kottayam","16-Nov-1995",45000.0f);
		array[3]=new Employeedetails("Deepu","john","Padanilam","124,Idukki","17-July-1996",55000.0f);
		array[4]=new Employeedetails("Jossy","Kurian","Paniyeli","126,Ernakulam","18-May-1997",65000.0f);
		
	  for(int i=0;i<array.length;i++) {
		  array[i].display();
	  }
		
		/*for(Employeedetails e:array) {
			//System.out.println(e.fName+e.lName+e.City+e.Address+e.Dob+e.Salary);
			e.display();
		}*/
		
		
		/*for(int i=1;1<=5;i++) {
			i.display();
		}*/
		
	//e1.display();
		//e2.display();
		//e3.display();
		//e4.display();
		//e5.display();
	


	}

}
