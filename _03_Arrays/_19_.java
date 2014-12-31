package _03_Arrays;

import java.util.Scanner;

public class _19_ {
	/*
	 * Да се състави програма , която при въведено от клавиатурата естествено
	 * число N извежда на екрана броя на всички 3- цифрени числа по-малки от N ,
	 * които не съдържат еднакви цифри.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		int counter = 0;
		int largestPossNum = 0;

		while (true) {
			System.out
					.println("Please enter a number greater than 0 (n > 0): ");
			num = input.nextInt();
			if (num > 0) {
				break;
			}
			System.out.println("Your input is invalid!");
		}

		if (num > 102) {
			largestPossNum = num;
		} else if (num >= 987) {
			largestPossNum = 988;
		}

		for (int i = 102; i < largestPossNum; i++) {
			int firstDigit = (i / 100) % 10;
			int secondDigit = (i / 10) % 10;
			int thirdDigit = i % 10;
			if (firstDigit != secondDigit && firstDigit != thirdDigit
					&& secondDigit != thirdDigit) {
				counter++;
			}
		}
		System.out.printf(
				"There is %d numbers less than %d with 3 different digits.%n",
				counter, num);
	}
}
