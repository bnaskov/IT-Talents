package _03_Arrays;

import java.util.Scanner;

//Да се състави програма, която чете числа от клавиатурата до въвеждане на 0 и :
//- Отпечатва най-голямото
//- Отпечатва най-малкото
//- Отпечатва най-голямото нечетно число

public class _05_a {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int max = input.nextInt();
		int min = max;
		int maxOdd = 1;
		boolean oddNumber = false;
		while (true) {
			System.out.println("Please enter a number: ");
			int n = input.nextInt();
			if (n == 0) {
				break;
			}
			if (n < min) {
				min = n;
			}
			if (n > max) {
				max = n;
			}
			if (n % 2 != 0 && !oddNumber) {
				maxOdd = n;
				oddNumber = true;
			} else if (n % 2 != 0 && oddNumber && n > maxOdd) {
				maxOdd = n;
			}
		}
		System.out.print("The biggest: " + max + ", the smallest: " + min);
		if (!oddNumber) {
			System.out
					.println(", there is no odd numbers among the numbers you entered.");
		} else {
			System.out.println(", maximum odd number: " + maxOdd + ".");
		}
	}
}
