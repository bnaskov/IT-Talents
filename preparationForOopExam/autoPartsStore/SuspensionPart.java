package preparationForOopExam.autoPartsStore;

public class SuspensionPart extends AutoPart {

	public SuspensionPart(String id, String name, double buyPrice,
			double sellPrice, Car[] cars, Manufacturer manufacturer)
			throws IllegalArgumentException {
		super(id, name, buyPrice, sellPrice, cars, manufacturer);
		this.categoryId = 1;
		this.categoryName = "Suspension Part";
	}

}
