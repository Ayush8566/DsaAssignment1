import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number ");
		int n= sc.nextInt();
		System.out.println( n+" is odd: "+isOdd(n));
	}
	public static  boolean isOdd(int n) {
		if((n&1)==1)
			return true;
		return false;
	}
}
