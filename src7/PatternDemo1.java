
import java.util.regex.*;
public class PatternDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern="[a-zA-Z]+";
		String check="Regular Expression92 is 14HELpFul";
		
		//creating a pattern to be searched in matcher
		Pattern p=Pattern.compile(pattern);
		
		Matcher m=p.matcher(check);
		
		while(m.find()) {
			System.out.print(check.substring(m.start(),m.end())+"  ");
		}
		
	}

}
