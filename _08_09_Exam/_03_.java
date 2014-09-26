package _08_09_Exam;

import java.util.Scanner;

public class _03_ {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = 0;
		int y = 0;
		do {
			System.out.println("Please enter two positive integers: ");
			x = input.nextInt();
			y = input.nextInt();
		} while (x < 1 || x > 70 || y < 1 || y > 70);
		int z = x;

		System.out.println(xPowY(x, y, z));
	}

	static int xPowY(int x, int y, int z) {
		if (y == 1) {
			return z;
		}
		int result = z;
		int increment = z;
		for (int i = 1; i < x; i++) {
			result += increment;
		}
		return xPowY(x, --y, result);
	}
}
