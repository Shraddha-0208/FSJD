
import java.util.*;
public class Array2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no. of Subjects:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] marks=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter subject "+(i+1)+" marks:");
			marks[i]=sc.nextInt();
		}
		
		System.out.println("Displaying Marks:");
		for(int i:marks) {
			System.out.print(i+"  ");
		}
	}

}
