package com.glvc.bean;

public class Teachers {
	private int Teacher_id;
	private String Fname;
	private String Lname;
	private int Teacher_age;
	
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public int getTeacher_age() {
		return Teacher_age;
	}
	public void setTeacher_age(int teacher_age) {
		Teacher_age = teacher_age;
		
	}
	
	public int getTeacher_id() {
		return Teacher_id;
		
	}
	public void setTeacher_id(int teacher_id) {
		Teacher_id = teacher_id;
		
	}
	@Override
	public String toString() {
		return "Teachers [Teacher_id=" + Teacher_id + ", Fname=" + Fname + ", Lname=" + Lname + ", Teacher_age="
				+ Teacher_age + "]";
	}
	public Teachers(int teacher_id, String fname, String lname, int teacher_age) {
		super();
		this.Teacher_id = teacher_id;
		this.Fname = fname;
		this.Lname = lname;
		this.Teacher_age = teacher_age;
	}
	public Teachers() {
		//TODO Auto-generated constructor stub
	}

	
}
