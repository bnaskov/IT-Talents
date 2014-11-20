package _09_Heap;

import java.util.Scanner;

public class _09_Heap {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of the shops: ");
		int num = input.nextInt();
		while (num <= 0) {
			System.out
					.println("Invalid input! The number must be greater than 0!");
			num = input.nextInt();
		}

		// in the "sales" array we use the index as the number of the shop and
		// the value of this index for the sales
		int[] sales = new int[num + 1];
		String[] userInput = new String[2];

		input.nextLine();
		String data = "";
		while (true) {
			System.out
					.println("Please enter \"1\" to add a new shop and sales. \"2\" for a report. \"0\" to exit.");
			data = input.nextLine();
			if (data.equals("0")) {
				break;
			} else if (data.equals("1")) {
				System.out
						.println("Please enter the number of the shop and its sales.");
				String shopAndSale = input.nextLine();
				userInput = shopAndSale.split(" ");
				sales[Integer.parseInt(userInput[0])] += Integer
						.parseInt(userInput[1]);
			} else if (data.equals("2")) {
				System.out
						.println("Please enter the range of shops (ex: 1 3): ");
				String rangeOfShops = input.nextLine();
				userInput = rangeOfShops.split(" ");
				int revenue = 0;
				for (int i = Integer.parseInt(userInput[0]); i <= Integer
						.parseInt(userInput[1]); i++) {
					revenue += sales[i];
				}
				System.out
						.println("The revenue for these shops is: " + revenue);
			} else {
				System.out.println("Invalid input.");
			}
		}

	}

}
