package _03_Arrays;

import java.util.Scanner;

//Да се състави програма, която чете числа от клавиатурата до въвеждане на 0 и отпечатва сумата им.

public class _02_ {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int sum = 0;
		boolean zero = true;
		while (zero) {
			System.out.println("Please enter a number: ");
			int n = input.nextInt();
			if (n == 0) {
				break;
			}
			sum += n;
			System.out
					.println("The sum of the numbers you entered till now is: "
							+ sum);
		}
		System.out.println("The sum of the numbers you entered till now is: "
				+ sum);
	}

}
