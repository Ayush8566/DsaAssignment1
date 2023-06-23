import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row and column of a matrix ");
		int r = sc.nextInt();
		int c = sc.nextInt();
		double a[][] = new double[r][c];
		System.out.println("Enter the element of the matrix");
		for (int i = 0; i < r; i++)
			for (int j = 0; j < c; j++)
				a[i][j] = sc.nextDouble();
		System.out.println("Enter the column  number ");
		int cl = sc.nextInt();
		System.out.println(" sum of the  element at column " + cl + " is " + sumOfColumn(a, cl));
	}

	public static double sumOfColumn(double[][] m, int columnIndex) {

		double sumc = 0;
		for (int i = 0; i < m.length; i++)

			sumc += m[i][columnIndex];

		return sumc;
	}
}
