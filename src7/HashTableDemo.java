
import java.util.*;
public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Creating HashTable:");
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		ht.put(1, "Mumbai");
		ht.put(2, "Kolkata");
		ht.put(3, "Delhi");
		ht.put(4, "Chennai");
		ht.put(5, "Hyderabad");
		ht.put(6, "Bengaluru");
		
		System.out.println("\nThe elements of HashTable are:");
		
		for(Map.Entry m:ht.entrySet()) {
			System.out.println(m.getKey()+"   "+m.getValue());
		}
	}

}