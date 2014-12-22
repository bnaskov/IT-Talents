package algorithms;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {

		int[] array = { 6, 67, 4, 3, 4, 7, 8, 4, 4, 5, 677, 2, 11, 43, 35, 6,
				7, 4, 2 };
		System.out.println(Arrays.toString(array));
		quickSort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));
	}

	// left = first index of element
	// right = last index of element
	public static int partition(int[] array, int left, int right) {
		int pivotIndex = (int) Math.random() * (right - left) + left;
		int pivot = array[left];
		int storeIndex = left + 1;
		for (int i = storeIndex; i <= right; i++) {
			if (array[i] < pivot) {
				swap(array, i, storeIndex);
				storeIndex++;
			}
		}
		swap(array, left, storeIndex - 1);
		return storeIndex - 1;// return the index where the pivot is.
	}

	public static void quickSort(int[] array, int left, int right) {
		if (left > right)
			return;
		else {
			int storeIndex = partition(array, left, right);
			quickSort(array, left, storeIndex - 1);
			quickSort(array, storeIndex + 1, right);
		}
	}

	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
