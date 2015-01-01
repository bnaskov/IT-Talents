package _05_TwoDimArrays;

import java.util.Scanner;

public class _02_ {
	/*
	 * Напишете програма, която за масив от числа, въведен от потребителя (с
	 * дължина, въведена от потребителя), намира и отпечатва на екрана броя на
	 * нулите в масива.
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
		int zeroCounter = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter the " + (i + 1) + " element: ");
			arr[i] = input.nextInt();
			if (arr[i] == 0) {
				zeroCounter++;
			}
		}

		System.out.println("The number of zeroes in the array is: "
				+ zeroCounter);
	}

}
