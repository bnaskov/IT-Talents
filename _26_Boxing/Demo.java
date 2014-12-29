package _26_;

public class Demo {

	public static void main(String[] args) {
		Company apple = new Company("Apple");
		//add employees to it by department
		apple.addEmployee(Company.Department.IT, new Employee("Marko", 28, 2100, "1276"));
		apple.addEmployee(Company.Department.IT, new Employee("Ivo", 26, 1600, "1298"));
		apple.addEmployee(Company.Department.IT, new Employee("Petya", 29, 1800, "1298"));
		apple.addEmployee(Company.Department.SALES, new Employee("Marki", 24, 1890, "1507"));
		apple.addEmployee(Company.Department.SALES, new Employee("Chochi", 32, 2200, "1542"));
		apple.addEmployee(Company.Department.MARKETING, new Employee("Bobi", 25, 1400, "1910"));
		//print employees
		// apple.printEmployees();
		// apple.printEmployeesByAge();
		apple.printEmployeesByName();

	}

}
