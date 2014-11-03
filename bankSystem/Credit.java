package bankSystem;

public class Credit extends BankProduct {
	private final static int DEFAULT_CREDIT_PERIOD = 6;

	private double moneyLeftToPay = this.getInitialMoney();

	public Credit(String name, double interestRate) {
		super(name, interestRate, DEFAULT_CREDIT_PERIOD);
		this.setMonthlyPayment(BankUtils.calculateCreditMontlyPayment(this));
	}

	public String toString() {
		return String
				.format("%s, interest rate: %.2f%%, period: %d months, initial amount %.2fBGN, monthly payment: %.2fBGN",
						this.getName(), this.getInterestRate(),
						this.getPeriod(), this.getInitialMoney(),
						this.getMonthlyPayment());
	}
}
