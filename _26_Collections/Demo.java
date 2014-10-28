package _26_Collections;

public class Demo {

	public static void main(String[] args) {
		Company apple = new Company("Apple");
		// add employees to it by department

		// Employee arya = new Employee("Arya", 36, 2200, "1542");
		// Employee arya1 = new Employee("Arya", 36, 2300, "1582");
		// Employee arya2 = new Employee("Aryaa", 36, 2300, "1582");
		// System.out.println(arya.equals(arya1));
		// System.out.println(arya.hashCode());
		// System.out.println(arya1.hashCode());
		// System.out.println(arya2.hashCode());

		apple.addEmployee(Company.Department.IT, new Employee("Marko", 28,
				2100, "1276"));
		apple.addEmployee(Company.Department.IT, new Employee("Ivo", 26, 1600,
				"1298"));
		apple.addEmployee(Company.Department.IT, new Employee("Petya", 29,
				1800, "1298"));
		apple.addEmployee(Company.Department.SALES, new Employee("Marki", 24,
				1890, "1507"));
		apple.addEmployee(Company.Department.SALES, new Employee("Arya", 32,
				2200, "1542"));
		apple.addEmployee(Company.Department.SALES, new Employee("Arya", 36,
				2200, "1542"));
		apple.addEmployee(Company.Department.SALES, new Employee("Arya", 36,
				2200, "1542"));
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
	}
}
