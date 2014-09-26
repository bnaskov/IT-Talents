package _08_09_Exam;

import java.util.Scanner;

public class _02_ {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 0;
		do {
			System.out.println("Please enter a positive integer: ");
			n = input.nextInt();
		} while (n < 1);

		System.out.println(isPalindrom(n));
	}

	private static boolean isPalindrom(int n) {
		StringBuilder num = new StringBuilder(Integer.toString(n));
		StringBuilder numRev = new StringBuilder(Integer.toString(n));
		numRev.reverse();
		if (num.toString().equals(numRev.toString())) {
			return true;
		} else {
			return false;
		}
	}

}
