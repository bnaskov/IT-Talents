package _05_TwoDimArrays;

import java.util.Scanner;

public class _06_ {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size;

		// checks for valid input
		while (true) {
			System.out
					.println("Please enter the size of the array (size > 0): ");
			size = input.nextInt();
			if (size > 0) {
				break;
			}
			System.out.println("Invalid input!");
		}

		// fills the matrix
		double[][] matrix = new double[size][size];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("Please enter the value of matrix[%d][%d]: ",
						i, j);
				matrix[i][j] = input.nextDouble();
			}
		}

		System.out.println("Please enter a real number 'a': ");
		double a = input.nextDouble();
		System.out.println("Please enter a real number 'b': ");
		double b = input.nextDouble();

		// this way 'a' will always be smaller than 'b'
		if (a > b) {
			double temp = a;
			a = b;
			b = temp;
		}

		// replaces the values between a and b with 0
		// prints the matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] > a && matrix[i][j] < b) {
					matrix[i][j] = 0;
				}
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
