package preparationForOopExam.autoPartsStore;

public abstract class AutoPart {
	private String id;
	private String name;
	protected int categoryId;
	protected String categoryName;
	private double buyPrice;
	private double sellPrice;
	private Car[] cars;
	private Manufacturer manufacturer;

	public AutoPart(String id, String name, double buyPrice, double sellPrice,
			Car[] cars, Manufacturer manufacturer)
			throws IllegalArgumentException {
		Validation.ValidateForNullorEmpry(id);
		Validation.ValidateForNullorEmpry(name);
		Validation.ValidateForNegativeNumer(buyPrice);
		Validation.ValidateForNegativeNumer(sellPrice);

		this.id = id;
		this.name = name;
		this.buyPrice = buyPrice;
		this.sellPrice = sellPrice;
		if (cars == null) {
			throw new IllegalArgumentException(
					"Parameter 'cars' cannot be null.");
		}
		this.cars = cars;
		if (manufacturer == null) {
			throw new IllegalArgumentException(
					"Parameter 'manufacturer' cannot be null.");
		}
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		String carsToString = "";
		for (int i = 0; i < this.cars.length - 1; i++) {
			carsToString += this.cars[i].toString() + ", ";
		}
		carsToString += this.cars[this.cars.length - 1].toString();
		return String
				.format("%s : %s, buy price: %.2f, sell price: %.2f, manufacturer: %s, cars: %s.",
						this.categoryName, this.name, this.buyPrice,
						this.sellPrice, this.manufacturer.toString(),
						carsToString);
	}

}
