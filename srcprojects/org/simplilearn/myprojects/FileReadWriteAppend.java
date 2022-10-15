package org.simplilearn.myprojects;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileReadWriteAppend {

	String filename;
	String path="D:\\files\\";
	private static final String MENU =
			        "\n****************************MENU********************************\n"+
												      
					  "1. Read the  File in the directory 		    \n"+
					  "2. Write in the File in the Directory  		\n"+
					  "3. Append the File in the Directory          \n"+
					  "4. Exit the Program                 		    \n";
					


	
	void DisplayMainMenu() {
		System.out.println(MENU);
		try{
			System.out.print("CHOOSE THE CORRECT OPTIONS FROM THE GIVEN MENU:");
			try (Scanner sc = new Scanner(System.in)) {
				int option = sc.nextInt();
				switch (option){
				case 1 : 
				{
					FileRead(null);
					DisplayMainMenu();
					break;
				}
				case 2 : 
				{
					FileWrite(null);
					DisplayMainMenu();
					break;
				}
				case 3 : 
				{
					AppendToFile(null);
					DisplayMainMenu();
					break;
					
				}
				case 4 : 
				
				{
					System.out.println("THANK YOU FOR YOUR VALUABLE TIME");
					System.exit(0);
				}
				default: DisplayMainMenu();
				break;
				}
			}
		}
		
		catch (Exception e){
			System.out.println("KINDLY CHOOSE THE CORRECT OPTION LIKE 1, 2 OR 3");
			DisplayMainMenu();
			
		}
		
		}


	

	void FileRead(String[] args) throws IOException{
		//public static void main(String[] args) throws IOException  {

		Scanner sc=new Scanner(System.in);
			System.out.println("\nEnter the file name which you want to read");
			String filename=sc.next();
			FileInputStream fi=new FileInputStream(filename);
			//if file is available it opens in write mode else it is going to create a new file.
			if(fi!=null) {
				System.out.println("file exits and here is its data");
			}
			
			int i=0;
			                    //EOF
			while((i=fi.read())!=-1) {
				System.out.print((char)i);
			}
			

	}
		
	void FileWrite(String[] args)throws IOException {
	
			
		Scanner sc=new Scanner(System.in);
			System.out.println("\\nEnter the file name in which you want to write");
			String filename=sc.next()+sc.nextLine();
			FileOutputStream fo=new FileOutputStream(filename);
			//if file is available it opens in write mode else it is going to create a new file.
			if(fo!=null) {
				System.out.println("File has been available ");
			}
			System.out.println("Enter data into the file");
			String inputOfFile=sc.next()+sc.nextLine();
			System.out.println(inputOfFile);
			byte b[]=inputOfFile.getBytes();
			fo.write(b);
			System.out.println("write operation completed");
			fo.close();
		}
	



	void AppendToFile(String[] args)throws IOException {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("\\nEnter the file name in which you want to Append");
			String filename=sc.next()+sc.nextLine();
			FileOutputStream fo=new FileOutputStream(filename,true);
			//if file is available it opens in write mode else it is going to create a new file.
			if(fo!=null) {
				System.out.println("File has been available ");
			}
			System.out.println("Enter data to append into the file");
			String inputOfFile=sc.next()+sc.nextLine();
			System.out.println(inputOfFile);
			byte b[]=inputOfFile.getBytes();
			fo.write(b);
			System.out.println("write operation completed");
			fo.close();
		}

	public static void main(String[] args) {
		FileReadWriteAppend menu = new FileReadWriteAppend();
		menu.DisplayMainMenu();
	}
}