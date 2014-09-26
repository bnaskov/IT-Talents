package _08_09_Exam;

import java.util.Scanner;

public class _10_ {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Plaese enter a sentence: ");
		// The quick brown fox
		String[] words = input.nextLine().toLowerCase().split(" ");

		translatePigLatin(words);
	}

	private static void translatePigLatin(String[] words) {
		String tempString = "";
		String output = "";
		for (int i = 0; i < words.length; i++) {
			tempString = words[i].substring(1, words[i].length());
			tempString += words[i].substring(0, 1);
			tempString += "ay";
			output += (tempString + " ");
		}
		output = output.substring(0, 1).toUpperCase()
				+ output.substring(1, output.length() - 1);
		System.out.println(output);
	}

}
