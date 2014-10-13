package _07_Methods_Recursion;

import java.util.Scanner;

public class _02_v2 {

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
			System.out.println(result(convertString(romanNum)));
		}
	}

	public static String convertString(String roman) {
		String convertedString = roman.replaceAll("CM", "A")
				.replaceAll("M", "B").replaceAll("CD", "E")
				.replaceAll("M", "B").replaceAll("D", "F")
				.replaceAll("XL", "G").replaceAll("XC", "H")
				.replaceAll("L", "J").replaceAll("C", "K")
				.replaceAll("IV", "N").replaceAll("IX", "O")
				.replaceAll("V", "P").replaceAll("X", "Q").replaceAll("I", "R");
		return convertedString;
	}

	public static int result(String converted) {
		int result = 0;
		for (int i = 0; i < converted.length(); i++) {
			result += convertCharToNum(converted.charAt(i));
		}
		return result;
	}

	private static int convertCharToNum(char charAt) {
		switch (charAt) {
		case 'A':
			return 900;
		case 'B':
			return 1000;
		case 'E':
			return 400;
		case 'F':
			return 500;
		case 'G':
			return 40;
		case 'H':
			return 90;
		case 'J':
			return 50;
		case 'K':
			return 100;
		case 'N':
			return 4;
		case 'O':
			return 9;
		case 'P':
			return 5;
		case 'Q':
			return 10;
		case 'R':
			return 1;
		default:
			return 0;
		}
	}
}
