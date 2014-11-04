package betterBankSystem;

import java.util.ArrayList;

public class Client {
	private String name;
	private String address;
	private double availableMoney;
	private double monthSalary;
	protected ArrayList<Deposit> deposits;
	protected ArrayList<Credit> credits;

	public Client(String name, String address, double availableMoney,
			double monthSalary) {
		super();
		this.setName(name);
		this.setAddress(address);
		this.setAvailableMoney(availableMoney);
		this.setMonthSalary(monthSalary);
		this.deposits = new ArrayList();
		this.credits = new ArrayList();
	}

	private void setName(String name) {
		Validation.name(name);
		this.name = name;
	}

	private void setAddress(String address) {
		Validation.address(address);
		this.address = address;
	}

	protected void setAvailableMoney(double availableMoney) {
		this.availableMoney = availableMoney;
	}

	private void setMonthSalary(double monthSalary) {
		Validation.salary(monthSalary);
		this.monthSalary = monthSalary;
	}

	protected void addDeposit(Deposit deposit) {
		Validation.bankProduct(deposit);
		this.deposits.add(deposit);
	}

	protected void addCredit(Credit credit) {
		Validation.bankProduct(credit);
		this.credits.add(credit);
	}

	protected double getMonthSalary() {
		return this.monthSalary;
	}

	protected double getAvailableMoney() {
		return availableMoney;
	}

	public void openDeposit(Bank bank, Deposit deposit, double depositAmount) {
		Validation.bank(bank);
		Validation.bankProduct(deposit);
		Validation.moneyAmounth(depositAmount);

		bank.addClient(this, deposit, depositAmount);
	}

	public void takeCredit(Bank bank, Credit credit, double creditAmount,
			int period) {
		Validation.bank(bank);
		Validation.bankProduct(credit);
		Validation.moneyAmounth(creditAmount);
		Validation.productPeriod(period);

		bank.addClient(this, credit, creditAmount, period);
	}

	public void payCreditsMonthlyPayment(Bank bank) {
		bank.acceptCreditPayment(this);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Client) {
			Client client = (Client) obj;
			return this.name.equals(client.name)
					&& this.address.equals(client.address);
		}

		return false;
	}

	@Override
	public int hashCode() {
		int hashCode = this.name.hashCode() ^ this.address.hashCode();
		return super.hashCode();
	}

	@Override
	public String toString() {
		StringBuilder output = new StringBuilder();
		output.append(String.format(
				"Client name: %s, available money: %.2f, month salary: %.2f%n",
				this.name, this.availableMoney, this.monthSalary));
		if (!this.deposits.isEmpty()) {
			output.append("Deposits: \n");
			for (Deposit deposit : this.deposits) {
				output.append(deposit);
				output.append("\n");
			}
		}
		if (!this.credits.isEmpty()) {
			output.append("Credits: \n");
			for (Credit credit : this.credits) {
				output.append(credit);
				output.append("\n");
			}
		}

		return output.toString();
	}
}
