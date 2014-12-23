package _17_OOP;

public class Employee extends Person {
	private double daySalary;

	public Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		this.daySalary = daySalary;
	}

	protected double getDaySalary() {
		return this.daySalary;
	}

	protected void setDaySalary(double daySalary) {
		if (daySalary >= 0) {
			this.daySalary = daySalary;
		} else {
			throw new IllegalArgumentException(
					"The salary cannot be a negative number!");
		}
	}

	protected double calculateOvertime(double hours) {
		if (this.getAge() >= 18) {
			double overtimePay = hours * (this.getDaySalary() / 8 * 1.5);
			return overtimePay;
		}

		return 0;
	}

	protected void showEmployeeInfo() {
		System.out.printf(
				"Name: %s, age: %d, isMale: %b, daily salary: %.2f%n",
				this.getName(), this.getAge(), this.isMale(),
				this.getDaySalary());
	}
}
