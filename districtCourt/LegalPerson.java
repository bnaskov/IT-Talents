package districtCourt;

public abstract class LegalPerson {
	private String name;
	protected int yearsInBusiness;
	protected int numberOfCases;

	public LegalPerson(String name, int yearsInBusiness, int numberOfCases) {
		super();
		this.setName(name);
		this.setYearsInBusiness(yearsInBusiness);
		this.setNumberOfCases(numberOfCases);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() < 2) {
			throw new IllegalArgumentException(
					"Legal person's name must be at least 2 symbols.");
		}

		this.name = name;
	}

	public int getYearsInBusiness() {
		return yearsInBusiness;
	}

	public void setYearsInBusiness(int yearsInBusiness) {
		if (yearsInBusiness < 0) {
			throw new IllegalArgumentException(
					"Years in business must be a positive number");
		}

		this.yearsInBusiness = yearsInBusiness;
	}

	public int getNumberOfCases() {
		return numberOfCases;
	}

	public void setNumberOfCases(int numberOfCases) {
		if (numberOfCases < 0) {
			throw new IllegalArgumentException(
					"Number of cases must be a positive number");
		}

		this.numberOfCases = numberOfCases;
	}

	@Override
	public String toString() {
		return String.format(
				"name: %s; years in business: %d; number of cases: %d; ",
				this.name, this.yearsInBusiness, this.numberOfCases);
	}
}
