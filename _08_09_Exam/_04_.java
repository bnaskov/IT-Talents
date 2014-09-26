package _08_09_Exam;

public class _04_ {

	public static void main(String[] args) {
		// validation and filling the array
		// Scanner input = new Scanner(System.in);
		// int n = 0;
		// do {
		// System.out.println("Please enter a positive integer: ");
		// n = input.nextInt();
		// } while (n < 1 || n > 70000000);
		//
		// int[] array = new int[n];
		// for (int i = 0; i < n; i++) {
		// System.out.println("Please enter a number: ");
		// array[i] = input.nextInt();
		// }

		// int[] array = { 1, 4, 5, 8, 12, 91, 15 };
		int[] array = { 1, 4, 5, 8, 12, 91, 15, 1 };
		elementsAreDifferent(array);
	}

	private static void elementsAreDifferent(int[] array) {
		quickSort(array, 0, array.length - 1); // QuickSort - O(NlogN)
		boolean areDifferent = true;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i + 1]) {
				areDifferent = false;
				break;
			}
		}
		System.out.println(areDifferent);
	}

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
		return storeIndex - 1;
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
