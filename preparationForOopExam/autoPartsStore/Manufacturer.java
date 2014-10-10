package preparationForOopExam.autoPartsStore;

public class Manufacturer {
	private String name;
	private String country;
	private String address;
	private String phone;
	private String fax;

	Manufacturer(String name, String country, String address, String phone,
			String fax) throws IllegalArgumentException {
		Validation.ValidateForNullorEmpry(name);
		Validation.ValidateForNullorEmpry(country);
		Validation.ValidateForNullorEmpry(address);
		Validation.ValidateForNullorEmpry(phone);
		Validation.ValidateForNullorEmpry(fax);
		this.name = name;
		this.country = country;
		this.address = address;
		this.phone = phone;
		this.fax = fax;
	}

	@Override
	public String toString() {
		return this.name + " " + this.country;
	}
}
