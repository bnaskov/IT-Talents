package _03_Arrays;

import java.util.Scanner;

public class _22_ {
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

		// num2 is always bigger than num1
		if (num1 > num2) {
			num1 = num2 + num1;
			num2 = num1 - num2;
			num1 = num1 - num2;
		}

		long modulus = 10;
		long dev = 1;
		boolean containsNum1 = false;
		while (modulus <= num2 * 10 && !containsNum1) {
			long tempNum = num2 % modulus;
			while (dev < tempNum) {
				long tempNum2 = tempNum / dev;
				if (tempNum2 == num1) {
					containsNum1 = true;
					break;
				}
				dev *= 10;
			}
			dev = 1;
			modulus *= 10;
		}

		if (containsNum1) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
