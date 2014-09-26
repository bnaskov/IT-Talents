package _08_09_Exam;

public class _07_ {

	public static void main(String[] args) {
		// int[] arr = { 10, 30, 40, 50, 40, 20 };
		// int[] arr = { 10, 20, 30 };
		// int[] arr = { 10, 7, 70 };
		// int[] arr = { 14, 13, 12, 11 };
		// int[] arr = { 18, 19, 21, 41, 51, 61, 71, 420, 20 };
		int[] arr = { 18, 190, 91, 81, 71, 61, 51, 40, 20 };

		findExtremum(arr);
	}

	private static void findExtremum(int[] arr) {
		// type: hill: 1; hollow: -1
		int type = 0;
		int counter = 0;
		if (arr[1] > arr[0]) {
			type = 1;
		} else {
			type = -1;
		}

		int extrIndex = -1;
		int startIndex = 0;
		int endIndex = arr.length;
		int currentIndex = 0;

		if (type == 1) {
			if (arr[arr.length - 1] > arr[arr.length - 2]) {
				extrIndex = arr.length - 1;
			}
			if (extrIndex == -1) {
				while (true) {
					counter++;
					currentIndex = ((endIndex + startIndex) / 2);
					if (arr[currentIndex] > arr[currentIndex - 1]
							&& arr[currentIndex] > arr[currentIndex + 1]) {
						extrIndex = currentIndex;
						break;
					} else if (arr[currentIndex] > arr[currentIndex - 1]) {
						startIndex = currentIndex;
					} else {
						endIndex = currentIndex;
					}
				}
			}
		}

		if (type == -1) {
			if (arr[arr.length - 1] < arr[arr.length - 2]) {
				extrIndex = arr.length - 1;
			}
			if (extrIndex == -1) {
				while (true) {
					counter++;
					currentIndex = ((endIndex + startIndex) / 2);
					if (arr[currentIndex] < arr[currentIndex - 1]
							&& arr[currentIndex] < arr[currentIndex + 1]) {
						extrIndex = currentIndex;
						break;
					} else if (arr[currentIndex] < arr[currentIndex - 1]) {
						startIndex = currentIndex;
					} else {
						endIndex = currentIndex;
					}
				}
			}
		}

		System.out.println(extrIndex + (type == 1 ? " (hill)" : " (hollow)"));
		// System.out.println(counter);
	}
}
