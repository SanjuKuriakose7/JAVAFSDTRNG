package com.ust;

 class StudentNotFoundException extends Exception {
	

	public StudentNotFoundException(String message) {
		super(message);
	}
}
class Student1{
	Student1() {
		
	}
}
 class StudentTest {
	public Student1 find(String studentID)throws StudentNotFoundException {
		if(studentID.equals("123456")) {
			return new Student1();
		}
		else {
			throw new StudentNotFoundException("Could not find student with ID "+studentID);
		}
	}
}
public class StudentManager {
	

	public static void main(String[] args) {
		StudentTest manager=new StudentTest();
		try {
			Student1 student=manager.find("0000001");
		}
		catch(StudentNotFoundException ex) {
			System.err.print(ex);
		}

	}
}

	
