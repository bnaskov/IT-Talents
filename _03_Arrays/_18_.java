package _03_Arrays;

import java.util.Scanner;

public class _18_ {
	/*
	 * Да се състави програма, която чете от клавиатурата ест число N <= 27 и
	 * отпечатва броя на естествените трицифрени числа, със сума на цифрите
	 * по-голяма от N.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		int counter = 0;
		while (true) {
			System.out
					.println("Please enter a number between 0 and 28 (0<n<28): ");
			num = input.nextInt();
			if (num > 0 && num < 28) {
				break;
			}
			System.out.println("Your input is invalid!");
		}
		for (int i = 1; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				for (int n = 0; n <= 9; n++) {
					if ((i + j + n) > num) {
						counter++;
					}
				}
			}
		}
		System.out
				.println("There are " + counter
						+ " numbers with sum of their digits greater than "
						+ num + ".");
	}

}
