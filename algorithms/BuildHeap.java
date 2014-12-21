package algorithms;

import java.util.Arrays;

public class BuildHeap {
	public static void main(String[] args) {
		int[] array = { 4, 8, 7, 1, 4, 8, 4, 7 };

		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(buildHeap(array)));
		System.out.println(Arrays.toString(heapSort(array)));
	}

	private static int[] buildHeap(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int nodeIndex = i;
			while (nodeIndex != 0) {
				int parentIndex = (nodeIndex - 1) / 2;
				if (array[parentIndex] < array[nodeIndex]) {
					int temp = array[parentIndex];
					array[parentIndex] = array[nodeIndex];
					array[nodeIndex] = temp;
				}
				nodeIndex = parentIndex;
			}
		}

		return array;
	}

	private static int[] heapSort(int[] array) {
		buildHeap(array);

		for (int i = 0; i < array.length; i++) {
			swap(array, 0, array.length - 1 - i);

			// decrement each time we swap the root
			int heapLength = array.length - i - 1;
			int parentIndex = 0;
			while (true)// check if new root is in place
			{
				int leftChildIndex = 2 * parentIndex + 1;
				int rightChildIndex = 2 * parentIndex + 2;
				if (leftChildIndex >= heapLength) {
					break;// reached end of heap
				} else if (rightChildIndex >= heapLength) {// only left child
															// exists
					if (array[leftChildIndex] > array[parentIndex]) {
						swap(array, leftChildIndex, parentIndex);
					}

					break;// reached end of heap
				} else {// has two children
					if (array[leftChildIndex] > array[rightChildIndex]) {
						if (array[leftChildIndex] > array[parentIndex]) {
							swap(array, leftChildIndex, parentIndex);
						}
						parentIndex = leftChildIndex;
					} else {
						if (array[rightChildIndex] > array[parentIndex]) {
							swap(array, rightChildIndex, parentIndex);
						}

						parentIndex = rightChildIndex;
					}
				}
			}
		}

		return array;
	}

	public static void swap(int[] array, int first, int second) {
		int temp = array[first];
		array[first] = array[second];
		array[second] = temp;
	}
}
