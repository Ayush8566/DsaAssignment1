
public class QH5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[4][4];
		System.out.println("the matrix is");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				a[i][j] = (int) (Math.random() * 2);
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		int maxrow_index = 0;
		int temp = 0;
		for (int i = 0; i < 4; i++) {
			int count = 0;
			for (int j = 0; j < 4; j++) {

				if (a[i][j] == 1)
					count++;

			}
			if (count > temp) {
				temp = count;
				maxrow_index = i;
			}
		}
		System.out.println("the largest  row index : " + maxrow_index);
		int maxcolumn_index = 0, max = 0;
		for (int j = 0; j < 4; j++) {
			int countc = 0;
			for (int i = 0; i < 4; i++) {
				if (a[i][j] == 1)
					countc++;
			}
			if (countc > max) {
				max = countc;
				maxcolumn_index = j;
			}
		}
		System.out.println("the largest column indexc : " + maxcolumn_index);

	}
}
