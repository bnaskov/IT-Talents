package betterBankSystem;

public abstract class BankProduct {
	private String name;
	private double interestRate;
	private int productPeriod;
	private double initialMoney;
	private double monthlyPayment;
	protected int monthsLeft;

	public BankProduct(String name, double interestRate, int period) {
		super();
		this.setName(name);
		this.setInterestRate(interestRate);
		this.setPeriod(period);
		this.monthsLeft = period;
	}

	protected String getName() {
		return this.name;
	}

	private void setName(String name) {
		Validation.name(name);
		this.name = name;
	}

	protected double getInterestRate() {
		return this.interestRate;
	}

	protected void setInterestRate(double interestRate) {
		Validation.interestRate(interestRate);
		this.interestRate = interestRate;
	}

	protected int getPeriod() {
		return this.productPeriod;
	}

	protected void setPeriod(int productPeriod) {
		Validation.productPeriod(productPeriod);
		this.productPeriod = productPeriod;
	}

	public double getInitialMoney() {
		return initialMoney;
	}

	public void setInitialMoney(double initialMoney) {
		this.initialMoney = initialMoney;
	}

	protected double getMonthlyPayment() {
		return this.monthlyPayment;
	}

	protected void setMonthlyPayment(double monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}

	@Override
	public String toString() {
		return String
				.format("%s, interest rate: %.2f%%, period: %d months, initial amount %.2fBGN, monthly payment: %.2fBGN, months left: %d",
						this.getName(), this.getInterestRate(),
						this.getPeriod(), this.getInitialMoney(),
						this.getMonthlyPayment(), this.monthsLeft);
	}
}
