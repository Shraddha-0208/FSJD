package com.glvc.bean;

public class Subjects {
	
public int Subject_id;
public String Subject_name;
public int getSubject_id() {
	return Subject_id;
}
public void setSubject_id(int subject_id) {
	Subject_id = subject_id;
}
public String getSubject_name() {
	return Subject_name;
}
public void setSubject_name(String subject_name) {
	Subject_name = subject_name;
}
@Override
public String toString() {
	return "Subjects [Subject_id=" + Subject_id + ", Subject_name=" + Subject_name + "]";
}

}
