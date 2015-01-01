package _05_TwoDimArrays;

import java.util.Scanner;

public class _09_ {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int size;
		// checks for valid input
		while (true) {
			System.out.println("Please enter the size of the matrix: ");
			size = input.nextInt();
			if (size > 0) {
				break;
			}
			System.out.println("Invalid input!");
		}

		System.out.println("Please enter the starting value of the matrix: ");
		int a = input.nextInt();
		System.out.println("Please enter the addend: ");
		int d = input.nextInt();
		int[][] matrix = new int[size][size];

		// determines the starting position
		int posRow = (size - 1) / 2;
		int posCol = (size - 1) / 2;

		// directions right = 0; down = 1; left = 2; up = 3;
		int direction = 0; // initial direction
		int stepsCount = 1; // how many steps have to be performed in this
							// direction
		int stepPosition = 0; // 0 steps already performed
		int stepChange = 0; // steps count changes every 2 steps
		int sum = a;

		for (int i = 0; i < size * size; i++) {

			// fills the current cell with the current value
			if (i != 0) {
				sum += d;
				matrix[posRow][posCol] = sum;
			} else {
				matrix[posRow][posCol] = sum;
			}

			// checks for direction / step changes
			if (stepPosition < stepsCount) {
				stepPosition++;
			} else {
				stepPosition = 1;
				if (stepChange == 1) {
					stepsCount++;
				}
				stepChange = (stepChange + 1) % 2;
				direction = (direction + 1) % 4;
			}

			// moves to the next cell in the current direction
			switch (direction) {
			case 0:
				posCol++;
				break;
			case 1:
				posRow++;
				break;
			case 2:
				posCol--;
				break;
			case 3:
				posRow--;
				break;
			}
		}

		// prints the matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
