import java.util.*;
public class QH2 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter  the  number of line for input ");
	 int n= sc.nextInt();
	sc.nextLine();
	 String s[]= new String[n];
	 System.out.println("Enter lines");
	 for( int i=0;i<n;i++)
		 s[i]= sc.nextLine();
	 System.out.println("lines in reverse order");
	 for( int j=n-1;j>=0;j--)
		 System.out.println(s[j]);
	 
		 sc.close();
	}

}
