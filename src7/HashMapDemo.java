
import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Creating HashMap:");
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(101,"Jay");
		hm.put(102,"Joe");
		hm.put(103,"Reena");
		hm.put(104,"Jeena");
		hm.put(105,"Tom");
		hm.put(106,"Krish");
		hm.put(103, "Joe");
		
		System.out.println("\nThe elements of HashMap are:");
		System.out.println(hm);
		
		System.out.println("Printing HashMap using foreach:");
		//for(String n:al)
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+"  "+m.getValue());
			//System.out.println(m);
		}
	}

}