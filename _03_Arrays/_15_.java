package _03_Arrays;

import java.util.Scanner;

/*Напишете програма, която при въвеждане на дадено цяло число извежда цифрите му в обратен ред на конзолата.*/

public class _15_ {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = input.nextInt();
		while (num != 0) {
			int tempNum = num % 10;
			num = num / 10;
			System.out.print(tempNum);
		}
	}
}
