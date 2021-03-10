package com.project;
import java.io.*;

public class MyFilenameFilter implements FilenameFilter{
String initials; 
    
    // constructor to initialize object 
    public MyFilenameFilter(String initials) 
    { 
        this.initials = initials; 
    } 
    

	// overriding the accept method of FilenameFilter 
    // interface 
    public boolean accept(File dir, String name) 
    { 
        return name.startsWith(initials); 
    } 
}
