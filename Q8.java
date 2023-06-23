import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of row and column of 2D-array");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] a = new int[m][n];
		System.out.print("Enter the element of the array: ");
		for (int i = 0; i < m; i++) 
			for (int j = 0; j < n; j++) 
				a[i][j] = sc.nextInt();
		int sum=0;
		System.out.println("the element of 2_D array is");
		for (int i = 0; i < m; i++) {
		
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
				sum+=a[i][j];
				
			}
			
			System.out.println();
		

		}
	//	System.out.println(a[1].length);
		System.out.println(" the sum of the element of the 2D array is "+sum);

	}
}
