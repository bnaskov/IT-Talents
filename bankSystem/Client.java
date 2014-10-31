package bankSystem;

import java.util.ArrayList;

public class Client {
	private String name;
	private String address;
	private double availableMoney;
	private double monthSalary;
	ArrayList<Deposit> deposits;
	ArrayList<Credit> credits;

	public Client(String name, String address, double availableMoney,
			double monthSalary) {
		super();
		this.name = name;
		this.address = address;
		this.availableMoney = availableMoney;
		this.monthSalary = monthSalary;
		this.deposits = new ArrayList();
		this.credits = new ArrayList();
	}

	public double getMonthSalary() {
		return this.monthSalary;
	}

	public void openDeposit(Bank bank, Deposit deposit, double depositAmount) {
		// TOTO validation

		bank.addBankProduct(deposit, depositAmount, this);
		this.deposits.add(deposit);
	}

	public double getAvailableMoney() {
		return availableMoney;
	}

	public void setAvailableMoney(double availableMoney) {
		this.availableMoney = availableMoney;
	}

	@Override
	public String toString() {
		StringBuilder output = new StringBuilder();
		output.append(String.format(
				"Client name: %s, available money: %.2f, month salary: %.2f%n",
				this.name, this.availableMoney, this.monthSalary));
		if (!this.deposits.isEmpty()) {
			output.append("Deposits: ");
			for (Deposit deposit : this.deposits) {
				output.append(deposit);
			}
			output.append("\n");
		}
		if (!this.credits.isEmpty()) {
			output.append("Credits: ");
			for (Credit credit : this.credits) {
				output.append(credit);
			}
			output.append("\n");
		}

		return output.toString();
	}
}
