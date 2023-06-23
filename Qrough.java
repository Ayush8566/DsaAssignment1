
public class Qrough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch []= {'c' ,'a', 'r'};
		for(int i=0;i<3;i++) 
			for(int j=0;j<3;j++) 
				for(int k=0;k<3;k++) 
					 if( i!=j && j!=k&& k!=i)
						 System.out.println(ch[i]+" "+ch[j]+" "+ch[k]);
	}

}
