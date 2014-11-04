package betterBankSystem;

public class Validation {
	public static void name(String name) {
		if (name.length() < 2) {
			throw new IllegalArgumentException(
					"Name must be at least 2 symbols.");
		}
	}

	public static void address(String address) {
		if (address.length() < 5) {
			throw new IllegalArgumentException(
					"Client address must be at least 5 symbols.");
		}
	}

	public static void interestRate(double interestRate) {
		if (interestRate <= 0) {
			throw new IllegalArgumentException(
					"Interest rate must be a positive number.");
		}
	}

	public static void salary(double salary) {
		if (salary < 0) {
			throw new IllegalArgumentException(
					"Salary must be a positive number.");
		}
	}

	public static void moneyAmounth(double moneyAmounth) {
		if (moneyAmounth < 0) {
			throw new IllegalArgumentException(
					"Money must be a positive number.");
		}
	}

	public static void productPeriod(int productPeriod) {
		if (productPeriod < 1 || productPeriod > 60) {
			throw new IllegalArgumentException(
					"Bank product period must be between 1 and 60 months.");
		}
	}

	public static void bankProduct(BankProduct bankproduct) {
		if (bankproduct == null) {
			throw new IllegalArgumentException(
					"Please enter a valid bank product.");
		}
	}

	public static void bank(Bank bank) {
		if (bank == null) {
			throw new IllegalArgumentException("Please enter a valid bank.");
		}
	}
}
