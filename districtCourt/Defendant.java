package districtCourt;

import java.util.ArrayList;
import java.util.List;

public class Defendant extends Citizen {
	private List<Lawyer> lawyers;

	public Defendant(String fullName, String address, int age) {
		super(fullName, address, age);
		this.lawyers = new ArrayList<Lawyer>();
	}

	public List<Lawyer> getLawyers() {
		return lawyers;
	}

	public void addLawyer(Lawyer lawyer) {
		if (lawyer == null) {
			throw new NullPointerException("Enter a valid lawyer.");
		}

		this.lawyers.add(lawyer);
	}
}
