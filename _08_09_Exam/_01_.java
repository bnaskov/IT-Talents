package _08_09_Exam;

import java.util.Scanner;

public class _01_ {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 0;
		do {
			System.out.println("Please enter a positive integer: ");
			n = input.nextInt();
		} while (n < 1);

		isCube(n);
	}

	private static void isCube(int n) {
		boolean isCube = false;
		int i = 1;
		int cube = 1;
		while (true) {
			cube = i * i * i;
			if (cube > n) {
				break;
			}
			if (cube == n) {
				isCube = true;
				break;
			}
			i++;
		}
		System.out.println(isCube ? n + " is a cube of " + i : n
				+ " is not a cube");
	}

}
