package preparationForOopExam.agriculture;

import java.util.ArrayList;

public class Worker {
	private static ArrayList<String> takenIds = new ArrayList<String>();
	private String name;
	private String id;
	private double fruitsPower;
	private double vegetablesPower;

	public Worker(String name, String id, double fruitsPower,
			double vegetablesPower) {
		if (name == null || name.length() < 2) {
			throw new IllegalArgumentException(
					"Name must be at least 2 characters.");
		}
		this.name = name;
		if (id == null || id.length() <= 1) {
			throw new IllegalArgumentException(
					"Id must be at least 2 characters.");
		}
		if (takenIds.toString().matches(".*\\b" + id + "\\b.*")) {
			throw new IllegalArgumentException("Id is already taken.");
		}
		this.id = id;
		takenIds.add(id);
		this.setFruitsPower(fruitsPower);
		this.setVegetablesPower(vegetablesPower);
	}

	protected double getFruitsPower() {
		return this.fruitsPower;
	}

	protected void setFruitsPower(double fruitPower) {
		if (fruitPower < 0) {
			throw new IllegalArgumentException(
					"Fruit power cannot be a negative number");
		}

		this.fruitsPower = fruitPower;
	}

	protected void setVegetablesPower(double vegetablesPower) {
		if (vegetablesPower < 0) {
			throw new IllegalArgumentException(
					"Fruit power cannot be a negative number");
		}

		this.vegetablesPower = vegetablesPower;
	}

	public double doWork(Area area) throws AreaException {
		if (area.getAgriculturalType().toString().equals("FRUITS")) {
			validateWorkDone(area, this.fruitsPower);
			return this.fruitsPower;
		} else {
			validateWorkDone(area, this.vegetablesPower);
			return this.vegetablesPower;
		}
	}

	public double doWork(Area area, boolean hasStickWithNet)
			throws AreaException {
		if (hasStickWithNet
				|| area.getAgriculturalType().toString().equals("FRUITS")) {
			validateWorkDone(area, fruitsPower * 1.6);
			return fruitsPower * 1.6;
		} else {
			return this.doWork(area);
		}
	}

	protected void validateWorkDone(Area area, double agriculturalPower)
			throws AreaException {
		if (area.getAmount() >= agriculturalPower) {
			area.setAmount(area.getAmount() - agriculturalPower);
		} else {
			area.setAmount(0);
		}
	}
}
