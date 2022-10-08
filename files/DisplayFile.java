//display all the files:
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DisplayFile {
public static void main(String[] args) throws IOException  {
	String path="D:\\files\\";
	Scanner sc=new Scanner(System.in);
//	System.out.println("enter the file in the directory of "+path);
//	String filename=sc.next();
	//File
	File f=new File(path);
	File filenames[]=f.listFiles();
	for(File ff: filenames) {
		System.out.println(ff.getName());
	}
	
	
}
}
