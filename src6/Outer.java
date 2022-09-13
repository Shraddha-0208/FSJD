public class Outer {
	
	private String msg="Welcome to JAVA";
	
	class Inner{
		void hello() {
			System.out.println(msg+", Let us start learning inner classes");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer obj=new Outer();
		Outer.Inner in=obj.new Inner();
		in.hello();
		
	}

}

