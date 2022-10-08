
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System .out.println("Enter file name");
		String filename=sc.next();
		
		FileWriter fo=new FileWriter(filename);
		
		if(fo !=null)
		{
			System.out.println("File is Available");
		}
		System.out.println("Enter data into the file");
		
		String inputOfFile=sc.next()+sc.nextLine();
		System.out.println(inputOfFile);
		
		fo.write(inputOfFile);
		System.out.println("Write operation completed");
		fo.close();
		System.out.println("Enter second filename");
		String filename2=sc.next();
		
		FileWriter fo2=new FileWriter(filename2);
		if(fo2 !=null)
		{
			System.out.println("File is Available");
		}
		FileInputStream fi=new FileInputStream(filename);
		System.out.print(filename);
		int i=0;
       
		while((i=fi.read())!=-1) {
			System.out.println(i);
			fo2.write((char)i);
		}
		
		System.out.println("File copied to "+filename2);
		fi.close();
		fo2.close();
		
	}
}

