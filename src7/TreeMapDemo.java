import java.util.*;
public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Creating TreeMap:");
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(105, "Hyundai");
		map.put(101, "Maruti Suzuki");
		map.put(103, "KIA");
		map.put(102, "Mahindra");
		map.put(104, "Nissan");
		
		System.out.println("\n The elements of TreeMap are:");
		for(Map.Entry<Integer,String> m:map.entrySet()) {
			System.out.println(m.getKey()+"    "+m.getValue());
		}
	}

}