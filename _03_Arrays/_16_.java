package _03_Arrays;

import java.util.Scanner;

/*Да се състави програма, която чете от клавиатурата редици от по 5 числа, като при въвеждане 
 * на строго растяща редица спира и извежда на конзолата сумата на числата в последната редица */

public class _16_ {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("Please enter 5 numbers: ");
			double n1 = input.nextDouble();
			double n2 = input.nextDouble();
			double n3 = input.nextDouble();
			double n4 = input.nextDouble();
			double n5 = input.nextDouble();
			if (n1 < n2 && n2 < n3 && n3 < n4 && n4 < n5) {
				System.out.printf("The sum of the 5 numbers is : %.2f%n", (n1
						+ n2 + n3 + n4 + n5));
				break;
			}
		}
	}
}
