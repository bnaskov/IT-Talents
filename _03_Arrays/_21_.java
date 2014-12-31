package _03_Arrays;

import java.util.Scanner;

public class _21_ {
	/*
	 * Да се направи обратната на първата - потребителя си намисля число от 1 до
	 * 100, а програма го пита за разни числа и потребителя отговаря с < или >.
	 * Целта е с минимален брой ходове да се познае намисленото.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String answer;
		int start = 1;
		int end = 100;
		int numGuesses = 0;
		int aiGuess;
		while (true) {
			aiGuess = start + (end - start) / 2;
			System.out.println(aiGuess);
			answer = input.nextLine();
			numGuesses++;
			if (answer.equals("yes")) {
				System.out
						.printf("Congratulations! You've managed to guess the number in %d attempts.",
								numGuesses);
				break;
			}
			if (answer.equals(">")) {
				end = aiGuess;
			} else if (answer.equals("<")) {
				start = aiGuess;
			}
		}
	}
}
