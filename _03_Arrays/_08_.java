package _03_Arrays;

import java.util.Scanner;

// Дадени са 2 еднакви непрозрачни линийки. По дължината на всяка, на равни интервали дена от друга,
// на еднакво разстояние от ръба са пробити дупки. Дупките започват от 0-левото деление. 
// Разстоянието м/у дупките е M милиметра за 1-та линийка и N милиметра за другата. 
// Дължината на линийките е L . М, N и L се въвеждат от клавиатурата. 
// Да се изведе колко дупки ще се съвпадат , ако линийките се поставят една в/у друга.

public class _08_ {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number M: ");
		int m = input.nextInt();
		System.out.println("Please enter a number N: ");
		int n = input.nextInt();
		System.out.println("Please enter a number L: ");
		int l = input.nextInt();
		int counter = 0;
		if (m > n) {
			m = n + m;
			n = m - n;
			m = m - n;
		}
		int dif = n / m;

		for (int i = 0, j = 0; i <= l; i += n, j += dif * m) {
			if (i == j) {
				counter++;
			}
		}
		System.out.println(counter);

	}

}
