package _26_;

public class Employee implements Comparable<Employee>{
	
	private String name;
	private int age;
	private double salary;
	private String id;
	
	public Employee(String name, int age, double salary, String id) {
		super();
		this.setName(name);
		this.setAge(age);
		this.setSalary(salary);
		this.setId(id);
	}
	
	public String getName() {
		return this.name;
	}
	
	private void setName(String name) {
		if (name.length() < 2) {
			throw new IllegalArgumentException("Employee name must be at least 2 symbols.");
		}
		
		this.name = name;
	}
	
	public int getAge() {		
		return this.age;
	}
	
	private void setAge(int age) {
		if (age <= 0 || age > 150) {
			throw new IllegalArgumentException("Employee age must be between 0 and 150.");
		}
		this.age = age;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public void setSalary(double salary) {
		if (salary < 0) {
			throw new IllegalArgumentException("Employee salary must be a positive number.");
		}
		
		this.salary = salary;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		if (id.length() < 2) {
			throw new IllegalArgumentException("Employee id must be at least 2 symbols.");
		}
		
		this.id = id;
	}
	
	@Override
	public String toString() {
		return this.getName();
	}

	@Override
	public int compareTo(Employee o) {		
		return this.getName().compareTo(o.getName());
	}
}
