package com.ust;

import java.io.*;

public class FileExam1 {
  
    public static void main(String args[])
    {
        File f = new File("D:File1.txt");
  
        
        if (f.mkdir()) {
  
            
            System.out.println("Directory is created");
        }
        else {
           
            System.out.println("Directory cannot be created");
        }
    }
}
    

   