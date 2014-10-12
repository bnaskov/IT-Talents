package preparationForOopExam.agriculture;

public class SpecializedWorker extends Worker {
	private AgriculturalType specializedType;

	public SpecializedWorker(String name, String id, double fruitsPower,
			double vegetablesPower, AgriculturalType specializedType) {
		super(name, id, fruitsPower, vegetablesPower);
		this.specializedType = specializedType;
		if (this.specializedType.toString().equals("FRUITS")) {
			this.setFruitsPower(fruitsPower * 1.2);
			this.setVegetablesPower(vegetablesPower * 0.85);
		} else {
			this.setVegetablesPower(vegetablesPower * 1.2);
			this.setFruitsPower(fruitsPower * 0.85);
		}
	}

	@Override
	public double doWork(Area area, boolean hasStickWithNet)
			throws AreaException {
		if (hasStickWithNet
				&& area.getAgriculturalType().toString().equals("FRUITS")) {
			validateWorkDone(area, getFruitsPower() * 1.9);
			return getFruitsPower() * 1.9;
		} else {
			return this.doWork(area);
		}
	}

}
