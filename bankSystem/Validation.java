package bankSystem;

public class Validation {
	public static void name(String name) {
		if (name.length() < 2) {
			throw new IllegalArgumentException(
					"Product name must be at least 2 symbols.");
		}
	}

	public static void interestRate(double interestRate) {
		if (interestRate <= 0) {
			throw new IllegalArgumentException(
					"Interest rate must be a positive number.");
		}
	}

	public static void productPeriod(int productPeriod) {
		if (productPeriod < 1 || productPeriod > 60) {
			throw new IllegalArgumentException(
					"Product period must be between 1 and 60 months.");
		}
	}
}
