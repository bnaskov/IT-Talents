package _06_Strings;

import java.util.Scanner;

public class _01_ {
	/*
	 * Напишете програма, която проверява дали даден символен низ е префикс
	 * (начало) на друг символен низ.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String str1 = input.nextLine();
		System.out.println("Please enter a second string: ");
		String subStr = input.nextLine();

		if (str1.indexOf(subStr) == 0) {
			System.out
					.println("The second string is a prefix to the first one!");
		} else {
			System.out
					.println("The second string is NOT a prefix to the first one!");
		}
	}

}
