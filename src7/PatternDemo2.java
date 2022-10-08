import java.util.regex.*;
public class PatternDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a pattern to be searched
		Pattern p=Pattern.compile("hi*");
		
		//search for the above pattern in the below string
		String s1="hihellohihowhiheyhi";
		Matcher m=p.matcher(s1);
		
		//check whether the pattern is there or not
		//using find() method
		while(m.find()) {
			//print starting and ending indexes of the pattern
			//in text using 
			System.out.println("Patter found from:"+m.start()+" to "+(m.end()-1));
		}
	}

}