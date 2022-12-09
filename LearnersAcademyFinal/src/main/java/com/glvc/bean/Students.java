package com.glvc.bean;

public class Students {
	private int Student_id;
	private String Student_Fname;
	private String Student_Lname;
	private int Student_age;
	private int Student_class;
	
	
	public int getStudent_id() {
		return Student_id;
	}


	public void setStudent_id(int student_id) {
		Student_id = student_id;
	}


	public String getStudent_Fname() {
		return Student_Fname;
	}


	public void setStudent_Fname(String student_Fname) {
		Student_Fname = student_Fname;
	}


	public String getStudent_Lname() {
		return Student_Lname;
	}


	public void setStudent_Lname(String student_Lname) {
		Student_Lname = student_Lname;
	}


	public int getStudent_age() {
		return Student_age;
	}


	public void setStudent_age(int student_age) {
		Student_age = student_age;
	}


	
	public int getStudent_class() {
		return Student_class;
		
	}


	public void setStudent_class(int student_class) {
		Student_class = student_class;
		
	}


	@Override
	public String toString() {
		return "Students [Student_id=" + Student_id + ", Student_Fname=" + Student_Fname + ", Student_Lname="
				+ Student_Lname + ", Student_age=" + Student_age + ", Student_class=" + Student_class + "]";
	}


	
	
	
}
