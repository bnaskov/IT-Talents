package _03_Arrays;

import java.util.Scanner;

// Да се състави програма която да чете числа от клавиатурата до въвеждане на отрицателно число 
// и отпечатва броя на четните числа без отрицателното.

public class _04_ {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int counter = 0;
		while (true) {
			System.out.println("Please enter a number n: ");
			int n = input.nextInt();
			if (n < 0) {
				break;
			}
			if (n % 2 != 0 || n == 0) {
				System.out.println("The number of odd numbers is: " + counter);
				continue;
			}
			counter++;
			System.out.println("The number of odd numbers is: " + counter);
		}
		System.out.println("The number of odd numbers is: " + counter);

	}

}
