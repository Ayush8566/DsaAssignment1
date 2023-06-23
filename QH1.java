
public class QH1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= Integer.parseInt( args[0]);
		int b= Integer.parseInt(args[1]);
		int c= Integer.parseInt(args[2]);
		if( a+b==c && a==b-c && a*b==c)
			System.out.println("the number can be used in correct arthemetic forula");
		else
			System.out.println("the is not in corect arthemetic formula");
	}

}
