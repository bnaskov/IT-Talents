package _03_Arrays;

import java.util.Scanner;

// Да се напише програма, която чете от клавиатурата числа и извежда най-голямото отрицателно число.

public class _13_ {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double maxNeg = 0;
		boolean hasNeg = false;
		while (true) {
			System.out.println("Please enter a number: ");
			double num = input.nextDouble();
			if (!hasNeg && num < 0) {
				maxNeg = num;
				hasNeg = true;
			} else if (num < 0 && maxNeg < num) {
				maxNeg = num;
			}
			if (hasNeg) {
				System.out.println(maxNeg);
			} else {
				System.out.println("No negative input yet");
			}
		}

	}

}
