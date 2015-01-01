package _05_TwoDimArrays;

import java.util.Scanner;

public class _01_ {
	/*
	 * Напишете програма, която за масив от числа, въведен от потребителя (с
	 * дължина, въведена от потребителя), отпечатва на екрана на един ред само
	 * положителните числа от масива.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size;

		// checks for valid input
		while (true) {
			System.out
					.println("Please enter the size of the array (size > 0): ");
			size = input.nextInt();
			if (size > 0) {
				break;
			}
			System.out.println("Invalid input!");
		}

		// fills the array
		int[] arr = new int[size];
		String positiveInts = "";
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter the " + (i + 1) + " element: ");
			arr[i] = input.nextInt();
			if (arr[i] > 0) {
				positiveInts += (arr[i] + " ");
			}
		}

		System.out.println("The positive integers in the array are: "
				+ positiveInts);
	}
}
