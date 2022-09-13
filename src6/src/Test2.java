abstract class Shape{
	String color;
	abstract double area();
	public abstract String toString();
	public Shape(String color) {
		System.out.println("Shape constructor called");
		this.color=color;
	}
	public String getColor() {
		return color;
	}
}
class Circle extends Shape{
	double radius;
	public Circle(String color,double radius) {
		super(color);
		System.out.println("Circle constructor clled");
		this.radius=radius;
	}
	@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radius, 2);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circle color is "+super.color+" and area is:"+area();
	}
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1=new Circle("Red",2.5);
		System.out.println(s1.toString());
	}

}