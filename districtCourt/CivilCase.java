package districtCourt;

import java.util.List;

public class CivilCase extends Case {
	private Accuser accuser;

	public CivilCase(Defendant defendant, List<Witness> witnesses,
			Accuser accuser) {
		super(defendant, witnesses);
		this.setAccuser(accuser);
	}

	public Accuser getAccuser() {
		return accuser;
	}

	public void setAccuser(Accuser accuser) {
		if (accuser == null) {
			throw new NullPointerException("Accusor cannot be null");
		}

		this.accuser = accuser;
	}
}
