package _03_Arrays;

import java.util.Scanner;

// Да се състави програма, която въвежда 2 числа M и N от клавиатурата и отпечатва всички числа в интервала M и N.

public class _06_ {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number M: ");
		int m = input.nextInt();
		System.out.println("Please enter a number N: ");
		int n = input.nextInt();
		if (m > n) {
			m = n + m;
			n = m - n;
			m = m - n;
		}
		for (int i = m; i <= n; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

}
