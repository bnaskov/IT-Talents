package _06_Strings;

import java.util.Scanner;

public class _02_ {
	/*
	 * Напишете програма, която отпечатва на екрана инициалите на името ви.
	 * Въведете името си от клавиатурата.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out
				.println("Please enter your full and your last name separated by a space: ");
		String name = input.nextLine();
		int space = name.indexOf(" ");
		System.out.println(name.charAt(0) + "." + name.charAt(space + 1) + ".");

	}

}
