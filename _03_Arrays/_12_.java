package _03_Arrays;

import java.util.Scanner;

/* С цел сформиране на отбори от 3-ма участници била разработена анкета с точки. 
 * За добре подбран отбор се смятал този, в който сумата на резултатите на всеки участник е кратна на 3.
 * Да се състави програма , която да приема 3-ки числа до въвеждане на 3 нули и да извежда на конзолата “Yes”, 
 * ако отборът е добре подбран и “No”, ако не е.*/

public class _12_ {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("Please enter the scores of the 3 players: ");
			int fPlayer = input.nextInt();
			int sPlayer = input.nextInt();
			int tPlayer = input.nextInt();
			if (fPlayer == 0 || sPlayer == 0 || sPlayer == 0) {
				break;
			}
			int sum = fPlayer + sPlayer + tPlayer;
			if (sum % 3 == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}
