package _08_09_Exam;

public class _05_ {

	public static void main(String[] args) {
		int[] arr = { 7, 9, 15, 2, 8, 22, 14, 3, 12 };
		int k = 4;

		// validation
		// if (k >= arr.length) {
		// System.out.println("K is bigger than array's length!");
		// }
		System.out.println(biggestPossibleSum(arr, k));
	}

	private static int biggestPossibleSum(int[] arr, int k) {
		int maxSum = 0;
		int sum = 0;

		for (int i = 0; i < k; i++) {
			maxSum += arr[i];
		}

		int tempSum = maxSum;
		for (int i = 1; i <= arr.length - k; i++) {
			sum = tempSum - arr[i - 1] + arr[i + k - 1];
			if (sum > maxSum) {
				maxSum = sum;
			}
			tempSum = sum;
		}
		return maxSum;
	}

}
