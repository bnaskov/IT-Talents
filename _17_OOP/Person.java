package _17_OOP;

public class Person {
	private String name;
	private int age;
	private boolean isMale;

	public Person() {

	}

	public Person(String name, int age, boolean isMale) {
		this.setName(name);
		this.setAge(age);
		this.isMale = isMale;
	}

	protected String getName() {
		return this.name;
	}

	protected void setName(String name) {
		if (!name.isEmpty()) {
			this.name = name;
		} else {
			throw new IllegalArgumentException("The name cannot be empty!");
		}
	}

	protected int getAge() {
		return this.age;
	}

	protected void setAge(int age) {
		if (age >= 0 && age <= 130) {
			this.age = age;
		} else {
			throw new IllegalArgumentException(
					"The age must be in the interval [0..130]");
		}
	}

	protected boolean isMale() {
		return this.isMale;
	}

	protected void showPersonInfo() {
		System.out.printf("Name: %s, age: %d, isMale: %b%n", this.getName(),
				this.getAge(), this.isMale());
	}
}
