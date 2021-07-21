package com.ust;

import java.io.File;
//import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileExample2 {

	public static void main(String[] args) {
	try {
	File fName =new File("D:File1.txt");
	//fName.write("I am writing to the file");
	
	if(fName.createNewFile()) {
		System.out.println("File is created");
	//fName.close();

	}
	
	else {
		System.out.println(fName.canRead());
		System.out.println(fName.canWrite());
		System.err.println("String Should be printed");
		Scanner s=new Scanner(System.in);
		String txt=s.nextLine();
		System.out.println(txt);
		s.close();
		fName.setReadable(false);
		fName.setWritable(false);
		fName.setWritable(false, false);
	}
	}
	
	catch(IOException e) {
			e.printStackTrace();
			
		}
	
			
		
	}
}

	


