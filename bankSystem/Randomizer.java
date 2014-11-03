package bankSystem;

import java.util.ArrayList;
import java.util.Random;

public class Randomizer {
	private static final double MIN_PERCENT_FOR_DEPOSIT = 0.80;
	private static final double MAX_PERCENT_FOR_DEPOSIT = 1;

	public static void Deposit(Bank bank, ArrayList<Client> clients) {
		for (Client client : clients) {
			double random = new Random().nextDouble();
			double depositAmount = client.getAvailableMoney()
					* (MIN_PERCENT_FOR_DEPOSIT + random
							* (MAX_PERCENT_FOR_DEPOSIT - MIN_PERCENT_FOR_DEPOSIT));
			client.openDeposit(bank, new Deposit("Short Deposit", 3, 3),
					depositAmount);
		}
	}
}
