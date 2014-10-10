package preparationForOopExam.autoPartsStore;

public class TyrePart extends AutoPart {

	public TyrePart(String id, String name, double buyPrice, double sellPrice,
			Car[] cars, Manufacturer manufacturer)
			throws IllegalArgumentException {
		super(id, name, buyPrice, sellPrice, cars, manufacturer);
		this.categoryId = 2;
		this.categoryName = "Type part";
	}

}
