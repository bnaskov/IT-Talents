package preparationForOopExam.autoPartsStore;

public class EnginePart extends AutoPart {

	public EnginePart(String id, String name, double buyPrice,
			double sellPrice, Car[] cars, Manufacturer manufacturer)
			throws IllegalArgumentException {
		super(id, name, buyPrice, sellPrice, cars, manufacturer);
		this.categoryId = 3;
		this.categoryName = "Engine Part";
	}

}
