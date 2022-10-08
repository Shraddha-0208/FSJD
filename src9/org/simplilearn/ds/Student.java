package org.simplilearn.ds;




import java.util.ArrayList;


public class Student {
	int sid;
	String name;
	public Student(int sid, String name) {
		this.sid = sid;
		this.name = name;
	}

	public class Arraylist1 {
		public static void main(String[] args) {
			Student s1=new Student(1, "abc");
			Student s2=new Student(2, "def");
			Student s3=new Student(3, "lmk");

			//generic tells the type of data what we are collecting-Wrapper classes
			ArrayList<Student> al=new ArrayList<>();
			al.add(s1);
			al.add(s2);
			al.add(s3);
			for(Student ss:al) {
				System.out.println(ss.sid+"   "+ss.name);
			}
		}

	}
}

