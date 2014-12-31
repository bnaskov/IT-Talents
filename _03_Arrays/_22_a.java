package _03_Arrays;

import java.util.Scanner;

public class _22_a {
	/*
	 * Да се прочетат 2 числа, които се събират в лонг. Да се провери дали на
	 * едното цифрите му се съдържат в другото същата последователност.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a number: ");
		long num1 = input.nextLong();
		System.out.println("Please enter a second number: ");
		long num2 = input.nextLong();

		// if the input is negative
		if (num1 < 0) {
			num1 *= -1;
		}
		if (num2 < 0) {
			num1 *= -1;
		}

		// Solution with strings
		if (String.valueOf(num2).contains(String.valueOf(num1))
				|| String.valueOf(num1).contains(String.valueOf(num2))) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
