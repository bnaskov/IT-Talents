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
		IT, SALES, MARKETING
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

	void addEmployee(Department depName, Employee employee) {
		if (workers.get(depName) == null) {
			workers.put(depName, new ArrayList<Employee>());
		}

		workers.get(depName).add(employee);
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
}
