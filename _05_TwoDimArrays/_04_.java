package _05_TwoDimArrays;

import java.util.Scanner;

public class _04_ {
	/*
	 * Напишете програма, която за даден масив от цели числа, измества всички
	 * ненулеви елементи в началото на масива, а всички нулеви в края без да
	 * променя реда им.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = { 1, 0, 15, -1, 7, 4, 0, 0, 8 };
		int[] arrSorted = new int[arr.length];
		int counter = 0;

		// sorts the array
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arrSorted[counter] = arr[i];
				counter++;
			}
		}

		// prints the array
		for (int i = 0; i < arrSorted.length; i++) {
			System.out.print(arrSorted[i] + " ");
		}

	}

}
