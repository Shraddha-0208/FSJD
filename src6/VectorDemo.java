import java.util.*;
public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating a vector
		System.out.println("Vector");
		Vector<Integer> vec=new Vector<Integer>();
		vec.addElement(15);
		vec.addElement(30);
		vec.addElement(45);
		vec.addElement(60);
		System.out.println(vec);
		vec.add(2, 35);
		System.out.println(vec);
		vec.remove(0);
		vec.removeElement(60);
		System.out.println(vec);
	}

}