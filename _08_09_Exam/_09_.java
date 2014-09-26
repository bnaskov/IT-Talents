package _08_09_Exam;

public class _09_ {

	public static void main(String[] args) {
		// N and M validation
		int[][] matrix = { { 1, 2, 3, 4 }, { 3, 4, 5, 6 }, { 3, 55, 6, 70 },
				{ 40, 5, 70, 8 } };

		int index = 0;
		for (int row = 0; row < matrix.length; row += 2) {
			for (int col = 0; col < matrix[row].length; col++) {
				if (col % 2 == 0) {
					index = row;
				} else {
					index = row + 1;
				}
				System.out.print(matrix[index][col] + " ");
			}
			System.out.println();
			for (int col = 0; col < matrix[row].length; col++) {
				if (col % 2 == 0) {
					index = row + 1;
				} else {
					index = row;
				}
				System.out.print(matrix[index][col] + " ");
			}
			System.out.println();
		}
	}
}
