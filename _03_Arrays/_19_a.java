package _03_Arrays;

import java.util.Scanner;

public class _19_a {
	/*
	 * Да се състави програма , която при въведено от клавиатурата естествено
	 * число N извежда на екрана броя на всички 3- цифрени числа по-малки от N ,
	 * които не съдържат еднакви цифри.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		int counter = 0;

		while (true) {
			System.out
					.println("Please enter a number greater than 0 (n > 0): ");
			num = input.nextInt();
			if (num > 0) {
				break;
			}
			System.out.println("Your input is invalid!");
		}

		for (int i = 1; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				for (int n = 0; n <= 9; n++) {
					if (i != j && i != n && j != n) {
						if (i * 100 + j * 10 + n <= num) {
							counter++;
						}
					}
				}
			}
		}

		System.out.printf(
				"There is %d numbers less than %d with 3 different digits.%n",
				counter, num);
	}
}