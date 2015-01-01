package _05_TwoDimArrays;


public class _08_ {
	/*
	 * Казваме, че дадена матрица е сортирана, ако за нея са в сила следните две
	 * условия: 1) всеки елемент в първия стълб е по-малък от всеки елемент във
	 * втория, всеки елемент във втория стълб е по-малък от всеки елемент в
	 * третия и т.н. 2) всеки елемент в първия ред е по-малък от елемента във
	 * втория ред, с който се намира в един и същ стълб на матрицата. Всеки
	 * елемент от втория ред е по-малък от елемента в третия ред, с който се
	 * намира в един и същ стълб на матрицата и т.н. Напишете програма, която
	 * проверява дали дадена матрица n x m е сортирана.
	 */
	public static void main(String[] args) {
		/* int[][] matrix = { { 2, 16, 49 }, { 4, 25, 64 }, { 9, 36, 81 } }; */
		/* int[][] matrix = { { 1, 4, 7 }, { 2, 6, 8 }, { 3, 5, 9 } }; */
		// int[][] matrix = { { 1, 5, 9 }, { 2, 6, 10 } };
		int[][] matrix = { { 1, 5, 9, 13 }, { 2, 6, 10, 14 }, { 3, 7, 11, 15 },
				{ 4, 8, 12, 16 } };

		boolean isSorted = true;

		// checks if the columns are sorted
		if (isSorted) {
			for (int i = 0; i < matrix[0].length; i++) {
				for (int j = 0; j < matrix.length - 1; j++) {
					if (matrix[j][i] >= matrix[j + 1][i]) {
						isSorted = false;
						break;
					}
				}
				if (!isSorted) {
					break;
				}
			}
		}

		// creates an array that holds the max values of each column
		int[] maxArr = new int[matrix[0].length];
		if (isSorted) {
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < matrix[0].length; i++) {
				for (int j = 0; j < matrix.length; j++) {
					if (matrix[j][i] > max) {
						max = matrix[j][i];
					}
				}
				maxArr[i] = max;
				max = Integer.MIN_VALUE;
			}
		}
		// System.out.println(Arrays.toString(maxArr));

		// checks if the max value in each column is smaller than every value in
		// the next column
		if (isSorted) {
			for (int i = 1; i < matrix[0].length; i++) {
				for (int j = 0; j < matrix.length; j++) {
					if (maxArr[i - 1] >= matrix[j][i]) {
						isSorted = false;
						break;
					}
				}
				if (!isSorted) {
					break;
				}
			}
		}

		System.out.println(isSorted ? "The matrix is sorted!"
				: "The matrix is NOT Sorted");
	}
}
