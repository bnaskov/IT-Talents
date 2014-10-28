package _26_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

public class Company {
	private String name;
	private HashMap<Department, ArrayList<Employee>> workers;

	enum Department {
		IT, SALES, MARKETING, HR
	};

	public Company(String name) {
		this.setName(name);
		this.workers = new HashMap<Department, ArrayList<Employee>>();
	}

	public String getName() {
		return this.name;
	}

	private void setName(String name) {
		if (name.length() < 2) {
			throw new IllegalArgumentException(
					"Company name must be at least 2 symbols.");
		}

		this.name = name;
	}

	void addEmployee(Department departament, Employee employee) {
		Validation.ValidateDepartament(departament);
		Validation.ValidateEmployee(employee);

		if (workers.get(departament) == null) {
			workers.put(departament, new ArrayList<Employee>());
		}

		if (employee instanceof RegularEmployee) {
			boolean employeeExist = false;
			for (Department dep : workers.keySet()) {
				if (workers.get(dep).contains(employee)) {
					employeeExist = true;
					break;
				}
			}
			if (employeeExist) {
				throw new IllegalArgumentException(
						"There is already an employee in the company with this name and age.");
			} else {
				workers.get(departament).add(employee);
			}
		} else if (employee instanceof Manager) {
			if (!workers.get(departament).contains(employee)) {
				workers.get(departament).add(employee);
			} else {
				throw new IllegalArgumentException(
						"There is already a manager in the departament with this name and age.");
			}
		} else {
			throw new IllegalArgumentException(
					"There is no such type of employee in the company.");
		}
	}

	void printEmployees() {
		for (Department dep : workers.keySet()) {
			System.out.println(dep + ":");
			for (Employee employee : workers.get(dep)) {
				System.out.println(employee);
			}
		}
	}

	void printEmployeesByAge() {
		for (Department d : workers.keySet()) {
			Collections.sort(workers.get(d), new Comparator<Employee>() {

				@Override
				public int compare(Employee o1, Employee o2) {

					return o1.getAge() - o2.getAge();
				}
			});
		}

		printEmployees();
	}

	void printEmployeesBySalary() {
		for (Department d : workers.keySet()) {
			Collections.sort(workers.get(d), new Comparator<Employee>() {

				@Override
				public int compare(Employee o1, Employee o2) {
					int compareBySalary = (int) (o1.getSalary() - o2
							.getSalary());
					return compareBySalary;
				}
			});
		}

		printEmployees();
	}

	void printEmployeesByName() {
		for (Department d : workers.keySet()) {
			Collections.sort(workers.get(d));
		}

		printEmployees();
	}

	ArrayList<Employee> sortedEmployeesByName() {
		ArrayList<Employee> allEmployees = new ArrayList<Employee>();
		for (Department dep : workers.keySet()) {
			allEmployees.addAll(workers.get(dep));
		}

		Collections.sort(allEmployees);

		return allEmployees;
	}

	HashSet<Employee> uniqueEmployees() {
		HashSet<Employee> allEmployees = new HashSet<Employee>();
		for (Department dep : workers.keySet()) {
			allEmployees.addAll(workers.get(dep));
		}

		return allEmployees;
	}

	// maybe it's not a good option, coupling occurs
	public void addMonthSalary(Employee employee, Month month,
			double monthSalary) {
		Validation.ValidateEmployee(employee);
		Validation.ValidateMonth(month);
		Validation.ValidateSalary(monthSalary);

		boolean employeeExist = false;
		for (Department dep : workers.keySet()) {
			if (workers.get(dep).contains(employee)) {
				employeeExist = true;
				break;
			}
		}

		if (employeeExist) {
			employee.addMonthSalary(month, monthSalary);
		} else {
			throw new IllegalArgumentException(
					"There is no such employee in the company.");
		}
	}

	public void printSalariesPerMonthForAllEmployees() {
		for (Employee employee : this.uniqueEmployees()) {
			if (!employee.getSalaryPerMonth().isEmpty()) {
				System.out.println("Employee name: " + employee.getName());
				System.out.println("Salary per month: ");
				for (Month month : employee.getSalaryPerMonth().keySet()) {
					System.out.println(month + " : "
							+ employee.getSalaryPerMonth().get(month));
				}
				System.out.println("----------");
			}
		}
	}
}
