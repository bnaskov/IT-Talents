package _15_MethodsAndConstructors;

public class Computer {
	private int year;
	private double price;
	private boolean isNotebook;
	private double hardDiskMemory;
	private double freeMemory;
	private String operationSystem;

	public Computer() {
		this.isNotebook = false;
		this.operationSystem = "Win XP";
	}

	public Computer(int year, double price, double hardDiskMemory,
			double freeMemory) {
		this();
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
	}

	public Computer(int year, double price, boolean isNotebook,
			double hardDiskMemory, double freeMemory, String operationSystem) {
		this(year, price, hardDiskMemory, freeMemory);
		this.isNotebook = isNotebook;
		this.operationSystem = operationSystem;
	}

	public int comparePrice(Computer c) {
		if (this.price > c.price) {
			return -1;
		} else if (this.price < c.price) {
			return 1;
		} else {
			return 0;
		}
	}

	public static void compareComputerPrice(Computer computer1,
			Computer computer2) {
		System.out
				.println(computer1.comparePrice(computer2) == -1 ? "The first computer is more expensive than the second one!"
						: computer1.comparePrice(computer2) == 1 ? "The second computer is more expensive than the first one!"
								: "Both computers have equal price!");
	}

	// the following code is from the previous lecture
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
