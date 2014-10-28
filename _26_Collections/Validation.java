package _26_Collections;

import _26_Collections.Company.Department;

public class Validation {
	public static void ValidateDepartament(Department departament) {
		if (departament == null) {
			throw new NullPointerException("Please enter a valid departament");
		}
	}

	public static void ValidateEmployee(Employee employee) {
		if (employee == null) {
			throw new NullPointerException("Please enter a valid employee");
		}
	}

	public static void ValidateMonth(Month month) {
		if (month == null) {
			throw new NullPointerException("Please enter a valid month");
		}
	}

	public static void ValidateSalary(double salary) {
		if (salary < 0) {
			throw new IllegalArgumentException(
					"Salary must be a positive number.");
		}
	}
}
