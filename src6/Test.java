class Student{
	private String name;
	private int rollNo;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj=new Student();
		obj.setName("Anuhya");
		obj.setRollNo(555);
		obj.setAge(20);
		System.out.println("Student Name:"+obj.getName());
		System.out.println("Age:"+obj.getAge());
		System.out.println("Roll Number:"+obj.getRollNo());
	}

}