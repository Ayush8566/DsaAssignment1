import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int sum = 0, mul = 1, n1 = n;
		while (n != 0) {
			int r = n % 10;
			sum += r;
			mul *= r;
			n = n / 10;
		}
		System.out.println(" sum  of the digit N  =" + sum + " product of the digit of N = " + mul);
		if (sum == mul)
			System.out.println(n1 + " is a spy number");
		else
			System.out.println(n1 + " is  not a spy number");
	}

}
