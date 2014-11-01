package _26_Collections;

import java.util.TreeMap;

public abstract class Employee implements Comparable<Employee> {

	private String name;
	private int age;
	private double salary;
	private String id;
	private TreeMap<Month, Double> salaryPerMonth;

	public Employee(String name, int age, double salary, String id) {
		super();
		this.setName(name);
		this.setAge(age);
		this.setSalary(salary);
		this.setId(id);
		this.salaryPerMonth = new TreeMap<Month, Double>();
	}

	protected String getName() {
		return this.name;
	}

	private void setName(String name) {
		if (name.length() < 2) {
			throw new IllegalArgumentException(
					"Employee name must be at least 2 symbols.");
		}

		this.name = name;
	}

	protected int getAge() {
		return this.age;
	}

	private void setAge(int age) {
		if (age <= 0 || age > 150) {
			throw new IllegalArgumentException(
					"Employee age must be between 0 and 150.");
		}
		this.age = age;
	}

	public double getSalary() {
		return this.salary;
	}

	private void setSalary(double salary) {
		Validation.ValidateSalary(salary);
		this.salary = salary;
	}

	public String getId() {
		return this.id;
	}

	private void setId(String id) {
		if (id.length() < 2) {
			throw new IllegalArgumentException(
					"Employee id must be at least 2 symbols.");
		}

		this.id = id;
	}

	public TreeMap<Month, Double> getSalaryPerMonth() {
		return new TreeMap<>(this.salaryPerMonth);
	}

	protected void addMonthSalary(Month month, double monthSalary) {
		Validation.ValidateMonth(month);
		Validation.ValidateSalary(monthSalary);

		this.salaryPerMonth.put(month, monthSalary);
	}

	public void printSalariesPerMonth() {
		if (!this.getSalaryPerMonth().isEmpty()) {
			System.out.println("Employee name: " + this.getName());
			System.out.println("Salary per month: ");
			for (Month month : this.salaryPerMonth.keySet()) {
				System.out.println(month + " : "
						+ this.salaryPerMonth.get(month));
			}
			System.out.println("----------");
		}
	}

	@Override
	public String toString() {
		String employeeInfo = String.format("name: %s, age: %d, type: %s",
				this.getName(), this.getAge(), this.getClass().getSimpleName());
		return employeeInfo;
	}

	@Override
	public int compareTo(Employee o) {
		return this.getName().compareTo(o.getName());
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Employee) {
			Employee employee = (Employee) obj;
			return this.name.equals(employee.getName())
					&& this.age == employee.getAge();
		}

		return false;
	}

	@Override
	public int hashCode() {
		int hashCode = this.name.hashCode() ^ this.age;
		return hashCode;
	}
}
