//search a file
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SearchFile {
public static void main(String[] args) throws IOException  {
	String path="D:\\files\\";
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the file in the directory of "+path);
	String filename=sc.next();
	//File
	File f=new File(path);
	File filenames[]=f.listFiles();
	int flag=0;
	for(File ff: filenames) {
		if(ff.getName().equals(filename)) {
			flag=1;
			break;
		}
		else {
			flag=0;
		}
	}
	
	
	if(flag==1) {
		System.out.println("the file is found");
	}
	else {
		System.out.println("file is not found");
	}
	
	
}
}
