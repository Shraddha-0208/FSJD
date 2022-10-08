import java.util.*;
public class HashSetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Creating HashSet");
		HashSet<String> hs=new HashSet<String>();
		
		//store some string elements
		hs.add("India");
		hs.add("America");
		hs.add("China");
		hs.add("Japan");
		hs.add("America");
		hs.add("Dubai");
		
		//view the hashset
		System.out.println("Hash Set:"+hs);
	}

}
