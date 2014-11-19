package districtCourt;

public class Lawyer extends LegalPerson {

	public Lawyer(String name, int yearsInBusiness, int numberOfCases) {
		super(name, yearsInBusiness, numberOfCases);
	}

	public void setNumberOfCases(int numberOfCases) {
		if (numberOfCases < 10) {
			throw new IllegalArgumentException(
					"Number of cases must be a positive number greater than 9.");
		}

		this.numberOfCases = numberOfCases;
	}

}
