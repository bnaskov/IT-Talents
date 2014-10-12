package preparationForOopExam.agriculture;

public class Area {
	private double areaSize;
	private AgriculturalType type;
	private double amount;

	public Area(double areaSize, AgriculturalType type, double amount)
			throws AreaException {
		this.setAreaSize(areaSize);
		this.setAgriculturalType(type);
		this.setAmount(amount);
	}

	public double getAreaSize() {
		return this.areaSize;
	}

	private void setAreaSize(double areaSize) throws AreaException {
		if (areaSize <= 0) {
			throw new AreaException("Area size must be a positive number.");
		}

		this.areaSize = areaSize;
	}

	public AgriculturalType getAgriculturalType() {
		return this.type;
	}

	private void setAgriculturalType(AgriculturalType type) {
		this.type = type;
	}

	public double getAmount() {
		return this.amount;
	}

	void setAmount(double amount) throws AreaException {
		if (amount < 0 || amount > this.areaSize * 100) {
			throw new AreaException(
					"Area size must be bigger than 0 and less or equal to area size * 100.");
		}

		this.amount = amount;
	}
}
