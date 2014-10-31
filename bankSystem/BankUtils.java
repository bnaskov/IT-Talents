package bankSystem;

public class BankUtils {
	public static double calculateCreditMontlyPayment(Credit credit) {
		double monthlyPayment = credit.getInitialMoney()
				* (credit.getPeriod() / 12) * (1 + credit.getInterestRate())
				/ credit.getPeriod();

		return monthlyPayment;
	}
}
