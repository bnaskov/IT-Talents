package preparationForOopExam.autoPartsStore;

public class AccessoryPart extends AutoPart {

	public AccessoryPart(String id, String name, double buyPrice,
			double sellPrice, Car[] cars, Manufacturer manufacturer)
			throws IllegalArgumentException {
		super(id, name, buyPrice, sellPrice, cars, manufacturer);
		this.categoryId = 4;
		this.categoryName = "Accessory Part";
	}

}
