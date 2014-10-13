package _07_Methods_Recursion;

import java.util.Scanner;

public class _04_ {
	/*
	 * Write a recursive function to find the n-th fibonacci number
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n;
		while (true) {
			System.out.println("Please neter a number: ");
			n = input.nextInt();
			if (n > 0) {
				break;
			}
		}
		System.out.println(calcFibonacci(n));
	}

	public static long calcFibonacci(long num) {
		if (num <= 2) {
			return 1;
		} else {
			return calcFibonacci(num - 1) + calcFibonacci(num - 2);
		}
	}
}
