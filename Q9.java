import java.util.Scanner;
public class Q9{
	public static void main (String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number ");
		int n= sc.nextInt();
		double a[][]=new double[n][n];
		System.out.println("Enter the element of the matrix");
		for(int i=0;i<n;i++) 
			for(int j=0;j<n;j++)
			a[i][j]=sc.nextDouble();
		
		double res=sumMajorDiagonal(a);
		System.out.println(res);
			
	}
	public static double sumMajorDiagonal(double[][]m) {
		int n=m.length;
		double sum=0;
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				if(i==j)
					sum+=m[i][j];
		return sum;
	}
}
