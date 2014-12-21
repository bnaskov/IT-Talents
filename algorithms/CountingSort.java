package algorithms;

import java.util.Arrays;

public class CountingSort {
	public static void main(String[] args) {

		int[] x = { 3, 7, 2, 8, 6, 5, 3, 8, 6, 9, 2, 6, 3, 1 };
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(countingSort(x, 9)));
	}

	public static int[] countingSort(int[] array, int maxValue) {
		int[] results = new int[array.length];
		int[] helper = new int[maxValue + 1];

		for (int i = 0; i < array.length; i++) {
			helper[array[i]]++;
		}

		int resultIndex = 0;
		// why is this Complexity 0(N+k) ?
		for (int i = 0; i < helper.length; i++) {// this is 0(k)

			// this is always N operations, no matter how much K is! So N*k is
			// wrong assumption here
			for (int j = 0; j < helper[i]; j++) {
				results[resultIndex] = i;
				resultIndex++;
			}
		}

		return results;
	}
}
