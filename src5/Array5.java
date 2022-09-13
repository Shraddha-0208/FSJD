import java.util.*;
public class Array5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Creating ArrayList");
		ArrayList<String> city=new ArrayList<String>();
		city.add("Bengaluru");
		city.add("Hyderabad");
		city.add("Pune");
		city.add("Bengaluru");
		city.add(1,"Mysore");
		System.out.println(city);
		city.remove(4);
		System.out.println(city);
		city.remove("Hyderabad");
		System.out.println(city);
		String[] places= {"NewYork","Mexico","London","Dubai"};
		Collections.addAll(city, places);
		System.out.println(city);
	}

}
