package _07_Methods_Recursion;

import java.util.Scanner;

public class _01_ {
	/*
	 * Write a function to find the n-th number of Finonachi sequence
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n;
		while (true) {
			System.out
					.println("Please neter the n-th number of fibonacci sequence: ");
			n = input.nextInt();
			if (n > 0) {
				break;
			}
		}
		System.out.println(fibonacci(n));

	}

	public static long fibonacci(long num) {
		if (num <= 2) {
			return 1;
		} else {
			long first = 1;
			long second = 1;
			long third = 0;
			for (int i = 0; i < num - 2; i++) {
				third = first + second;
				first = second;
				second = third;
			}
			return third;
		}
	}

}
