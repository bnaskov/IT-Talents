package _03_Arrays;

import java.util.Scanner;

public class _20_ {
	/*
	 * Да се направи програма, която генерира произволно число между 1 и 100 и
	 * пита потребителя всеки път да пробва да го познае. Когато потребителя
	 * въведе число с < или > му указва дали числото,което е въвел е съответно
	 * по-малко или по-голямо от търсенето.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int randomNum = (int) (Math.random() * 100) + 1;
		int num;
		do {
			System.out.println("Guess the number (0 < number < 101): ");
			num = input.nextInt();
			if (num > randomNum) {
				System.out.println(">");
			} else if (num < randomNum) {
				System.out.println("<");
			}
		} while (num != randomNum);
		System.out.println("You've guessed right!");
	}
}
