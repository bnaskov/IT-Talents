package algorithms;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {

		int[] x = { 3, 7, 2, 8, 6, 5, 3, 8, 6, 9, 2, 6, 3, 1 };

		System.out.println(Arrays.toString(x));
		long ts = System.currentTimeMillis();
		System.out.println(Arrays.toString(bubbleSort(x)));
	}

	public static int[] bubbleSort(int[] array) {
		for (int j = 0; j < array.length; j++) {
			boolean sorted = true;
			for (int i = 1; i < array.length - j; i++) {
				if (array[i - 1] > array[i]) {
					// swap
					int temp = array[i - 1];
					array[i - 1] = array[i];
					array[i] = temp;
					sorted = false;
				}
			}

			if (sorted)
				break;
		}

		return array;
	}
}
