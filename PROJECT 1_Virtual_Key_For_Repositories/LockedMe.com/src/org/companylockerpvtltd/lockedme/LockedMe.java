package org.companylockerpvtltd.lockedme;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LockedMe {
	static String DIRECTORY;
	File f_name;

	public LockedMe() {
		DIRECTORY = System.getProperty("user.dir");
		f_name = new File(DIRECTORY+"/files");
		if (!f_name.exists())
			f_name.mkdirs();
		
	}

	private static final String WELCOME_SCREEN =
								"\n****************************************\n"+
							   	  "**  Simplilearn project: LockedMe.com **\n"+
					              "**                                    **\n"+
					              "**  Developed by: SHRADDHA CHOUHAN    **\n"+
					              "**                                    **\n"+
					              "****************************************";
	
	
	

	private static final String MENU =
					"****************************MENU********************************\n"+
					"** 							      **\n"+
					"**  1. List the  Files in the directory 		      **\n"+
					"**  2. Adding , Deleting or Searching Files in the Directory  **\n"+
					"**  3. Exit the Program                 		      **\n"+
					"****************************************************************";
	
	

	private static final String SUBMENU =
					           "********************SUB-MENU********************\n"+
					           "**   a > Add a file                           **\n"+
					           "**   b > Delete a file                        **\n"+
					           "**   c > Search a file                        **\n"+
					           "**   d > GoBack                               **\n"+
					           "************************************************";

	void DisplayMainMenu() {
		System.out.println(MENU);
		try{
			System.out.print("CHOOSE THE CORRECT OPTIONS FROM THE GIVEN MENU:");
			Scanner sc = new Scanner(System.in);
			int option = sc.nextInt();
			switch (option){
			case 1 : {
				DisplayFiles();
				DisplayMainMenu();
			}
			case 2 : {
				DisplaySubMenu();
			}
			case 3 : {
				System.out.println("THANK YOU FOR YOUR VALUABLE TIME");
				System.exit(0);
			}
			default: DisplayMainMenu();
			}
		}
		catch (Exception e){
			System.out.println("KINDLY CHOOSE THE CORRECT OPTION LIKE 1, 2 OR 3");
			DisplayMainMenu();
		}
	}

	void DisplaySubMenu() {
		System.out.println(SUBMENU);
		try{
			Scanner sc = new Scanner(System.in);
			char[] input = sc.nextLine().toLowerCase().trim().toCharArray();
			char option = input[0];

			switch (option){
			case 'a' : {
				System.out.print("Enter the File Name which you want to Add : ");
				String filename = sc.next().trim();
				AddFile(filename);
				break;
			}
			case 'b' : {
				System.out.print("Enter the File Name which you want to Delete : ");
				String filename = sc.next().trim();
				DeleteFile(filename);
				break;
			}
			case 'c' : {
				System.out.print("Enter the File Name which you want to Search : ");
				String filename = sc.next().trim();
				SearchFile(filename);
				break;
			}
			case 'd' : {
				System.out.println("Moving back to the previuos menu");
				DisplayMainMenu();
				break;
			}
			default : System.out.println("Kindly Enter the correct option a, b, c or d ");
			}
			DisplaySubMenu();
		}
		catch (Exception e){
			System.out.println("Kindly Enter the correct option a, b, c or d ");
			DisplaySubMenu();
		}
	}

	void DisplayFiles() {

		if (f_name.list().length==0)
			System.out.println("The folder is empty , no files found");
		else {
			String[] list = f_name.list();
			System.out.println("The files in "+ f_name +" are :");
			Arrays.sort(list);
			for (String str:list) {
				System.out.println(str);
			}
		}
	}

	void AddFile(String filename) throws IOException {
		File filepath = new File(f_name +"/"+filename);
		String[] list = f_name.list();
		for (String file: list) {
			if (filename.equalsIgnoreCase(file)) {
				System.out.println("File " + filename + " already exists with similar name at " + f_name);
				return;
			}
		}
		filepath.createNewFile();
		System.out.println("File "+filename+" added to "+ f_name);
	}

	void DeleteFile(String filename)  throws IOException{
		Pattern p=Pattern.compile("a-zA-z0-9");
		File filepath = new File(f_name +"/"+filename);
		Matcher matcher= p.matcher(filename);
		String[] list = f_name.list();
		for (String file: list) {
			if (filename.equals(file) && filepath.delete()) {
				System.out.println("File " + filename + " deleted from " + f_name);
				return;
			}
		}
		System.out.println("Delete Operation failed. FILE NOT FOUND");
	}

	void SearchFile(String filename) {
		File f=new File("D:\\ECLIPSE WORKSPACE\\LockedMe.com\\files");
		Pattern p=Pattern.compile("a-zA-z0-9");
		File filenames[]=f.listFiles();
		Matcher matcher= p.matcher(filename);
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
			System.out.println("File is available, Status -> FILE FOUND : File " + filename + " exists at " + f_name);

		}
		else {
			System.out.println("File is not available, Status -> FILE  NOT FOUND");
		}


	}




	public static void main(String[] args) {
		System.out.println(WELCOME_SCREEN);
		LockedMe menu = new LockedMe();
		menu.DisplayMainMenu();
	}
}