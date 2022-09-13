

public class Array3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[][] arr=new int[2][3]; //2 rows and 3 columns
		//Taking array with 3 rows and 3 columns
		int[][] arr= {{10,20,30},{40,50,60},{70,80,90}};
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
