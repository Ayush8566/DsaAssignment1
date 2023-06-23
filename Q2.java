import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter person weight in kg: ");
		double w = sc.nextDouble();
		System.out.println("Enter height of the person in meter: ");
		double h = sc.nextDouble();
		double bmi = w / (h * h);
		String st = "";
		if (bmi < 18.5)
			st = "Underweight";
		else if (bmi > 18.5 && bmi < 24.9)
			st = "Normalweight";
		else if (bmi > 25.0 && bmi < 29.9)
			st = "Overweight";
		else 
			st = "Obese";
		System.out.println("The person is " + st);
	}

}
