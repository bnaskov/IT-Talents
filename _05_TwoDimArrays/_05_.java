package _05_TwoDimArrays;

public class _05_ {
	/*
	 * Напишете програма, която от дадена матрица от числа намира най-големия
	 * измежду най-малките елементи във всеки ред.
	 */
	public static void main(String[] args) {
		double[][] matrix = { { -5, 21, 14.5, 16.7, 13.5 },
				{ 12, -7, 15, 12.8, -7.5 }, { 11.8, -56, -31.54, 12.1, 0 },
				{ 9, 8, 7, 6, 5, 4, 3, 2, 1 } };

		double[] maxMin = new double[matrix.length]; // this array will hold the
														// minimum value of
														// every row
		double min = Double.MAX_VALUE;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < min) {
					min = matrix[i][j];
				}
			}
			maxMin[i] = min;
			min = Double.MAX_VALUE;
		}

		// finds the maximum value among the minimum values in every row
		double max = maxMin[0];
		for (int i = 1; i < maxMin.length; i++) {
			if (maxMin[i] > max) {
				max = maxMin[i];
			}
		}

		System.out
				.println("The maximum value among the minimum values in every row is: "
						+ max);
	}

}
