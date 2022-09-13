import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating arraylist
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();
		city.add("Bengaluru");
		city.add("Mysore");
		city.add("Delhi");
		city.add("Pune");
		System.out.println(city);
		city.add(2,"Noida");
		System.out.println(city);
		city.remove(1);
		city.remove("Pune");
		System.out.println(city);
	}

}