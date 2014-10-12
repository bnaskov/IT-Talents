package preparationForOopExam.agriculture;

public class SpecializedWorker extends Worker {
	private AgriculturalType specializedType;

	public SpecializedWorker(String name, String id, double fruitsPower,
			double vegetablesPower, AgriculturalType specializedType) {
		super(name, id, fruitsPower, vegetablesPower);
		this.specializedType = specializedType;
		if (this.specializedType.toString().equals("FRUITS")) {
			this.fruitsPower = this.fruitsPower * 1.2;
			this.vegetablesPower = this.vegetablesPower * 0.85;
		} else {
			this.vegetablesPower = this.vegetablesPower * 1.2;
			this.fruitsPower = this.fruitsPower * 0.85;
		}
	}

	@Override
	public double doWork(Area area, boolean hasStickWithNet)
			throws AreaException {
		if (hasStickWithNet
				&& area.getAgriculturalType().toString().equals("FRUITS")) {
			validateWorkDone(area, fruitsPower * 1.9);
			return fruitsPower * 1.9;
		} else {
			return this.doWork(area);
		}
	}

}
