
//All the objects sharing the same method
class MyClass{
	//method to calculate square value
	void calculate(double x) {
		System.out.println("Square="+(x*x));
	}
}
public class Common {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating 3 objects
		MyClass obj1=new MyClass();
		MyClass obj2=new MyClass();
		MyClass obj3=new MyClass();
		
		//call calculate method from objects
		obj1.calculate(3);
		obj2.calculate(4);
		obj3.calculate(5);
	}

}