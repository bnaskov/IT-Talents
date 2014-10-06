package _20_Exceptions;

import java.util.Arrays;

public class DevideArrays {

	public static void main(String[] args) {
		int[] a1 = new int[] { 8, 3, 10, 24, 0, 4, 7, 14 };
		int[] a2 = new int[] { 4, 0, 2, 3, 9, 4 };

		System.out.println(Arrays.toString(devideArrays(a1, a2)));
	}

	public static int[] devideArrays(int[] a1, int[] a2) {
		int length = 0;

		try {
			while (true) {
				a1[length] = a1[length];
				a2[length] = a2[length];
				length++;
			}
		} catch (IndexOutOfBoundsException e) {
		}

		int[] newArr = new int[length];
		for (int i = 0; i < newArr.length; i++) {
			try {
				newArr[i] = a1[i] / a2[i];
			} catch (ArithmeticException e) {
				// you can delete the next line, I left it because it's easier
				// to read the code
				newArr[i] = 0;
			}
		}

		return newArr;
	}
}
