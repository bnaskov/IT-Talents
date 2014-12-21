package algorithms;

import java.util.Arrays;

public class RadixSort {
	public static void main(String[] args) {

		int[] arr = { 3, 537, 24, 500, 436, 355, 3, 248, 6, 449, 2, 326, 322, 1 };
		System.out.println("unsorted numbers = " + Arrays.toString(arr));
		System.out.println("sorted numbers = "
				+ Arrays.toString(radixSort(arr)));
	}

	public static int[] radixSort(int[] array) {
		// first find max element
		int max = array[0];
		int divider = 1;
		int[] temp = new int[array.length];
		for (int i = 1; i < array.length; i++) {
			if (max < array[i])
				max = array[i];
		}
		// while max element runs out of digits
		while (max / divider > 0) {
			int[] helper = new int[10];
			// for each final digit save in helper array
			for (int i = 0; i < array.length; i++) {
				int lastDigit = array[i] / divider % 10;
				helper[lastDigit]++;
			}
			// System.out.println(Arrays.toString(helper));
			// then find positions for each value with this final digit position
			// of each value with lastDigit = i;
			for (int i = 1; i < 10; i++) {
				helper[i] += helper[i - 1];
			}
			// System.out.println(Arrays.toString(helper));
			// put back values from initial array to a temp array
			for (int i = array.length - 1; i >= 0; i--) {
				int lastDigit = array[i] / divider % 10;
				int position = --helper[lastDigit];
				temp[position] = array[i];
			}

			for (int i = 0; i < array.length; i++) {
				array[i] = temp[i];
			}

			// System.out.println(Arrays.toString(array));
			divider *= 10;
		}

		return array;
	}
}
