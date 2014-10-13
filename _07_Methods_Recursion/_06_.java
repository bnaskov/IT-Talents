package _07_Methods_Recursion;

import java.util.Scanner;

public class _06_ {
	/* Write a recursive function to find the simple fraction */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a fraction ex(18/42): ");
		String strInput = input.nextLine();
		String[] numbers = strInput.split("/");
		int num1 = Integer.parseInt(numbers[0]);
		int num2 = Integer.parseInt(numbers[1]);
		System.out.println("The simple franction is: " + num1
				/ findGCD(num1, num2) + "/" + num2 / findGCD(num1, num2));
	}

	public static int findGCD(int num1, int num2) {
		if (num2 == 0) {
			return num1;
		} else {
			return findGCD(num2, num1 % num2);
		}
	}

}
