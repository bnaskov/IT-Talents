package _16_AccessModifiers;

public class Employee {
	private String name;
	private Task currentTask;
	private double hoursLeft;

	public Employee(String name) {
		this.setName(name);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if (name.length() > 0) {
			this.name = name;
		} else {
			throw new IllegalArgumentException("The name cannot be empty!");
		}
	}

	public double getHoursLeft() {
		return this.hoursLeft;
	}

	public void setHoursLeft(double hoursLeft) {
		if (hoursLeft >= 0) {
			this.hoursLeft = hoursLeft;
		} else {
			throw new IllegalArgumentException(
					"Hours left must be a positive integer");
		}
	}

	public void setCurrentTask(String name, double workingHours) {
		this.currentTask = new Task(name, workingHours);
	}

	public void setCurrentTask(Task task) {
		this.currentTask = task;
	}

	public String getCurrentTaskName() {
		return this.currentTask.getName();
	}

	public double getCurrentTaskHours() {
		return this.currentTask.getWorkingHours();
	}

	public void work() {
		if (this.hoursLeft < currentTask.getWorkingHours()) {
			currentTask.setWorkingHours(currentTask.getWorkingHours()
					- this.hoursLeft);
			this.hoursLeft = 0;
		} else if (this.hoursLeft > currentTask.getWorkingHours()) {
			this.hoursLeft -= currentTask.getWorkingHours();
			currentTask.setWorkingHours(0);
		} else {
			this.hoursLeft = 0;
			currentTask.setWorkingHours(0);
		}
		showReport();
	}

	private void showReport() {
		System.out.println("Name of the worker: " + this.name
				+ "; name of the tast: " + currentTask.getName()
				+ "; hours left to work: " + this.hoursLeft
				+ "; hours untill the work is done: "
				+ currentTask.getWorkingHours() + ".");
	}
}
