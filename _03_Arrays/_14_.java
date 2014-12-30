package _03_Arrays;

import java.util.Scanner;

/* На състезание по вдигане на тежести при равни резултати се класира по-лекия сътезател. Напишете програма, 
 * която да приема от клавиатурата брой на състезателите , резултат и тегло на сътезателя и 
 * извежда поредния номер на победителя в състезанието.*/

public class _14_ {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of players: ");
		int numPlayers = input.nextInt();
		int maxScore = 0;
		double tempWeight = 0;
		int winner = 0;
		for (int i = 1; i <= numPlayers; i++) {
			System.out
					.println("Please enter the score and the weight of the player: ");
			int score = input.nextInt();
			double weight = input.nextDouble();

			if (score > maxScore) {
				maxScore = score;
				winner = i;
				tempWeight = weight;
			}
			if (score == maxScore && weight < tempWeight) {
				winner = i;
			}
		}
		System.out.println("The number of the winner is: " + winner);

	}

}
