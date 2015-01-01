package _05_TwoDimArrays;

import java.util.Scanner;

public class _03_ {
	/*
	 * Напишете програма, която за даден масив arr от реални числа създава нов
	 * масив, с дължина, равна на дължината на arr, който има същите елементи
	 * като тези в arr, но с обратен знак. Отпечатайте съдържанието на новия
	 * масив.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] arr1 = { -5, 10.2, 21.95, -14.33, 1, 12.5, 17.954 };
		double[] arr2 = new double[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i] * -1;
			System.out.print(arr2[i] + " ");
		}
	}
}
