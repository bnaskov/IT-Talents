package _07_Methods_Recursion;

import java.util.Scanner;

public class _05_ {
	/* Find Greatest Common Divisor of two numbers using Euclid’s method. */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter first number: ");
		int num1 = input.nextInt();
		System.out.println("Please enter second number: ");
		int num2 = input.nextInt();

		System.out.println("Greatest Common Divisor of " + num1 + " and "
				+ num2 + " is : " + findGCD(num1, num2));
	}

	public static int findGCD(int num1, int num2) {
		if (num2 == 0) {
			return num1;
		} else {
			return findGCD(num2, num1 % num2);
		}
	}
}
