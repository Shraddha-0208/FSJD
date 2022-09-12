package org.simplilearn.myprojects;


	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Iterator;
	import java.util.List;
    import java.util.Scanner;
    import java.util.regex.Matcher;
    import java.util.regex.Pattern;


	public class ValidationOfEmailIdUsingRegex {
		/**
		 * @param args
		 */
		public static void main(String[] args) {
			
			List<String> list= new ArrayList<>();
			
		
			list.add("snehasanhotra1@gmail.com");
			list.add("snehasanhotra2@gmail.com");
			list.add("snehasanhotra3@gmail.com");
			list.add("snehasanhotra4@gmail.com");
			list.add("snehasanhotra5@gmail.com");
			list.add("snehasanhotra6@gmail.com");
			list.add("snehasanhotra7@gmail.com");
			list.add("snehasanhotra8@gmail.com");
			list.add("snehasanhotra9@gmail.com");
			list.add("snehasanhotra10@gmail.com");
			
			System.out.println(list);
		
	        
	        System.out.println("Enter your email ID which you want to validate :");
	        Scanner sc = new Scanner(System.in);
			Pattern pattern = Pattern.compile("[a-zA-Z0-9._@]+");


			String input = sc.next();
			
			Matcher matcher = pattern.matcher(input);
			if (matcher.matches())
				System.out.println("matched");
			else
				System.out.println("not");
			sc.close();
	        

}
}