package _07_Methods_Recursion;

import java.util.Scanner;

public class _03_ {
	/* Write a function to find n! factorial */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n;
		while (true) {
			System.out.println("Please neter a number n!: ");
			n = input.nextInt();
			if (n > 0) {
				break;
			}
		}
		System.out.println(factorial(n));

	}

	public static long factorial(long num) {
		long factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial *= i;
		}
		return factorial;
	}

}
