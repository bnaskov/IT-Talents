package _06_Strings;

import java.util.Scanner;

public class _04_ {
	/*
	 * Напишете програма, която брои колко пъти се среща всяка английска буква в
	 * даден символен низ. Запазете резултатите в масив.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter text: ");
		String text = input.nextLine().toLowerCase();
		int[] alphabet = new int[26];
		for (int i = 0; i < text.length(); i++) {
			if ((int) text.charAt(i) >= 97 && (int) text.charAt(i) <= 122) {
				alphabet[(int) text.charAt(i) - 97]++;
			}
		}
		for (int i = 0; i < alphabet.length; i++) {
			if (alphabet[i] > 0) {
				System.out.println((char) (i + 97) + " -> " + alphabet[i]);
			}
		}
	}
}
