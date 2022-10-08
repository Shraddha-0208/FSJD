import java.util.*;
public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Creating HashSet:");
		HashSet<Integer> set=new HashSet<Integer>();
		set.add(101);
		set.add(102);
		set.add(103);
		set.add(101);
		set.add(103);
		set.add(104);
		set.add(105);
		set.add(100);
		System.out.println(set);
	}

}
