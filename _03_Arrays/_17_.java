package _03_Arrays;

import java.util.Scanner;

public class _17_ {

	/*
	 * Да се състави програма, която чете от клавиатурата тройки числа до
	 * прочитането на такива три числа, които не могат да бъдат страни на
	 * триъгълник. Тогава отпечатва на конзолата най-големия периметър.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double maxPerimeter = 0;
		boolean isTriangle = false;
		while (true) {
			System.out
					.println("Please enter the sides (A, B, C) of a triangle: ");
			double a = input.nextDouble();
			double b = input.nextDouble();
			double c = input.nextDouble();

			if (a < b + c && b < a + c && c < a + b && a > 0 && b > 0 && c > 0) {
				isTriangle = true;
				if (a + b + c > maxPerimeter) {
					maxPerimeter = a + b + c;
				}
			} else {
				break;
			}
		}
		if (isTriangle) {
			System.out.printf("The biggest parameter is: %.2f%n", maxPerimeter);
		} else {
			System.out.println("You haven't entered a single valid input");
		}
	}

}
