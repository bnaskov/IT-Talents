package _31_DesignPatterns.factory;

public class SlaughterHouse {
	private static final SlaughterHouse instance = new SlaughterHouse();
	private static final int maxWeightForChickenSteak = 30;

	private SlaughterHouse() {
	}

	public static SlaughterHouse getInstance() {
		return instance;
	}

	public IMeatProduct produceFood(IMeatProduct.Type type, double weight) {
		switch (type) {
		case MINCE:
			Mince mince = new Mince(weight);
			return mince;
		case STEAK:
			Steak steak = null;
			if (weight >= maxWeightForChickenSteak) {
				steak = new Steak(Steak.STEAK_NAMES.CHICKEN, weight);
			} else {
				steak = new Steak(Steak.STEAK_NAMES.BEEF, weight);
			}
			return steak;
		default:
			throw new Error("No such product");
		}
	}

}
