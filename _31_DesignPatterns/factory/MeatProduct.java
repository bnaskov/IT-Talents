package _31_DesignPatterns.factory;

public abstract class MeatProduct implements IMeatProduct {

	public MeatProduct(String name, double weight, Type type) {
		this.setName(name);
		this.setWeight(weight);
		this.setType(type);
	}

	private String name;
	private double weight;
	private Type type;

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getWeight() {
		return this.weight;
	}

	@Override
	public Type getType() {
		return this.type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return this.type.toString() + " " + this.name + " " + this.weight;
	}
}
