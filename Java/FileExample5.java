package com.ust;

import java.io.File;

public class FileExample5 {

	public static void main(String[] args) {
		File file=new File("D:File1.txt");
		try {
			file.createNewFile();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		File newFile=new File("D:File2.txt");
		boolean value=file.renameTo(newFile);
		
		if(value) {
			System.out.println("The name of the file is changed.");
		}
		else {
			System.out.println("The name can not be changed.");
		}
	}

}
