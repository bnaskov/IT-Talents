package bankSystem;

public abstract class BankProduct {
	private String name;
	private double interestRate;
	private int productPeriod;
	private double initialMoney;
	private double monthlyPayment;

	public BankProduct(String name, double interestRate, int period) {
		super();
		this.setName(name);
		this.setInterestRate(interestRate);
		this.setPeriod(period);
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
}
