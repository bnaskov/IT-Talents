package _16_AccessModifiers;

public class Task {
	private String name;
	private double workingHours;

	public Task(String name, double workingHours) {
		this.setName(name);
		this.setWorkingHours(workingHours);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if (name.length() >= 3) {
			this.name = name;
		} else {
			throw new IllegalArgumentException(
					"The name of the tast must be at least 3 letters long!");
		}
	}

	public double getWorkingHours() {
		return this.workingHours;
	}

	public void setWorkingHours(double workingHours) {
		if (workingHours >= 0) {
			this.workingHours = workingHours;
		} else {
			throw new IllegalArgumentException(
					"Working hours must be a positive integer");
		}
	}
}
