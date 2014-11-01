package _26_Collections;

import _26_Collections.Company.Department;
import _26_Collections.Manager.Title;

public class Demo {

	public static void main(String[] args) {
		Company apple = new Company("Apple");

		Employee arya = new RegularEmployee("Arya", 36, 2200, "1542");
		Employee aryaClone = new RegularEmployee("Arya", 36, 2200, "1542");
		Employee aryaDiff = new RegularEmployee("Arya", 32, 2300, "1582");
		Employee jon = new RegularEmployee("Jon", 22, 2300, "1712");
		// System.out.println(arya.equals(aryaClone));
		// System.out.println(arya.hashCode());
		// System.out.println(aryaClone.hashCode());
		// System.out.println(aryaDiff.hashCode());

		apple.addEmployee(Company.Department.IT, new RegularEmployee("Marko",
				28, 2100, "1276"));
		apple.addEmployee(Company.Department.IT, new RegularEmployee("Ivo", 26,
				1600, "1298"));
		apple.addEmployee(Company.Department.IT, new RegularEmployee("Petya",
				29, 1800, "1298"));
		apple.addEmployee(Company.Department.SALES, new RegularEmployee(
				"Marki", 24, 1890, "1507"));
		apple.addEmployee(Company.Department.SALES, arya);
		apple.addEmployee(Company.Department.SALES, aryaDiff);
		apple.addEmployee(Company.Department.MARKETING, new RegularEmployee(
				"Bobi", 25, 1400, "1910"));
		apple.addEmployee(Company.Department.MARKETING, jon);

		System.out.println("Employees:");
		apple.printEmployees();
		System.out.println();

		System.out.println("Employees by age: ");
		apple.printEmployeesByAge();
		System.out.println();

		System.out.println("Employees by name: ");
		apple.printEmployeesByName();
		System.out.println();

		System.out.println("Employees sorted by name:");
		for (Employee employee : apple.sortedEmployeesByName()) {
			System.out.println(employee);
		}
		System.out.println();

		System.out.println("Unique employees:");
		for (Employee employee : apple.uniqueEmployees()) {
			System.out.println(employee);
		}
		System.out.println();

		// Here we use TreeMap in order months to be sorted
		System.out.println("Salaries per month:");
		arya.addMonthSalary(Month.AUGUST, 950);
		arya.addMonthSalary(Month.AUGUST, 1360);
		arya.addMonthSalary(Month.APRIL, 1600);
		arya.addMonthSalary(Month.JUNE, 1250);
		arya.printSalariesPerMonth();

		apple.addMonthSalary(aryaDiff, Month.FEBRUARY, 4000);
		// aryaDiff.printSalariesPerMonth();
		apple.addMonthSalary(jon, Month.MARCH, 2100);
		// jon.printSalariesPerMonth();
		apple.printSalariesPerMonthForAllEmployees();

		Employee cersei = new Manager("Cersei", 31, 6000, "0008", Title.CMO);
		apple.addEmployee(Department.SALES, cersei);
		try {
			apple.addEmployee(Department.SALES, cersei);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		apple.addEmployee(Department.MARKETING, cersei);
		apple.printEmployees();

		try {
			// There is already an employee in the company with this name and
			// age.
			apple.addEmployee(Department.SALES, arya);
			apple.addEmployee(Department.MARKETING, arya);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
