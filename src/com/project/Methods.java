package com.project;
import java.io.*;
import java.util.Arrays;


public class Methods {
	public File dir=new File("E:\\Simlilearn\\Folder");
	public void retrive()
	{
		
		if(!dir.exists())
		{
			dir.mkdir();
			
		}
		File[] files = dir.listFiles();

	      Arrays.sort(files, (f1, f2) -> f1.compareTo(f2));

	      for (File file : files) {
	         if (!file.isHidden()) {
	            if (!file.isDirectory()) {
	            	System.out.println("FILE\t" + file.getName());
	            } 
	         }
	      }
		}
	public void add()
	{
		String fileName="Filename";
		File tagFile=new File(dir,fileName+".txt");
		if(!tagFile.exists()){
		try {
			tagFile.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	public void delete(String file)
	{
		{     
			try  
			{ 
			File f= new File(file);  
			if(f.delete())                       
			{  
			System.out.println(f.getName() + " deleted");   
			}  
			else  
			{  
			System.out.println("failed");  
			}  
			}  
			catch(Exception e)  
			{  
			e.printStackTrace();  
			}  
			}  	
	}
	
	
}
