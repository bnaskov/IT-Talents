package _31_DesignPatterns.factory;

public interface IMeatProduct {
	enum Type {
		STEAK, SAUSAGE, MINCE, GUTS, FILLET
	}

	String getName();

	double getWeight();

	Type getType();

}
