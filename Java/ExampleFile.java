package com.ust;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class ExampleFile {

	public static void main(String[] args) {
		try {
		File f=new File("D:File1.txt");
		
		/*if(f.createNewFile()) {
			System.out.println(f.getName()+"if created");
			
		}
		else {
			System.out.println("Already exists");
		}*/
		//f.Write("This is Java Training");
		//Scanner read=new Scanner(f);
		FileReader read=new FileReader(f);
		/*while(read.hasNextLine()) {
			String data=read.nextLine();
			System.out.println(data);
		}*/
		int ch;
		while((ch=read.read())!=-1) {
			System.out.print((char)ch);
			
		}
		read.close();
		}
		catch(IOException e) {
			System.out.println("Exception Occured");
		}

	}

}
