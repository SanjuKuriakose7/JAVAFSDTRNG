package com.ust;

import java.io.File;

public class FileExample6 {

	public static void main(String[] args) {
		File file=new File("D");
		try {
			
		String[] fileList=file.list();
		for(String str:fileList) {
			System.out.println(str);
		}
		}
		catch(Exception e) {
			e.getStackTrace();
		}

	}

}
