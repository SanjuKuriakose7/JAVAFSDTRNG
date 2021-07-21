package com.ust;

import java.io.StringWriter;

public class StringWriterDemoTwo {

	public static void main(String[] args) {
		String str1="Hello World!";
		String str2="\n This is StringReader Program.";
		StringWriter outputWriter=new StringWriter();
		outputWriter.write(str1,0,12);
		System.out.println(outputWriter.toString());
		StringBuffer sbuf=outputWriter.getBuffer();
		sbuf.append(str2);
		System.out.println(outputWriter.toString());

	}

}
