package betterBankSystem;

public class BankUtils {
	private static final double monthsPerYear = 12.0;

	public static double calculateCreditMontlyPayment(Credit credit) {
		double creditInterest = credit.getInitialMoney()
				* (credit.getPeriod() / monthsPerYear)
				* credit.getInterestRate() / 100;
		double totalMoneyClientMustReturn = credit.getInitialMoney()
				+ creditInterest;
		// System.out.println(totalMoneyClientMustReturn);
		double monthlyPayment = totalMoneyClientMustReturn / credit.getPeriod();

		return monthlyPayment;
	}

	public static double calculateDepositMontlyPayment(Deposit deposit) {
		double depositInterest = deposit.getInitialMoney()
				* (deposit.getPeriod() / monthsPerYear)
				* deposit.getInterestRate() / 100;
		double monthlyPayment = depositInterest / deposit.getPeriod();

		return monthlyPayment;
	}
}
