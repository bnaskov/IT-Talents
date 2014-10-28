package _26_Collections;

public class Demo {

	public static void main(String[] args) {
		Company apple = new Company("Apple");
		// add employees to it by department

		Employee arya = new Employee("Arya", 36, 2200, "1542");
		Employee aryaClone = new Employee("Arya", 36, 2200, "1542");
		Employee aryaDiff = new Employee("Arya", 32, 2300, "1582");
		// System.out.println(arya.equals(aryaClone));
		// System.out.println(arya.hashCode());
		// System.out.println(aryaClone.hashCode());
		// System.out.println(aryaDiff.hashCode());

		apple.addEmployee(Company.Department.IT, new Employee("Marko", 28,
				2100, "1276"));
		apple.addEmployee(Company.Department.IT, new Employee("Ivo", 26, 1600,
				"1298"));
		apple.addEmployee(Company.Department.IT, new Employee("Petya", 29,
				1800, "1298"));
		apple.addEmployee(Company.Department.SALES, new Employee("Marki", 24,
				1890, "1507"));
		apple.addEmployee(Company.Department.SALES, arya);
		apple.addEmployee(Company.Department.SALES, arya);
		apple.addEmployee(Company.Department.SALES, aryaDiff);
		apple.addEmployee(Company.Department.MARKETING, new Employee("Bobi",
				25, 1400, "1910"));
		// print employees
		// apple.printEmployees();
		// apple.printEmployeesByAge();
		// apple.printEmployeesByName();
		// System.out.println("Employees sorted by name:");
		// for (Employee employee : apple.sortedEmployeesByName()) {
		// System.out.println(employee);
		// }
		//
		System.out.println();
		System.out.println("Unique employees:");
		for (Employee employee : apple.uniqueEmployees()) {
			System.out.println(employee);
		}

		System.out.println();

		// Here we use TreeMap in order months to be sorted
		arya.addMonthSalary(Month.AUGUST, 950);
		arya.addMonthSalary(Month.AUGUST, 1360);
		arya.addMonthSalary(Month.APRIL, 1600);
		arya.addMonthSalary(Month.JUNE, 1250);
		arya.printSalariesPerMonth();
	}
}
