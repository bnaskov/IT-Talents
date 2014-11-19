package districtCourt;

import java.util.List;

public class CriminalCase extends Case {
	private Prosecutor prosecutor;

	public CriminalCase(Defendant defendant, List<Witness> witnesses,
			Prosecutor prosecutor) {
		super(defendant, witnesses);
		this.setProsecutor(prosecutor);
	}

	public Prosecutor getProsecutor() {
		return prosecutor;
	}

	public void setProsecutor(Prosecutor prosecutor) {
		if (prosecutor == null) {
			throw new NullPointerException("Prosecutor cannot be null");
		}

		this.prosecutor = prosecutor;
	}
}
