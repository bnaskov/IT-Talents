package _03_Arrays;

import java.util.Scanner;

// Да се състави програма, която въвежда 2 числа M и N от клавиатурата и отпечатва:
// - сумата на всички числа в интервала; 
// - произведението им.

public class _07_ {

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
		int sum = 0;
		int product = 1;
		for (int i = m; i <= n; i++) {
			sum += i;
			product *= i;
		}
		System.out.println("The sum is: " + sum);
		System.out.println("The product is: " + product);

	}

}
