package _07_Methods_Recursion;

import java.util.Scanner;

public class _02_ {
	/*
	 * Write a function to convert Roman Number in Decimal Format
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out
					.println("Enter a roman number, that you want to convert to arabic: ");
			String romanNum = input.nextLine().toUpperCase();
			// type in "END" if you want to exit
			if (romanNum.equals("END")) {
				break;
			}
			System.out.println(calculateResult(romanNum));
		}
	}

	public static int convertLetter(char letter) {
		switch (letter) {
		case 'M':
			return 1000;
		case 'D':
			return 500;
		case 'C':
			return 100;
		case 'L':
			return 50;
		case 'X':
			return 10;
		case 'V':
			return 5;
		case 'I':
			return 1;
		default:
			return 0;
		}
	}

	public static int calculateResult(String romanNum) {
		int result = 0;
		// loops through the string
		for (int i = 0; i < romanNum.length() - 1; i++) {
			if (convertLetter(romanNum.charAt(i)) < convertLetter(romanNum
					.charAt(i + 1))) {
				result -= convertLetter(romanNum.charAt(i));
			} else {
				result += convertLetter(romanNum.charAt(i));
			}
		}
		// adds the last char of the string
		result += convertLetter(romanNum.charAt(romanNum.length() - 1));
		return result;
	}

}
