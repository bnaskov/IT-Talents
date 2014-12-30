package _03_Arrays;

import java.util.Scanner;

// Да се състави програма, която чете от клавиатурата число К и след това поредица от числа, 
// докато сбора им не стане по-голям или равен на K, след което извежда на конзолата броя на
// въведените след K числа и средно аритметичното на сумата им

public class _11_ {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number K: ");
		double k = input.nextInt();
		double sum = 0;
		int counter = 0;
		while (sum < k) {
			System.out.println("Please enter a number: ");
			double num = input.nextInt();
			sum += num;
			counter++;
		}
		System.out.println("You've entered " + counter + " numbers.");
		System.out.printf("Average: %.2f%n", (sum / counter));
	}
}
