package _06_Strings;

import java.util.Scanner;

public class _03_ {
	/*
	 * Напишете програма, която проверява дали даден символен низ е палиндром
	 * (един и същ е отпред назад и отзад напред).
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String palindrome = input.nextLine();
		boolean isPlindrom = true;
		for (int i = 0; i < palindrome.length() / 2; i++) {
			if (palindrome.charAt(i) != palindrome.charAt(palindrome.length()
					- 1 - i)) {
				isPlindrom = false;
				break;
			}
		}
		System.out
				.println(isPlindrom ? "The word you've entered is a palindrome!"
						: "The word you've entered is not a palindrome!");
	}
}
