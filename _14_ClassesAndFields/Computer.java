package _14_ClassesAndFields;

public class Computer {
	private int year;
	private double price;
	private boolean isNotebook;
	private double hardDiskMemory;
	private double freeMemory;
	private String operationSystem;

	public Computer(int year, double price, boolean isNotebook,
			double hardDiskMemory, double freeMemory, String operationSystem) {
		if (year < 1936) {
			throw new IllegalArgumentException(
					"Year must be a positive number bigger than 1935"); // http://www.computerhope.com/issues/ch000984.htm
		} else {
			this.year = year;
		}
		if (price < 0) {
			throw new IllegalArgumentException(
					"Price must be a positive number");
		} else {
			this.price = price;
		}
		this.isNotebook = isNotebook;
		if (hardDiskMemory < 0) {
			throw new IllegalArgumentException(
					"Hard disc memory must be a positive number");
		} else {
			this.hardDiskMemory = hardDiskMemory;
		}
		if (freeMemory < 0) {
			throw new IllegalArgumentException(
					"Free memory must be a positive number");
		} else if (freeMemory > this.hardDiskMemory) {
			throw new IllegalArgumentException(
					"Free memory must be less than hard disc memory");
		} else {
			this.freeMemory = freeMemory;
		}
		this.operationSystem = operationSystem;
	}

	// public double getFreeMemory() {
	// return this.freeMemory;
	// }
	//
	// public void setFreeMemory(double freeMemory) {
	// this.freeMemory = freeMemory;
	// }

	public void changeOperationSystem(String newOperationSystem) {
		this.operationSystem = newOperationSystem;
	}

	public void useMemory(double memory) {
		if (memory > this.freeMemory) {
			System.out.println("Not enough free memory! You have "
					+ this.freeMemory + " free!");
		} else {
			this.freeMemory -= memory;
		}
	}

	public String toString() {
		return "Year of production: " + this.year + "; Price: " + this.price
				+ "; Is notebook: " + this.isNotebook + "; HardDisk memory: "
				+ this.hardDiskMemory + "; Free momery: " + this.freeMemory
				+ "; Operation system: " + this.operationSystem + ".";
	}
}
