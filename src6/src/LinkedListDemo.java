
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("LinkedList");
		LinkedList<String> names=new LinkedList<String>();
		names.add("molly");
		names.add("Mendu");
		names.add("Bob");
		names.add("Swati");
		names.add("Madhuri");
//		System.out.println("Printing using foreach:");
//		for(String name:names) {
//			System.out.println(name);
//		}
		System.out.println("Printing using Iterator");
		boolean flag=false;
		Iterator<String> itr=names.iterator();
		while(itr.hasNext()) {
			String n=itr.next();
			if(n=="Bob") {
				flag=true;
				break;
			}
			else {
				flag=false;
			}
		}
		if(flag==true) {
			System.out.println("name found in list");
		}
		else {
			System.out.println("name not found in the list");
		}
		//System.out.println(names);
	}

}