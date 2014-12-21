package algorithms;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int[] x = { 3, 7, 2, 8, 6, 5, 3, 8, 6, 9, 2, 6, 3, 1 };
		System.out.println(Arrays.toString(x));

		long ts = System.currentTimeMillis();
		System.out.println(Arrays.toString(selectionSort(x)));
		System.out.println(System.currentTimeMillis() - ts);
	}

	public static int[] selectionSort(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			int minIndex = i;
			int maxIndex = i;
			for (int j = i + 1; j < array.length - i; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
				if (array[j] > array[maxIndex]) {
					maxIndex = j;
				}
			}

			// System.out.println();
			// System.out.println("i = " + i);
			// System.out.println("maxIndex = " + maxIndex);
			// System.out.println("minIndex = " + minIndex);
			// swap min with first and max with last

			int temp = array[minIndex];
			array[minIndex] = array[i];
			array[i] = temp;

			/*
			 * the problem - when the max index is on i, we swap i with min
			 * index and then array.length-i-a with maxIndex yes, but after the
			 * first swap, the max value is not on maxIndex anymore, because it
			 * was swapped. we must assign the maxIndex to the new position of
			 * the swapped max value the fix! if(i == maxIndex) maxIndex =
			 * minIndex;
			 */

			int temp1 = array[maxIndex];
			array[maxIndex] = array[array.length - i - 1];
			array[array.length - i - 1] = temp1;

			// System.out.println(Arrays.toString(array));
		}

		return array;
	}
}
