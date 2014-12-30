package _03_Arrays;

import java.util.Scanner;

/*Напишете програма, която при въвеждане на дадено цяло число извежда цифрите му в обратен ред на конзолата.*/

public class _15_a {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = input.nextInt();

		int dev = 1;
		while (dev < num) {
			int digit = (num / dev) % 10;
			System.out.print(digit);
			dev *= 10;
		}
	}
}
