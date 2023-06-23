import java.util.Scanner;
public class Q7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.print("Enter the element of the array: ");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int max=a[0],min=a[0],count=0,count1=0;
		max=Integer.MIN_VALUE;
		min=Integer.MAX_VALUE;
		int pos_max=0,pos_min=-1;
		for(int i=0;i<n;i++) {
				if(a[i]>max) {
					max=a[i];
					count=1;
					pos_max=i+1;
				}
				else if( max==a[i])
					count++;
				 if( a[i]<min) {
					min=a[i];
					count1=1;
					pos_min=i+1;
				}
				else if( min==a[i]) {
					count1++;
	         	pos_min=i+1;
	         	}
		}
		System.out.println("Maximum element of Array is"+max+" and occurs"+count+"times.");
		System.out.println("Minimum element of Array is "+min+" and occurs "+count1+"times");
		System.out.println("First occurrence of maximum element is at position "+pos_max);
		System.out.println("Last occurrence of minimum element is at position "+pos_min);
	}

}
