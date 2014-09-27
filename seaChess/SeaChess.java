package seaChess;

import java.util.Scanner;

public class SeaChess {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[][] matrix = new String[3][3];

		while (true) {
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix.length; j++) {
					matrix[i][j] = " ";
				}
			}
			System.out.println("Game starts!");
			System.out.println("Player 1 plays with 'X'");
			System.out.println("Player 2 plays with 'O'");

			printMatrix(matrix);
			int row = 0;
			int col = 0;
			String[] arr = new String[2];
			int countRounds = 0;
			String sign = "";

			while (true) {
				// PLAYER 1
				// reads the input
				System.out
						.println("Player 1's turn! Select coordinates!(ex: 1,1)");
				arr = input.nextLine().trim().split("\\s*,\\s*");
				row = Integer.parseInt(arr[0]);
				col = Integer.parseInt(arr[1]);

				// checks for valid input
				sign = "X";
				isValid(row, col, arr, matrix, sign);

				// prints players' choices until now
				printMatrix(matrix);

				// checks if player 1 has 3 'X'es in a row
				if (isWinner(matrix)) {
					System.out.println("Player 1 wins the game!");
					break;
				}
				countRounds++;

				// checks if there are any moves left
				if (countRounds == 9) {
					System.out.println("No winners in the game!");
					break;
				}

				// PLAYER 2
				// player 2 input
				System.out
						.println("Player 2's turn! Select coordinates!(ex: 1,1)");
				arr = input.nextLine().trim().split("\\s*,\\s*");
				row = Integer.parseInt(arr[0]);
				col = Integer.parseInt(arr[1]);

				// checks for valid input
				sign = "O";
				isValid(row, col, arr, matrix, sign);

				// prints players' choices until now
				printMatrix(matrix);

				// checks if player 2 has 3 'O's in a row
				if (isWinner(matrix)) {
					System.out.println("Player 2 wins the game!");
					break;
				}
				countRounds++;
			}

			// asks if you want to play again and checks for valid input
			String answer = "";
			while (true) {
				System.out.println("Do you want to try again? (yes/no)");
				answer = input.nextLine();
				if (!(answer.equals("no") || answer.equals("yes"))) {
					System.out
							.println("Invalid input! Please choose between 'yes' and 'no'");
				} else {
					break;
				}
			}
			if (answer.equals("no")) {
				break;
			}
		}

	}

	// checks if there is a winner
	public static boolean isWinner(String[][] matrix) {
		if ((matrix[0][0] == matrix[0][1] && matrix[0][1] == matrix[0][2] && !(matrix[0][0] == " "
				&& matrix[0][1] == " " && matrix[0][2] == " "))
				|| (matrix[1][0] == matrix[1][1]
						&& matrix[1][1] == matrix[1][2] && !(matrix[1][0] == " "
						&& matrix[1][1] == " " && matrix[1][2] == " "))
				|| (matrix[2][0] == matrix[2][1]
						&& matrix[2][1] == matrix[2][2] && !(matrix[2][0] == " "
						&& matrix[2][1] == " " && matrix[2][2] == " "))
				|| (matrix[0][0] == matrix[1][0]
						&& matrix[1][0] == matrix[2][0] && !(matrix[0][0] == " "
						&& matrix[1][0] == " " && matrix[2][0] == " "))
				|| (matrix[0][1] == matrix[1][1]
						&& matrix[1][1] == matrix[2][1] && !(matrix[0][1] == " "
						&& matrix[1][1] == " " && matrix[2][1] == " "))
				|| (matrix[0][2] == matrix[1][2]
						&& matrix[1][2] == matrix[2][2] && !(matrix[0][2] == " "
						&& matrix[1][2] == " " && matrix[2][2] == " "))
				|| (matrix[0][0] == matrix[1][1]
						&& matrix[1][1] == matrix[2][2] && !(matrix[0][0] == " "
						&& matrix[1][1] == " " && matrix[2][2] == " "))
				|| (matrix[0][2] == matrix[1][1] && matrix[1][1] == matrix[2][0])
				&& !(matrix[0][2] == " " && matrix[1][1] == " " && matrix[2][0] == " ")) {
			return true;
		} else {
			return false;
		}
	}

	// prints the matrix with players' choices
	public static void printMatrix(String[][] matrix) {
		System.out.println("-------");
		System.out.printf("|%S|%S|%S|%n", matrix[0][0], matrix[0][1],
				matrix[0][2]);
		System.out.println("-------");
		System.out.printf("|%S|%S|%S|%n", matrix[1][0], matrix[1][1],
				matrix[1][2]);
		System.out.println("-------");
		System.out.printf("|%S|%S|%S|%n", matrix[2][0], matrix[2][1],
				matrix[2][2]);
		System.out.println("-------");
	}

	// checks for valid input
	public static void isValid(int row, int col, String[] arr,
			String[][] matrix, String sign) {
		Scanner input = new Scanner(System.in);
		while (row > 3 || row < 1 || col > 3 || col < 1) {
			System.out.println("Invalid input!");
			System.out.println("Select coordinates!(ex: 1,1)");
			arr = input.nextLine().trim().split("\\s*,\\s*");
			row = Integer.parseInt(arr[0]);
			col = Integer.parseInt(arr[1]);
		}
		while (true) {
			if (matrix[row - 1][col - 1].equals(" ")) {
				matrix[row - 1][col - 1] = sign;
				break;
			} else {
				System.out
						.println("Invalid input! These coordinates are already selected!");
				System.out.println("Select other coordinates!");
				arr = input.nextLine().trim().split("\\s*,\\s*");
				row = Integer.parseInt(arr[0]);
				col = Integer.parseInt(arr[1]);
			}
		}
	}
}
