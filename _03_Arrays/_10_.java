package _03_Arrays;

import java.util.Scanner;

// Да се напише програма, която приема числа от клавиатурата до въвеждане на 0 и 
// извежда броя на въведените отрицателни числа.

public class _10_ {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int countNegNum = 0;
		while (true) {
			System.out.println("Please enter a number: ");
			int n = input.nextInt();
			if (n == 0) {

				break;
			}
			if (n < 0) {
				countNegNum++;
			}
		}
		System.out.println("You've entered " + countNegNum
				+ " negative numbers.");

	}

}
