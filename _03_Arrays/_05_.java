package _03_Arrays;

import java.util.Scanner;

// Да се състави програма, която чете числа от клавиатурата до въвеждане на 0 и :
// - Отпечатва най-голямото
// - Отпечатва най-малкото
// - Отпечатва най-голямото нечетно число

public class _05_ {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int maxOdd = Integer.MIN_VALUE;
		boolean firstZero = true;
		while (true) {
			System.out.println("Please enter a number n: ");
			int n = input.nextInt();
			if (n == 0 && firstZero && min == Integer.MAX_VALUE) {
				System.out.println("You haven't entered any numbers");
				firstZero = false;
				break;
			} else if (n == 0) {
				break;
			}
			if (n < min) {
				min = n;
			}
			if (n > max) {
				max = n;
			}
			if (n % 2 != 0 && n > maxOdd) {
				maxOdd = n;
			}
		}
		if (!firstZero) {
			System.out.println();
		} else {
			System.out.print("The biggest: " + max + ", the smallest: " + min);
			if (maxOdd == Integer.MIN_VALUE) {
				System.out
						.println(", there is no odd numbers among the numbers you entered.");
			} else {
				System.out.println(", maximum odd number: " + maxOdd + ".");
			}
		}
	}
}
