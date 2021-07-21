package com.ust;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class BufferReaderWritterExample {

	private static FileWriter FileWriter = null;
	private static final String BufferedWriter = null;

	public static void main(String[] args) {
		File file=new File("D:file.txt");
		try {
			FileWriter=new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(FileWriter);
			bufferedWriter.write("This is an Example \n");
			bufferedWriter.write("of using BufferedWriter and \n");
			bufferedWriter.write("BufferedReader.");
			bufferedWriter.flush();
			
		}
		catch(IOException e) { 
			e.printStackTrace();
		}
		finally {
			try {
				if(FileWriter!=null) {
					FileWriter.close();
				}
				if(BufferedWriter!=null) {
					
				}
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		Object fileReader = null;
		BufferedReader bufferedReader=null;
		try {
			fileReader=new FileReader(file);
			bufferedReader=new BufferedReader((Reader) fileReader);
			String line=null;
			while((line=bufferedReader.readLine())!=null) {
				System.out.println(line);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(fileReader!=null) {
					
				}
				if(bufferedReader!=null) {
					bufferedReader.close();
				}
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
