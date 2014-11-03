package bankSystem;

public class Deposit extends BankProduct {

	public Deposit(String name, double interestRate, int period) {
		super(name, interestRate, period);
	}

	@Override
	public String toString() {
		return String
				.format("%s, interest rate: %.2f%%, period: %d months, initial amount %.2fBGN, monthly payment: %.2fBGN",
						this.getName(), this.getInterestRate(),
						this.getPeriod(), this.getInitialMoney(),
						this.getMonthlyPayment());
	}
}
