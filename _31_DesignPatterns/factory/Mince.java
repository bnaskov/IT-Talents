package _31_DesignPatterns.factory;

public class Mince extends MeatProduct {
	private static final String NAME = "MINCE";

	Mince(double weight) {
		super(NAME, weight, IMeatProduct.Type.MINCE);
	}
}
