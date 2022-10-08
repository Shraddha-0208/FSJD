import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileE {
public static void main(String[] args) throws IOException  {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the file name");
	String filename=sc.next();
	FileWriter fo=new FileWriter(filename,true);
	//if file is available it opens in write mode else it is going to create a new file.
	if(fo!=null) {
		System.out.println("file has been available ");
	}
	System.out.println("enter data into the file");
	String inputOfFile=sc.next()+sc.nextLine();
	System.out.println(inputOfFile);
//	byte b[]=inputOfFile.getBytes();
	fo.write(inputOfFile);
	System.out.println("write operation completed");
	fo.close();
}
}
