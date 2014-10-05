package rollingStone;

import java.util.Scanner;

public class RollingStone {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int width = 0;
		int height = 0;
		int obstacles = 0;
		while (true) {
			// check the input
			System.out.println("Please enter the width of the matrix: ");
			width = 10;
			System.out.println("Please enter the height of the matrix: ");
			height = 10;
			System.out.println("Please enter the number of obstacles: ");
			obstacles = 10;
			char[][] playground = new char[width][height];

			int[] playerCoord = { 1, 1 };
			int[] stoneCoord = { 1, 2 };

			generateObstacles(playground, obstacles);
			drawPlayground(playground);
			while (true) {

				char direction = ' ';

				do {
					System.out
							.println("Direction ('up' = 'w', 'down' = 's', 'left' = 'a', 'right' = 'd'): ");
					direction = input.nextLine().charAt(0);
				} while (direction != 'w' && direction != 's'
						&& direction != 'a' && direction != 'd');

				movePlayer(playground, direction, playerCoord, stoneCoord);
				drawPlayground(playground);

				if (checkWinner(playground, stoneCoord)) {
					break;
				}

				if (checkGameOver(playerCoord, playground, stoneCoord)) {
					System.out.println("Game Over:");
					break;
				}

			}
		}
	}

	private static boolean checkGameOver(int[] playerCoord,
			char[][] playground, int[] stoneCoord) {

		int stoneX = stoneCoord[0];
		int stoneY = stoneCoord[1];

		boolean canMoveLeftRight = false;
		boolean canMoveUpDown = false;
		// check can move right/left
		if ((stoneY + 1) < playground[0].length && (stoneY - 1) >= 0) {
			if (playground[stoneCoord[0]][stoneCoord[1] + 1] == ' '
					|| playground[stoneCoord[0]][stoneCoord[1] + 1] == '$'
					|| playground[stoneCoord[0]][stoneCoord[1] + 1] == '#') {
				if (playground[stoneCoord[0]][stoneCoord[1] - 1] == ' '
						|| playground[stoneCoord[0]][stoneCoord[1] - 1] == '$'
						|| playground[stoneCoord[0]][stoneCoord[1] - 1] == '#')
					canMoveLeftRight = true;
			}
		}

		// check can move up/down
		if ((stoneX + 1) < playground.length && (stoneX - 1) >= 0) {
			if (playground[stoneCoord[0] + 1][stoneCoord[1]] == ' '
					|| playground[stoneCoord[0] + 1][stoneCoord[1]] == '$'
					|| playground[stoneCoord[0] + 1][stoneCoord[1]] == '#') {

				if (playground[stoneCoord[0] - 1][stoneCoord[1]] == ' '
						|| playground[stoneCoord[0] - 1][stoneCoord[1]] == '$'
						|| playground[stoneCoord[0] - 1][stoneCoord[1]] == '#') {
					canMoveUpDown = true;
				}
			}
		}

		if (canMoveLeftRight || canMoveUpDown) {
			return false;
		} else {
			return true;
		}
	}

	private static boolean checkWinner(char[][] playground, int[] stoneCoord) {
		if (playground[stoneCoord[0]][stoneCoord[1]] == playground[playground.length - 1][playground[0].length - 1]) {
			System.out.println("You win!");
			return true;
		}
		return false;
	}

	private static void movePlayer(char[][] playground, char direction,
			int[] playerCoord, int[] stoneCoord) {

		int playerX = playerCoord[0];
		int playerY = playerCoord[1];

		switch (direction) {
		case 'w':
			playerX--;
			break;
		case 's':
			playerX++;
			break;
		case 'a':
			playerY--;
			break;
		case 'd':
			playerY++;
			break;
		default:
			break;
		}

		if (playerX < 0 || playerY < 0 || playerX > playground[0].length
				|| playerY > playground.length) {
			System.out.println("cannot leave the playground");
			return;
		}

		if (playground[playerX][playerY] == '@') {
			System.out.println("cannot move, there is a obstacle");
			return;
		}

		boolean canMoveStone = true;
		if (playground[playerX][playerY] == 'o') {
			canMoveStone = moveStone(playground, stoneCoord, direction);
		}

		if (canMoveStone) {
			playground[playerCoord[0]][playerCoord[1]] = ' ';
			playerCoord[0] = playerX;
			playerCoord[1] = playerY;
			playground[playerX][playerY] = '$';
		}

	}

	private static boolean moveStone(char[][] playground, int[] stoneCoord,
			char direction) {
		int stoneX = stoneCoord[0];
		int stoneY = stoneCoord[1];

		switch (direction) {
		case 'w':
			stoneX--;
			break;
		case 's':
			stoneX++;
			break;
		case 'a':
			stoneY--;
			break;
		case 'd':
			stoneY++;
			break;
		default:
			break;
		}

		if (stoneX < 0 || stoneY < 0 || stoneX >= playground[0].length
				|| stoneY >= playground.length) {
			System.out.println("the stone cannot leave the playground");
			return false;
		}

		if (playground[stoneX][stoneY] == '@') {
			System.out
					.println("cannot move, there is an obstacle after the stone");
			return false;
		}
		playground[stoneCoord[0]][stoneCoord[1]] = ' ';
		stoneCoord[0] = stoneX;
		stoneCoord[1] = stoneY;
		playground[stoneX][stoneY] = 'o';
		return true;

	}

	private static void drawPlayground(char[][] playground) {
		for (int i = 0; i < playground.length; i++) {
			for (int j = 0; j < playground[i].length; j++) {
				System.out.print('|');
				System.out.print(playground[i][j]);
			}
			System.out.print('|');
			System.out.println();
		}
	}

	private static void generateObstacles(char[][] playground, int obstacles) {
		for (int i = 0; i < playground.length; i++) {
			for (int j = 0; j < playground[i].length; j++) {
				playground[i][j] = ' ';
			}
		}

		playground[1][1] = '$';
		playground[1][2] = 'o';
		playground[playground.length - 1][playground[0].length - 1] = '#';
		for (int i = 0; i < obstacles;) {
			int obstacleX = (int) (Math.random() * playground[0].length);
			int obstacleY = (int) (Math.random() * playground.length);
			if (playground[obstacleX][obstacleY] == ' ') {
				playground[obstacleX][obstacleY] = '@';
				i++;
			}
		}
	}
}
