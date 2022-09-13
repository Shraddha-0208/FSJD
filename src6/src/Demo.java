//initializing the instance variables using a default constructor
class Person{
	//instance variables
	private String name;
	private int age;
	//default constructor
	Person(){
		name="Jay";
		age=25;
	}
	//parameterized constructor
	Person(String n,int a){
		name=n;
		age=a;
	}
	//method
	void talk() {
		System.out.println("Hello I am "+name);
		System.out.println("My age is "+age);
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a person class object: Jay
		Person Jay=new Person();
		//call the talk() method
		Jay.talk();
		
		//create another object: mendu
		Person mendu=new Person("Mendu",32);
		mendu.talk();
		
	}

}

