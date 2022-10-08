import java.util.*;
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		set.add(11);
		set.add(13);
		set.add(10);
		set.add(11);
		set.add(12);
		set.add(14);
		set.add(11);
		System.out.println("Linked Hash Set:"+set);
	}

}