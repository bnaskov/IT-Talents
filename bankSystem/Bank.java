package bankSystem;

import java.util.ArrayList;

public class Bank<B extends BankProduct> {
	private final double RESERVE_PERCENT = 0.90;
	private final double ADMISSIBLE_PERCENT = 0.5;

	private String name;
	private String address;
	private ArrayList<B> bankProducts;
	private double availableMoney;

	public Bank(String name, String address) {
		super();
		this.name = name;
		this.address = address;
		this.bankProducts = new ArrayList<>();
	}

	public void addBankProduct(B bankProduct, double amount, Client client) {

		if (bankProduct instanceof Deposit) {
			if (amount > client.getAvailableMoney()) {
				throw new IllegalArgumentException(
						"DEposit amount is bigger than client's available money.");
			}
			bankProducts.add(bankProduct);
			bankProduct.setInitialMoney(amount);
			client.setAvailableMoney(client.getAvailableMoney() - amount);
			this.availableMoney += amount;
		} else if (bankProduct instanceof Credit) {
			if (amount > this.getBankReserve()) {
				throw new IllegalArgumentException(
						"The requested amount is more than the bank rezerve.");
			}
			if (bankProduct.getMonthlyPayment() > client.getMonthSalary()
					/ ADMISSIBLE_PERCENT) {
				throw new IllegalArgumentException(
						"The requested amount is more than 50% of client monthly salary.");
			}
			bankProducts.add(bankProduct);
			this.availableMoney -= amount;
		}
	}

	private double getBankReserve() {
		double reserveAmount = RESERVE_PERCENT * availableMoney;
		return reserveAmount;
	}

	@Override
	public String toString() {
		return String.format("Money in bank: %.2f, bank reserve: %.2f",
				this.availableMoney, this.getBankReserve());
	}
}
