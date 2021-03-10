package com.project;
import java.util.*;
import java.io.*;


public class Lockme {
	public void code()
	{
		Methods fn=new Methods();
		Scanner sc= new Scanner(System.in);
		while(true)
		{
		System.out.println("                  Lockme.com             ");
		System.out.println("                   WELCOME                ");
		System.out.println(" Developer                         Ritvik Pandey");
		System.out.println("               Lockers Pvt. Ltd.                 ");
		System.out.println("Choose the options to do the following operations");
		System.out.println("Choose 1 For Retrieve");
		System.out.println("Choose 2 to go to Bussiness Level operations");
		System.out.println("Choose 3 to close the Application");
		
		System.out.println("Please Enter Your Choice");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			fn.retrive();
			break;
		case 2:
			System.out.println("Choose 1 to Add File in Directory");
			System.out.println("Choose 2 to Delete File from Directory");
			System.out.println("Choose 3 to Search File from Directory");
			System.out.println("Choose 4 Return to Main Menu");
			System.out.println("Please Enter Your Choice");
			int choose = sc.nextInt();
			switch(choose)
			{
			case 1:
				fn.add();
				System.out.println("Your File has been added");
				break;
			case 2:
				String file = sc.nextLine();
				fn.delete(file);
				break;
			case 3:
				System.out.println("Enter the name of the file to be searched");
				String str=sc.next();
				MyFilenameFilter filter = new MyFilenameFilter(str);
				File dir = new File("E:\\Simlilearn\\Folder");
	        
				String[] flist = dir.list(filter); 
	  
	        // Empty array 
				if (flist == null) { 
					System.out.println( 
							"Empty directory or directory does not exists."); 
				} 
				else { 
					for (int i = 0; i < flist.length; i++)
					{ 
						System.out.println(flist[i]+" found"); 
					} 
					}  
				break;
			case 4:
				System.out.println("Return to Main Menu");
				code();
			default:
				System.out.println("Invalid Choice");
				break;
			
			}
		case 3:
			System.out.println("Thank You for using, Now you are out of the application");
			return ;
			
		}
		sc.close();
		}
		
	}

	public static void main(String[] args) {
		Lockme lock =new Lockme();
		lock.code();
	
	}

}
