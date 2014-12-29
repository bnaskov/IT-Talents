package _03_Arrays;

import java.util.Scanner;
// Да се състави програма, която отпечатва сумата на N въведени от клавиатурата числа. 
// N се въвежда предварително. При въвеждане на всяко число да изписва колко остават за въвеждане.

public class _01_ {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number n: ");
		int n = input.nextInt();
		while (n < 0) {
			System.out.println("Please enter a number n: ");
			n = input.nextInt();
		}
		int sum = 0;
		while (n > 0) {
			System.out.println("Please enter a number (" + n
					+ " numbers left): ");
			int num = input.nextInt();
			sum += num;
			n--;
		}
		System.out.println("The sum is equal to: " + sum);
	}

}
