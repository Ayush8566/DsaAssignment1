import java.util.Scanner;
public class Q11 {

	// to find the sum of the row and column in a matrix
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row and column ");
		int r=sc.nextInt();
		int c= sc.nextInt();
		int a[][]=new int [r][c];
		System.out.println("Enter the element of the array: ");
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				a[i][j]=sc.nextInt();
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(a[i][j]+" ");
				}
		System.out.println();
		}
		for(int i=0;i<r;i++) {
		double  sumc=0;
			for(int j=0;j<c;j++) {
		
				sumc+=a[i][j];
			
		}
			
			System.out.println(sumc);
		}
		
	}

}
