

public class Array1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		System.out.println("Printing array using for loop");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"  ");
		}
		System.out.println("\nPrinting array using foreach");
		for(int i:a) {
			System.out.print(i+"  ");
		}
		
	}
}
