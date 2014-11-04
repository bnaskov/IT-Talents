package betterBankSystem;

import java.util.HashSet;

public class Bank {
	private static final double RESERVE_PERCENT = 0.90;
	private static final double ADMISSIBLE_PERCENT = 0.5;

	private String name;
	private String address;
	private HashSet<Client> clients;
	private double availableMoney;

	public Bank(String name, String address) {
		super();
		this.setName(name);
		this.setAddress(address);
		this.clients = new HashSet();
	}

	private double getBankReserve() {
		double reserveAmount = RESERVE_PERCENT * availableMoney;
		return reserveAmount;
	}

	private void setName(String name) {
		Validation.name(name);
		this.name = name;
	}

	private void setAddress(String address) {
		Validation.address(address);
		this.address = address;
	}

	protected void addClient(Client client, Deposit deposit,
			double depositAmount) {
		if (depositAmount > client.getAvailableMoney()) {
			throw new IllegalArgumentException(
					"Deposit amount is bigger than client's available money.");
		}
		deposit.setInitialMoney(depositAmount);
		double monthlyPayment = BankUtils
				.calculateDepositMontlyPayment(deposit);
		deposit.setMonthlyPayment(monthlyPayment);
		client.addDeposit(deposit);
		client.setAvailableMoney(client.getAvailableMoney() - depositAmount);
		this.clients.add(client);
		this.availableMoney += depositAmount;
	}

	protected void addClient(Client client, Credit credit, double creditAmount,
			int period) {
		if (creditAmount > this.getBankReserve()) {
			throw new IllegalArgumentException(
					"The requested amount is more than the bank reserve.");
		}
		credit.setInitialMoney(creditAmount);
		credit.setPeriod(period);
		double monthlyPayment = BankUtils.calculateCreditMontlyPayment(credit);
		// cumulativeMonthlyPayment is the sum of all credit payments that the
		// client has
		double cumulativeMonthlyPayment = monthlyPayment;
		for (Credit cr : client.credits) {
			cumulativeMonthlyPayment += credit.getMonthlyPayment();
		}
		if (cumulativeMonthlyPayment > client.getMonthSalary()
				* ADMISSIBLE_PERCENT) {
			throw new IllegalArgumentException(
					"The requested amount is more than 50% of client monthly salary.");
		}
		credit.setMonthlyPayment(monthlyPayment);
		client.addCredit(credit);
		client.setAvailableMoney(client.getAvailableMoney() + creditAmount);
		this.clients.add(client);
		this.availableMoney -= creditAmount;
	}

	protected void payDepositInterest() {
		for (Client client : this.clients) {
			for (int i = 0; i < client.deposits.size(); i++) {
				Deposit deposit = client.deposits.get(i);
				if (deposit.monthsLeft != 1) {
					client.setAvailableMoney(client.getAvailableMoney()
							+ deposit.getMonthlyPayment());
					deposit.monthsLeft -= 1;
				} else {
					client.setAvailableMoney(client.getAvailableMoney()
							+ deposit.getMonthlyPayment());
					client.setAvailableMoney(client.getAvailableMoney()
							+ deposit.getInitialMoney());
					client.deposits.remove(deposit);
					if (client.deposits.size() == 0) {
						break;
					}
					i--;
				}
			}
		}
	}

	public void acceptCreditPayment(Client client) {
		if (!this.clients.contains(client)) {
			throw new IllegalArgumentException(
					"There is no such client in the bank.");
		}
		for (int i = 0; i < client.credits.size(); i++) {
			Credit credit = client.credits.get(i);
			if (credit.monthsLeft != 1) {
				client.setAvailableMoney(client.getAvailableMoney()
						- credit.getMonthlyPayment());
				credit.monthsLeft -= 1;
			} else {
				client.setAvailableMoney(client.getAvailableMoney()
						+ credit.getMonthlyPayment());
				client.credits.remove(credit);
				if (client.deposits.size() == 0) {
					break;
				}
				i--;
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder output = new StringBuilder();
		output.append(String.format(
				"Money in bank: %.2f, bank reserve: %.2f%n",
				this.availableMoney, this.getBankReserve()));
		for (Client client : this.clients) {
			output.append(client);
		}

		return output.toString();
	}
}
