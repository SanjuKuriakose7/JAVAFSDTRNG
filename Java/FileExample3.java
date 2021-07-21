package com.ust;

//import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileExample3 {

	public static void main(String[] args) {
		try {
			/*FileInputStream input=new FileInputStream("D:File1.txt");
			System.out.println("Data in the file: ");
			int i=input.read();
			while(i !=-1) {
				System.out.print((char)i);
				i=input.read();
			}*/
			//input.close();
			String s="I need to write into the file";
			FileOutputStream output=new FileOutputStream("D:File11.txt");
			output.write(s.getBytes());
			output.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

}
