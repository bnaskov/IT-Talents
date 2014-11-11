package _31_DesignPatterns.factory;

public class Steak extends MeatProduct {

	public enum STEAK_NAMES {
		PORK, CHICKEN, BEEF
	}

	Steak(STEAK_NAMES name, double weight) {
		super(name.toString(), weight, IMeatProduct.Type.STEAK);

	}
}
