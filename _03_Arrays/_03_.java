package _03_Arrays;

import java.util.Scanner;

// Да се състави програма, която чете числа от клавиатурата до въвеждане на 1 и отпечатва произведението им.

public class _03_ {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int product = 1;
		while (true) {
			System.out.println("Please enter a number: ");
			int n = input.nextInt();
			if (n == 1) {
				break;
			}
			product *= n;
			System.out
					.println("The product of the numbers you entered till now is: "
							+ product);
		}
		System.out
				.println("The product of the numbers you entered till now is: "
						+ product);
	}

}
