package com.ust;

import java.io.IOException;

class ThrowExample {
	void myMethod(int num) throws IOException,ClassNotFoundException {
		if(num==1)
			throw new IOException("IOException Occurred");
		else
			throw new ClassNotFoundException("ClassNotFoundException");
	}
}

public class ExceptionExample4 {

	public static void main(String[] args) {
		try {
			ThrowExample obj=new ThrowExample();
			obj.myMethod(1);
		}
		catch (Exception ex) {
			System.out.println(ex);
		}

	}

}
