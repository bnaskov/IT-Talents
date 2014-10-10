package preparationForOopExam.autoPartsStore;

public class Car {
	private String name;
	private String model;
	private int yearOfProduction;

	public Car(String name, String model, int yearOfProduction)
			throws IllegalArgumentException {
		Validation.ValidateForNullorEmpry(name);
		Validation.ValidateForNullorEmpry(model);
		Validation.ValidateForNullorEmpry(name);
		this.name = name;
		this.model = model;
		this.yearOfProduction = yearOfProduction;
	}

	@Override
	public String toString() {
		String fullInfo = this.name + " " + this.model + " "
				+ this.yearOfProduction;
		return fullInfo;
	}

}
