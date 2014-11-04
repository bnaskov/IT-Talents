package betterBankSystem;

public class Credit extends BankProduct {
	private final static int DEFAULT_CREDIT_PERIOD = 6;

	public Credit(String name, double interestRate) {
		super(name, interestRate, DEFAULT_CREDIT_PERIOD);
		this.setMonthlyPayment(BankUtils.calculateCreditMontlyPayment(this));
	}
}
