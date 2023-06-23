import java.util.Scanner;
public class QH4 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  row and column of matrix");
		int n = sc.nextInt();
		double a[][] = new double[n][n];
		System.out.println("Enter the element of the matrix");
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				a[i][j] = sc.nextDouble();
		
		double b[][] = new double[n][n];
		System.out.println("Enter the element of the matrix");
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				b[i][j] = sc.nextDouble();
		double arr[][] = addMatrix(a, b);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static double[][] addMatrix(double[][] a, double[][] b) {

		int r = a.length;
		int c = b.length;

		double arry[][] = new double[r][c];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arry[i][j] = a[i][j] + b[i][j];
			}
		}
		return arry;
	}
}
