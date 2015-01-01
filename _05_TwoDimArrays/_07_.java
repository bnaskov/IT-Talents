package _05_TwoDimArrays;

public class _07_ {
	/*
	 * Дадена е матрица с m реда и n стълба. Масивът съдържа предварително
	 * въведени реални числа от интервала [-99.9..99.9]. Да се състави програма,
	 * която определя кой ред от матрицата съдържа най-голям брой положителни
	 * числа. Ако този ред не е първия, то елементите му да се сменят със
	 * съответните елементи на първия ред.
	 */
	public static void main(String[] args) {

		/*
		 * double[][] matrix = { { 12.9, 8, 4.5, 54, 61.9, 1.1 }, { -5.5, 14,
		 * -2.4, 18, 17.9, 31 }, { 13, 12, -4, 2, 14.1, 87.3 }, { -4, -14.3, 12,
		 * 43.7, 21.5, 9 } };
		 */

		double[][] matrix = { { -12.9, -8, -4.5, 54, 61.9, 1.1 },
				{ -5.5, 14, -2.4, 18, 17.9, 31 },
				{ 13, 12, -4, 2, 14.1, 87.3 },
				{ -4, -14.3, 12, 43.7, -21.5, 9 } };

		// counts the positive real numbers in the first row
		int countFirstRow = 0;
		for (int i = 0; i < matrix[0].length; i++) {
			if (matrix[0][i] > 0) {
				countFirstRow++;
			}
		}

		// find the index of the row with the most positive real numbers
		int counter = 0;
		int indexRow = 0;
		int maxCounter = countFirstRow;
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] > 0) {
					counter++;
				}
			}
			if (counter > maxCounter) {
				maxCounter = counter;
				indexRow = i;
			}
			counter = 0;
		}

		// if there is a row with more positive real numbers than the first one,
		// replaces the values of the elements in this row with the values of
		// the elements in the first row
		if (maxCounter > countFirstRow) {
			for (int i = 0; i < matrix[indexRow].length; i++) {
				matrix[indexRow][i] = matrix[0][i];
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
