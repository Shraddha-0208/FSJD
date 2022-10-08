package org.simplilearn.ds;
import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args) {
		
		//generic tells the type of data what we are collecting-Wrapper classes
		ArrayList<String> al=new ArrayList<>();
		al.add("abcd");
		al.add("def");
		al.add("sub");
		System.out.println(al);
	}
}