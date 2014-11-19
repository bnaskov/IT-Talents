package districtCourt;

public class Judge extends LegalPerson {

	public Judge(String name, int yearsInBusiness, int numberOfCases) {
		super(name, yearsInBusiness, numberOfCases);
	}

	public void setYearsInBusiness(int yearsInBusiness) {
		if (yearsInBusiness < 5) {
			throw new IllegalArgumentException(
					"Years in business must be at least 5!");
		}

		this.yearsInBusiness = yearsInBusiness;
	}

	@Override
	public String toString() {

		return (super.toString());
	}

}
