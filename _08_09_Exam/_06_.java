package _08_09_Exam;

import java.util.Scanner;

public class _06_ {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 0;
		do {
			System.out.println("Please enter a positive integer: ");
			n = input.nextInt();
		} while (n < 1);

		int first = 0;
		int second = 1;
		int third = 0;

		if (n == 1) {
			System.out.print(0);
		} else if (n == 2) {
			System.out.print("0 1 1");
		} else {
			System.out.print("0 1");
			while (true) {
				third = first + second;
				first = second;
				second = third;
				if (third < n) {
					System.out.print(" " + third);
				} else {
					break;
				}
			}
		}
	}
}
