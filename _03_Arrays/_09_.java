package _03_Arrays;

import java.util.Scanner;

// Да се напише програма , която при въедени 2 числа М и N извежда на конзолата всички числа 
// в интервала между тях, които се делят на :
// 1. 3 
// 2. 2 
// 3. 5

public class _09_ {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number M: ");
		int m = input.nextInt();
		System.out.println("Please enter a number N: ");
		int n = input.nextInt();
		if (m > n) {
			m = n + m;
			n = m - n;
			m = m - n;
		}
		String dev3 = "Dev by 3:";
		String dev2 = "Dev by 2:";
		String dev5 = "Dev by 5:";
		for (int i = m; i <= n; i++) {
			if (i % 3 == 0) {
				dev3 += (" " + i);
			}
			if (i % 2 == 0) {
				dev2 += (" " + i);
			}
			if (i % 5 == 0) {
				dev5 += (" " + i);
			}
		}
		System.out.println(dev3);
		System.out.println(dev2);
		System.out.println(dev5);

	}

}
