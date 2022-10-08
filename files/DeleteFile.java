//delete a file from the directory
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DeleteFile {
public static void main(String[] args) throws IOException  {
	String path="D:\\files\\";
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the file in the directory of "+path);
	String filename=sc.next();
	//File
	File f=new File(path+filename);
	//delete a file
	boolean b=f.delete();
	if(b==true) {
		System.out.println("file has been deleted");
	}
	else {
		System.out.println("file is not found/ cannot be deleted  ");
	}
	
}}
